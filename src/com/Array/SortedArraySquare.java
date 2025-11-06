package com.Array;

public class SortedArraySquare {
	
	public static int[] sortedSquare(int[] arr)
	{
		
		int n=arr.length;
		int left=0;
		int right=n-1;
		int index=n-1;
		int[] result=new int[n];
		
		while(left <= right)
		{
			int leftsquare=arr[left]*arr[left];
			int rightsqaure=arr[right]*arr[right];
			
			if (leftsquare <= rightsqaure) {
				result[index]=rightsqaure;
				right--;
			}else {
				result[index]=leftsquare;
				left++;
			}
			index--;
		}
		return result;  
	}
	public  static void Traversal(int arr[])
	{
		for(int i=0;i < arr.length ;i++)
		{
			System.out.print(" "+ arr[i]);
		}
		
	}

	public static void main(String[] args) {
		int num[]= {-4,-1,0,3,10};
		Traversal(sortedSquare(num));
	}
}
