package com.Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumwithMAP {

	public static int[] twoSum(int[] num, int target)
	{
		Map<Integer, Integer>map=new HashMap<>();
		
		for(int i=0;i< num.length;i++)
		{
			int lookfor=target-num[i];
			if(map.containsKey(lookfor))
			{
				System.out.println(map.get(lookfor));
				return new int[]{
				i,
				map.get(lookfor)};
			}
			map.put(num[i],i);
		}
		
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,7,11,15};
		int target = 9;
		twoSum(nums, target);
	}
	
	
}
