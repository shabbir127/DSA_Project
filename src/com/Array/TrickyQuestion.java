package com.Array;

public class TrickyQuestion {

	static void  print()
	{
		
		try {
			M1();
		} catch (Exception e) {
			System.out.println("Exception handle in main catch");
		}
	}
	
	
	static int tryblock()
	{
		int x=1;
		try {
			
			System.out.println("try");
			return x;
		}finally {
			x=2;
			
		}
		
	}
	static void M1()
	{
		M2();
	}
	static void M2()
	{
		M3();
	}
	
	static void M3()
	{
		int a=12/0;
	}
	public static void main(String[] args) {
		print(); 
		System.out.println(tryblock());
		
		String string=null;
		switch (string) {
		case null:
			System.out.println("null value:-");
		default:
			break;
		 
		}
		
	}
	
	
}

