package com.Array;

public class FindSecondMaxInArray {
	
	public static int secondMax(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0; i < arr.length ;i++)
		{
			if (arr[i] > max) {
			
				secondMax=max;
				max=arr[i];
			}else if (arr[i] > secondMax && arr[i] != max) {
				secondMax=arr[i];
			} 
		}

		return secondMax;
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
		int arr[]= {13,34,2,24,34,33,1};
		printArray(arr);
		System.out.println("SecondMax value is "+secondMax(arr) );
		
		
		
	}

}
