package Algorithms;

public class QueueUsingLinkedList {
	private Node front;
	private Node rear;
	public int len=0;
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data=data;
			this.next=null;
		}
	}
	public void enQueue(Object data)
	{
		if(front==null)
		{
			rear=new Node(data);
			front=rear;
		}
		else
		{
			Node newNode=new Node(data);
			rear.next=newNode;
			rear=rear.next;
		}
		len++;
	}
	public Object deQueue() {
		if(front!=null) {
			Object res=front.data;
			front=front.next;
			
			len--;
			return res;
		}
		return null;
	}
	public int size() {
		return len;
	}
	
	public void display() {
		Node current=front;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		QueueUsingLinkedList q=new QueueUsingLinkedList();
		q.enQueue(12);
		q.enQueue(45);
		q.enQueue(89);
		q.enQueue(79);
		q.display();
		System.out.println(q.deQueue());
		q.display();
	}
	

}
