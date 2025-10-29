package com.sk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayWithPratyushSet1 {
	
	//Remove Duplicates (easy)
	public static void RemoveDuplicate(int arr[])
	{
		int ofc=0;
		int cm=1;
		int placed=1;
		
		//1,1,1,2,2,2,3,3,3,3,4,4,5,6,6
		while(cm < arr.length-1)
		{
			if(arr[ofc] == arr[cm])
			{
				cm++;
				continue;
			}
			ofc++;
			arr[ofc]=arr[cm];
			cm++;
			placed++;
			
		}
		//only print unique elements..
		for(int i=0;i<placed;i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println("Total unqiue placed aquire "+ placed);
	}
	
	//pair found in sorted array....(easy)
	public static void PairSum(int[] arr)
	{
        int target=21;
        int start=0;
        int end=arr.length-1;
        boolean flag=false;
        while(start < end)
        {
        	int sum=arr[start]+arr[end];
        	if(target ==sum)
        	{
        		System.out.println("Pair found "+ sum);
        		flag=true;
        		break;
        	}else if(target > sum)
        	{
        		start ++;
        	}
        	else {
				end --;
			}
        }
        if (!flag) {
			System.out.println("Pair not found: ");
		}
        
	}
	
	//Squaring sorted Array with positive and negative numbers present....
	public static void squaringArray(int[] arr)
	{
		int n=arr.length;
		int index=n-1;
		int result[] =new int[n];
		int left=0;
		int right=n-1;
		
		while(left <= right)
		{
			int leftSquare=arr[left]* arr[left];
			int rightSqaure=arr[right] * arr[right];
			
			System.out.println("sqauring " + leftSquare + " "+rightSqaure);
			
			if(leftSquare <= rightSqaure)
			{
				result[index]=rightSqaure;
				right--;
			}else {
				result[index]=leftSquare;
				left ++;
			}
			index--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(result[i] +"  ");
		}
		
	}
	
	
	
	//3Sum
	public static List<List<Integer>> ThreeSum(int [] arr)
	{
		//List<List><Integer> result=new ArrayList<>();
		 List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length-2;i++)
		{
			if(i>0 && arr[i]==arr[i-1])
			{
				continue;
			}
			int left=i+1;
			int right=arr.length-1;
			while(left < right)
			{
				int sum=arr[i]+arr[left]+arr[right];
				if (sum==0) {
					result.add(Arrays.asList(arr[i],arr[left],arr[right]));
				while(left < right && arr[left]==arr[left+1])
				{
					left++;
				}
				while(left < right && arr[right] == arr[right-1])
				{
					right--;
				}
				
				left++;
				right--;
				
				}else if(sum > 0) {
					right --;
				}else {
					left ++;
				}
			}
			
		}
		return result;
  	
	}
	
	//#sum closest to target....
	public static int ThreeSumClosest(int[] arr, int target)
	{
	
		Arrays.sort(arr);
		int n=arr.length;
		int closestSum=arr[0]+arr[1]+arr[2];
		for(int i=0; i < n ;i++)
		{
			int left=i+1;
			int right=n-1;
			
			while(left < right )
			{
				int CurrentSum=arr[i]+arr[left]+arr[right];
				if(Math.abs(CurrentSum -target) < Math.abs(closestSum-target))
				{
					closestSum=CurrentSum;
				}
				if (CurrentSum < target) {
					left ++;
				}else {
					right --;
				}
			}
			
		}
		
		return closestSum;
		
		
	}
	
	
	
	
	//main
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,3,3,3,4,4,5,6,6,19};
		int[] arr1= {-4,-1,0,3,10};
		int [] nums= {-1,0,1,2,-1,-4};
//		RemoveDuplicate(arr);
//		PairSum(arr);
//      squaringArray(arr1);
		System.out.println(ThreeSum(nums));
		
		
	}

}
