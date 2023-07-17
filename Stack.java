package Algorithms;

public class Stack {
	int size,top;
	private Object[] stackarray;
	Stack(int size)
	{
		this.size=size;
		this.top=-1;
		stackarray=new Object[size];
	}
	public Object push(Object value)
	{
		if(top==size-1)
		{
			System.out.println("Stack is full");
			return -1;
		}
		top++;
		stackarray[top]=value;
		return stackarray[top];
		
	}
	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	public Object pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			
			Object value=stackarray[top];
			int oldtop=top;
			top--;
			stackarray[oldtop]=null;
			return value;
		
		}
		
	}
	public void print()
	{
		System.out.println("Stack is ");
		for(int i=0;i<=top;i++)
		{
			System.out.println(stackarray[i]);
		}
	}
	public Object peek()
	{
		return stackarray[top];
	}
	public static void main(String[] args)
	{
		Stack st=new Stack(10);
		st.push(20);
		st.push(98);
		st.push(90);
		st.push(45);
		st.push(20);
		st.push(98);
		st.push(90);
		st.push(45);
		st.push(20);
		st.push(98);
		st.print();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.print();
		System.out.println(st.peek());
	}
}
