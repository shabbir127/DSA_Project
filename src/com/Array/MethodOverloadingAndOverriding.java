package com.Array;

import java.io.IOException;

public class MethodOverloadingAndOverriding extends parent{
	
	public int add(int a, int b)
	{
		System.out.println("intger");
		return a +b;
	}
	
//	public float add(float a, float b)
//	{
//		return a +b;
//	}

	
	public String add(String a, String b, String d)
	{
		return a +b +d;
	}
	

//	public double add(double a, double b)
//	{
//		return a +b;
//	}
   public static void main(String[] args) throws IOException {
	
	   MethodOverloadingAndOverriding moo=new MethodOverloadingAndOverriding();
	   System.out.println(moo.add(1, 23d));
	  
}
   
   
   
}


class parent{

	public double add(double a, double b)
	{
		return a +b;
	}
}
