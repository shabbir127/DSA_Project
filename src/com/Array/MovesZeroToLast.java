package com.Array;

public class MovesZeroToLast {
	
	public static int [] moveZero(int arr[])
	{
		int j=0;
		for(int i=0; i < arr.length;i++)
		{
			if(arr[i] != 0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j] !=0)
			{
				j++;
			}
		}
		return arr;
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
		int arr[]= {0,3,5,6,0,2,5,7,3};
		printArray(arr);
		printArray(moveZero(arr));
	}
}
