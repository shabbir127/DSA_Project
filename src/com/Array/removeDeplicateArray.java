package com.Array;

public class removeDeplicateArray {
	
	//
	public static int removeDuplicates(int[] arr)
	{
		int next=1;
		
		for(int i=1;i < arr.length ;i++)
		{
			if(arr[i] != arr[i-1])
			{
			arr[next]=arr[i];
			next++;
			}
		}
		
		return next;
	}
	
	public static int[] removeDuplicatesAdd(int[] nums)
	{
		int j=0;
		
		for(int i=2;i < nums.length ;i++)
		{
			if (nums[j] != nums[i-2]) {
			    nums[i] = nums[j];
			    i++;
			}
		}
		
		return nums;
	
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,3,4,4,5,5,6};
		int result=removeDuplicates(arr);
		System.out.println("result "+result);
	}

}
