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
			
			int left=0;
			int right=arr.length-1;
			
			while(left < right)
			{
				int sum=arr[i]+arr[left]+arr[right];
				
				if(sum==0)
				{
					result.add(Arrays.asList(arr[i],arr[left],arr[right]));
					
					//skip if the value is duplicate for left and right..........
				}
				
			}
		}
		
		
		
		
		
		
		
		return result;
		
		
		
	}

}
