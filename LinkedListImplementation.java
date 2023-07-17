package Algorithms;

public class LinkedListImplementation {
	class Node
	{
		 public String data;
		 public Node next;
		 

	     public Node(String data)
	    {
		 this.data=data;
		 this.next=null;
	    }

		
	}
	Node head=null;
	int size=0;
	 public void addFirst(String data)
	 {
		 Node newNode=new Node(data);
		 if(head==null)
		 {
			head=newNode;
			return;
		 }
		 newNode.next=head;
		 head=newNode;
		 size++;
	 }
	 public void addLast(String data)
	 {
		 Node newNode=new Node(data);
		 if(head==null)
		 {
			 head=newNode;
				return;
		 }
		 Node currentNode=head;
		 while(currentNode!=null)
		 {
			 currentNode=currentNode.next;
		 }
		 currentNode=newNode;
		 System.out.println("Last node is "+currentNode.data);
		 size++;
	 }
	 public void deleteFirst()
	 {
		 if(head==null)
		 {
			 System.out.println("List is empty");
			 return;
		 }
		 head=head.next;
		 size--;
	 }
	 public void deleteLast()
	 {
		 if(head==null)
		 {
			 System.out.println("List is empty");
			 return;
		 }
		 if(head.next==null)
		 {
			 head=null;
			 return;
		 }
		 Node secondLast=head;
		 Node lastNode=head.next;
		 while(lastNode.next!=null)
		 {
			 lastNode=lastNode.next;
			 secondLast=secondLast.next;
			 
		 }
		 secondLast=null;
		 size--;
	 }
	 public void find(String item)
	 {
		 Node current=head;
		 boolean flag=true;
		 while(current.next!=null)
		 {
			 if(current.data.equals(item)) {
				 System.out.println("Item is found");
				 flag=false;
				 return;
			 }
		}
		 if(flag)
			 System.out.println("Item not found");
	}
	 public void printResult()
		{
			Node current=this.head;
			if(head==null)
			{
				System.out.println("List is empty");
				return;
			}
			while(current.next!=null)
			{
				System.out.println(current.data+"->");
				current=current.next;
			}
			System.out.println("null");
		}
	 public static void main(String[] args)
	 {
		 LinkedListImplementation ll=new LinkedListImplementation();
		 ll.addFirst("Hi");
		 ll.addFirst("Radhika");
		 ll.addFirst("come");
		 ll.addLast("college");
		 ll.printResult();
		 ll.deleteLast();
		 ll.deleteFirst();
		 ll.find("Radhika");
		 ll.printResult();
		 
	 }

}
