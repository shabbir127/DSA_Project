package com.Array;

public class Solution {
	
	public static boolean palindromeHelper(int i, int j,String s)
	{
		while(i< j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static boolean validpalindrome(String s)
	{
		int i=0;
		int j=s.length()-1;
		
		while(i< j)
		{
			char left=s.charAt(i);
			char right=s.charAt(j);
			
			if(left != right)
			{
				//use the superpower to delete and check the palindrome.
				return palindromeHelper(i+1, j, s) || palindromeHelper(i, j-1, s);
			}else {
				i++;
				j--;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String string="abbxa";
		boolean result=validpalindrome(string);
		System.out.println("Result:- "+result);
	}
}
