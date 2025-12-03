package com.sk.practice;

public class StringQuestion {

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
		 
		 
		 
		 
		 
	}
}
