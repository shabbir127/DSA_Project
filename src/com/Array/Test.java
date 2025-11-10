package com.Array;

public class Test {
	
	public static void pandilrome(String[] arr)
	{
		int i=0;
		int j=arr.length-1;
		boolean flag=true;
		while(i< j)
		{
			if(arr[i] == arr[j])
			{
				i++;
				j--;
			}else {
				System.out.println("given Strimg is not pandrome");
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println("given Strimg is pandrome");	
		}
		
	}
	
	
	
	//palindrome check whether the string with exclude the alphanumeric will be ignored.
	public static boolean isPalindrome(String s)
	{
		int i=0;
		int j=s.length() -1;
		
		while(i < j) 
		{
			int left=s.charAt(i);
			int right=s.charAt(i);
			
			
			if(!Character.isLetterOrDigit(left))
			{
				i=i++;
			}
			if(!Character.isLetterOrDigit(right))
			{
				j=j++;
			}
			if (Character.isLowerCase(left) != Character.isLowerCase(right)) {
				return false;
			}
			
			i++;
			j++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] arr= {"l","e","v","e","l"};
		pandilrome(arr);
		
		
	}

}
