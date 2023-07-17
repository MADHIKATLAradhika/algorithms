package Algorithms;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args)
	{
		int arr[]= {23,67,84,78,34,234};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		int up=(arr.length)-1;
		int mid;
		int search=34;
		int low=0;
		boolean flag=true;
       while(low<=up)
       {
    	   mid=low+up/2;
    	   if(arr[mid]==search) {
    		   System.out.println("Element found at "+(mid+1));
    		   flag=false;
    		   break;
    	   }
    	   else if(arr[mid]>search)
    		   up=mid-1;
    	   else if(arr[mid]<search)
    		   low=mid+1;
    	   
       }
       if(flag)
    	   System.out.println("Element not found");
			
	}

}
