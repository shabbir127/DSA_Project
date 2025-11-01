package com.sk.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPractice1 {
	
	public static List<List<Integer>> TripletsEqualZero(int[] arr)
	{
		List<List<Integer>> result=new ArrayList<>();
		
		Arrays.sort(arr);
		
		//for to move i to arr.length-2....
		for(int i=0 ;i < arr.length-2 ;i++)
		{
			if( i > 0  && arr[i] == arr[i-1])
			{
				continue;
			}
			
			int left=i+1;
			int right=arr.length-1;
			
			while(left < right)
			{
				int sum=arr[i]+arr[left]+arr[right];
				
				if(sum==0)
				{
					result.add(Arrays.asList(arr[i],arr[left],arr[right]));
					
					//skip if the value is duplicate for left and right..........
					while(left < right && arr[left]==arr[left+1])
					{
						left++;
					}
					
					while(left < right && arr[right]== arr[right-1])
					{
						right--;
					}
					
					left ++;
					right --;
				}else if (sum > 0) {
					right--;
				}else {
					left ++;
				}
				
			}
		}

		return result;
	}
	
	
	
	
	//threeSum (TripletsSum) cloest to target.....
	
	
	
	
	
	
	
public static void main(String[] args) {
	int[] arr1 = {-1, 0, 1, 2, -1, -4};
	System.out.println(TripletsEqualZero(arr1));
}
}
