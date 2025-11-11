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
			char left=s.charAt(i);
			char right=s.charAt(j);
			
			
			if(!Character.isLetterOrDigit(left))
			{
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(right))
			{
				j--;
				continue;
			}
			if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
				return false;
			}
			
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String[] arr= {"l","e","v","e","l"};
		pandilrome(arr);
		boolean result=isPalindrome("A man, a plan, a canal: Panama");
		System.out.println("result:- "+ result);
	}

}
