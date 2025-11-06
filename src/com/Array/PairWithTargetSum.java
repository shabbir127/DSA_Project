package com.Array;

public class PairWithTargetSum {

	//numbers = [2,7,11,15], target = 9
	public static int [] PairWithTargetSumSolution(int[] arr,int target)
	{
		int left= 0;
		int right=arr.length-1;
		
		while(left < right)
		{
			int sum=arr[left] + arr[right];
			
			//System.out.println(sum);
			if (sum == target) {
				
				return new int[]{left+1, right+1};
			}else if(sum < target) {
				left++;
			}else {
				right --;
			}
		}		
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		 int arr[]= {3,7,11,15};
		 int target=9;
		int result[]= PairWithTargetSumSolution(arr, target);
		System.out.println("Result indexes are "+ result[0] + " " +result[1]);
		 
	}
}
