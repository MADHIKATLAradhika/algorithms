package Algorithms;

public class SelectionSort {
	public static void main(String[] args)
	{
		int arr[]= {2,1,3,2,5,4,9};
		int min,temp;
		for(int i=0;i<arr.length-1;i++)
		{
			min=arr[i];
			for(int j=i+1;j<arr.length-i-1;j++)
			{
				if(min>arr[j])
				{
					arr[i]=arr[j];
					arr[j]=min;
					
				
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

}
