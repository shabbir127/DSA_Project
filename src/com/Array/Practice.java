package com.Array;


public class Practice {
	
	//remove Even element for array...
	public static int[] removeEven(int arr[]) {
		
		int oddCount = 0;
		for(int i=0; i < arr.length;i++ )
		{
			if (arr[i] %2 !=0) {
				oddCount ++;
			}
		}
		
		
		int [] result =new int[oddCount];
		int idx=0;
		for(int i=0; i < arr.length ;i++ )
		{
			if (arr[i] % 2 !=0) {
				result[idx]= arr[i];
				idx ++;
			}
		}
		return result;
	}
	
	//print array....
	static void printArray(int arr[])
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+ " ");
		 }
		 System.out.println();
	}
	
	
	//Reverse Array
	static int[] ReverseArray(int number[],int start , int end)
	{
		while(start < end)
		{
			int temp = number[start];
			number[start]=number[end];
			number[end]=temp;
			start ++;
			end --;
		}
		
		return number;
	}
	
	//Minimum Value...
	public static int minimumValue(int arr[])
	{
		int min=arr[0];
		for(int i=0 ;i < arr.length ;i++)
		{
			if(arr[i] < min) //
			{
				min=arr[i];
				System.out.println(arr[i]);
			}
		}
		return min;
	}
	
	
	
	//finding the second maximum numbers.
	
	public static int secondMax(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length ;i++)
		{
			if(arr[i]> max)
			{
				secondMax=max;
				max=arr[i];
				
			}else if (arr[i] > secondMax && arr[i] != max) {
				
				secondMax=arr[i];
			}
		}
		return secondMax;
	}
	
	
	//move all zero to last... 
	
	public static void moveZeros(int arr[])
	{
		int j=0;
		for(int i=0 ; i < arr.length ;i++ )
		{
			if(arr[i] != 0 && arr[j] == 0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			if(arr[j] != 0)
			{
				j++;
			}
		}
		printArray(arr);
		
		
	}
	//resize of array
	public static void reSize(int arr[], int capacity)
	{
		int temp[]= new int[capacity];
		for(int i=0; i< arr.length ;i++)
		{
			temp[i]= arr[i];
		}
		arr=temp;
		
		printArray(arr);
	}
	
	//Find the missing Number...
	 public static int missingNumber(int arr[])
	 {
		 int n=arr.length+1;
		 int sum= n*(n+1)/2;
		 for(int num :arr)
		 {
			 sum=sum-num;
		 }
		 
		 return sum;
	 }
	
	 //to check the given String is Palindrome .....
	 public static boolean isPalindrome(String word)
	 {
		 char[] charArray= word.toCharArray();
		 int start =0;
		 int end=word.length()-1;
		 while(start < end)
		 {
			 if(charArray[start] != charArray[end])
			 {
				 return false;
			 }
			 start ++;
			 end --;
		 }
		 return true;
	 }
	
	 //linked list....
	 public class SingleLinkedList{
		 
		 private ListNode head;
		 
		 private static class ListNode{
			 private int data;
			 private ListNode next;
			 
			 public ListNode(int data)
			 {
				 this.data=data;
				 this.next=null;
			 } 
        
		 }	 
	 }
	

	 
// main method...
	public static void main(String[] args) {
		int[] arr= {7,4,0,3,5,0,0,2,9,0,1,13,6,10};
		int[] arr1= {1,2,3,8,5,4,6};
		printArray(removeEven(arr));
		String string="madam";
		
		System.out.print("orginal Array:- ");
		printArray(arr);
		System.out.print("Reverse Array:- ");
		printArray(ReverseArray(arr,0,arr.length-1));
		
		System.out.println("Minimumof Array :- "+ minimumValue(arr));
		
		int secondMaxValue=secondMax(arr);
		System.out.println("Second max value: - "+ secondMaxValue);
		
		System.out.print("Move all zeros to last :- ");
		moveZeros(arr);
		
		System.out.print("ReSize of array : -");
		reSize(arr, arr.length * 2);
		
		System.out.print("Missing Number of array :- "+ missingNumber(arr1));
		System.out.println("array length:- "+ arr1.length);
		
		System.out.print("The Given String is Palindrome :- "+ isPalindrome(string));
		
		
		
		
		
		
		
		
	}
}
