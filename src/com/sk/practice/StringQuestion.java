package com.sk.practice;

public class StringQuestion {

	public static boolean palindonecheck()
	{
		String str="helloe";
		int i=0; int j=str.length()-1;
		 while(i < j)
		 {
			 if (str.charAt(i) != str.charAt(j)) {
				System.out.print("not a palindrome ");
				return false;
			}
			 i++;
			 j--;
			
		 }
		 return true;
	}
	public static void main(String[] args) {
		String str="Hello";
		 char [] chArr=str.toCharArray();
		 
		 for(int i=chArr.length-1;i>=0;i--)
		 {
			 System.out.print(chArr[i]);
		 }
	
		 System.out.println("");
		 StringBuffer sBuffer=new StringBuffer(str);
		 System.out.println(sBuffer.reverse());
	
		 String revString="";
		 for(int i=0;i< str.length();i++)
		 {
			 revString=chArr[i] + revString;
		 }
		 System.err.println(revString);
		 
		
		 StringBuilder sb1=new StringBuilder();
		 str.chars().distinct().forEach(c->sb1.append((char)c));
		 System.out.println(sb1);
		 
		 
		 StringBuilder sb2=new StringBuilder();
		 for(int i=0;i<str.length();i++)
		 {
			 char ch=str.charAt(i);
			 int idx=str.indexOf(ch,i+1);
			 if (idx == -1) {
				sb2.append(ch);
			}
		 }
		 System.out.println(sb2);
		 
		 boolean result=palindonecheck();
		 System.out.println(result);
	}
}
