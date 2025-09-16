package com.Array;

public class RemoveEvenIntegerFromArray {

	public int[] RemoveEvenIntegersFromArray(int [] arr)
	{
	       int oddCount=0;
	       for(int i=0;i<arr.length;i++)
	       {
	    	   if(arr[i]%2!=0)
	    	   {
	    		   oddCount++;
	    	   }
	       }
	       
	       int []result =new int[oddCount];
	       
	       int idx=0;
	       
	       for(int i=0;i<arr.length;i++)
	       {
	    	   if(arr[i]%2!=0)
	    	   {
	    		 result[idx]=arr[i];
	    		 idx++;
	    	   }
	       }   
		
		return result;
	}
	
	
	void printArray(int arr[])
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
	}
	
	
	public static void main(String args[])
	{
		RemoveEvenIntegerFromArray remove=new RemoveEvenIntegerFromArray();
		int arr[]= {3,2,4,7,10,6,5};
		remove.printArray(arr);
		//remove.RemoveEvenIntegersFromArray(arr);
		remove.printArray(remove.RemoveEvenIntegersFromArray(arr));
	}
}
