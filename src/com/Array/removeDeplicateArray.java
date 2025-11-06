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
	
	public static void removeDuplicatesAdd(int[] nums)
	{
		int i=2;
		
		for(int j=2;j < nums.length ;j++)
		{
			System.out.println(nums[j] != nums[i-2]);
			System.out.println(j + " "+ (i-2));
			if (nums[j] != nums[i-2]) {
				
			    nums[i] = nums[j];
			    
			    i++;
			}
		}
		
		 Traversal(nums);
	
	}
	
	 //static Scanner sc=new Scanner(System.in);
		public  static void Traversal(int arr[])
		{
			for(int i=0;i < arr.length ;i++)
			{
				System.out.print(" "+ arr[i]);
			}
			
		}
	
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,3,3,3,3,4,4,4,5,5};
		//int result=removeDuplicates(arr);
		//System.out.println("result "+result);
		removeDuplicatesAdd(arr);
	}

}
