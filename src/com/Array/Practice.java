package com.Array;


public class Practice {
	
	//remove Even element for array...
	public static int[] removeEven(int arr[]) {
		
		int oddCount = 0;
		for(int i=0; i < arr.length;i++ )
		{
			if (arr[i] %2 !=0) {
				oddCount ++;
			}
		}
		
		
		int [] result =new int[oddCount];
		int idx=0;
		for(int i=0; i < arr.length ;i++ )
		{
			if (arr[i] % 2 !=0) {
				result[idx]= arr[i];
				idx ++;
			}
		}
		return result;
	}
	
	static void printArray(int arr[])
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
	}
	
	
	//Reverse Array
	static int[] ReverseArray(int number[],int start , int end)
	{
		while(start < end)
		{
			int temp = number[start];
			number[start]=number[end];
			number[end]=temp;
			start ++;
			end --;
		}
		
		return number;
	}
	
	//Minimum Value...
	public static int minimumValue(int arr[])
	{
		int min=arr[0];
		for(int i=0 ;i < arr.length ;i++)
		{
			if(arr[i] < min) //
			{
				min=arr[i];
				System.out.println(arr[i]);
			}
		}
		return min;
	}
	

	public static void main(String[] args) {
		int[] arr= {7,4,3,5,2,9,1,13,6};
		
		printArray(removeEven(arr));
		System.out.print("orginal Array:- ");
		printArray(arr);
		System.out.print("Reverse Array:- ");
		printArray(ReverseArray(arr,0,arr.length-1));
		
		System.out.println(minimumValue(arr));
		
	}
}
