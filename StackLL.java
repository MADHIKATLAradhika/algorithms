package Algorithms;
class StackLL {
	class node{
		int value;
		node next;
		public node(int value) {
			this.next=null;
			this.value=value;
		}
	}
	int size=0;
	node head=null;
	node tail=null;
	public void push(int data)
	{
		node n1=new node(data);
		if(head==null)
		{
			head=n1;
		}
		 n1.next=head;
		 head=n1;
		 size++;
	}
//	public void push(int data)
//	{
//		node node1=new node(data);
//		if(size==0)
//		{
//			head=node1;
//			tail=node1;
//		}
//		else
//		{
//			tail.next=node1;
//			node1.next=null;
//		}
//		
//	}
//	1.Tranverse the list
//	2.current.next == null
	
	public void pop()
	{
		if(head==null)
		 {
			 System.out.println("List is empty");
			 return;
		 }
		 head=head.next;
        this.size-=1;
	}
	 public void printResult()
		{
			node current=head;
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			for(int i=0;i<size;i++)
			{
				System.out.print(current.value+" -> ");
				current=current.next;
			}
			System.out.println("null");
		}
	public static void main(String[] args)
	{
		StackLL s=new StackLL();
		s.push(23);
		s.push(45);
		s.push(49);
		s.printResult();
		s.pop();
		s.pop();
		s.printResult();
		
	}

}
