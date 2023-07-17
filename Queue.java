package Algorithms;

public class Queue {
	int front;
	int rear;
	int size;
	private Object queuearray[];
	Queue(int size)
	{
		this.front=0;
		this.rear=0;
		queuearray=new Object[size];
	}
	public void enqueue(Object value)
	{
		if(front==rear)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queuearray[front]=value;
			front++;
		}
	}
	public Object dequeue()
	{
		if(front==0)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else if()
	}

}
