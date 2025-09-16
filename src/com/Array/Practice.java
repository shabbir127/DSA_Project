package com.Array;


public class Practice {
	
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

	public static void main(String[] args) {
		int[] arr= {2,4,3,5,7,9,1,13,6};
		
		printArray(removeEven(arr));
		
	}
}
