package Algorithms;

public class Searching {
	public static void main(String[] args)
	{
		int arr[]= {1,2,5,6,43,567,435,23};
		int search=4358;
		boolean flag=true;
		for(int i=0;i<arr.length;i++) 
			if(arr[i]==search) {
				System.out.println("Element find at "+(i+1));
				flag=false;
				break;
			}
		if(flag)
			System.out.println("No find");
			
	}

}
