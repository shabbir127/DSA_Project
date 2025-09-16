
package com.Array;

public class ReSizeOfArray {
	

	public static int[] resize(int[] arr, int capacity)
	{
		int [] temp=new int[capacity];
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}
	
	
	public static void printArray(int[] arr)
	{
	  for(int i=0; i<arr.length;i++)
	  {
		System.out.print(arr[i]+ " ");  
	  }
	  System.out.println();
	}
	
	
	public static int findMissingNumber(int [] arr)
	{
		int n=arr.length + 1;
	    int sum=n*(n+1)/2;	
	    for(int num : arr)
	    {
	    	sum=sum-num;
	    }
	    
		return sum;
	}
	
	
	public static void main(String[] args) {
		int Orginal[]= {1,4,2,5};
		printArray(Orginal);
	    printArray(resize(Orginal, Orginal.length*2));
	    System.out.println(findMissingNumber(Orginal)
	    		);
	}
}
