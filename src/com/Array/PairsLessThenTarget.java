package com.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PairsLessThenTarget {

	public static int pairs(List<Integer> nums, int target)
	{
		Collections.sort(nums);
		int i=0;
		int j=nums.size()-1;
		
		int count=0;
		
		while(i<j)
		{
			int sum=nums.get(i)+nums.get(j);
			if(sum < target)
			{
				count=count + (j-i);
				i++;				
			}else {
				j--;
			}
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
	    //List<Integer> nums = List.of(-1,1,2,3,1); 
		List<Integer> nums = new ArrayList<>(List.of(-1, 1, 2, 3, 1));

		int target = 2;
		
		int result=pairs(nums, target);
		System.out.println("Result "+ result);
	}
}
