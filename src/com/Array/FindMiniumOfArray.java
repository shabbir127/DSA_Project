package com.Array;

public class FindMiniumOfArray {
	
	public static int findMinimum(int arr[])
	{
		int minimum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if (arr[i] < minimum) {
				minimum = arr[i];
			}
		}
		return minimum;
	}

	public static void printArray(int[] arr)
	{
	  for(int i=0; i<arr.length;i++)
	  {
		System.out.print(arr[i]+ " ");  
	  }
	  System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[]= {5,9,3,15,1,2};
		printArray(arr);
		System.out.println("The Minimum value is "+findMinimum(arr));
		
	}
}
