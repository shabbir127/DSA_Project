package com.Java8;


public class FunctionalInterfaceEx {

	
	public static void main(String[] args) {
		Test t1=()->{System.out.println("functional interface");};
		
		Test1 t2=(a,b)->{ System.out.println((a*b));};
		
		t2.add(12, 23);
		t1.m1();
		t1.m2();
		Test.m3();
		
		//Thread operation 
		FunctionalInterfaceEx fEx=new FunctionalInterfaceEx();
		Runnable runnable=()->{
			
				 
				for(int i=0;i<5 ;i++)
				{
					System.out.print("Child thread.. ");
				}
				

		};
		runnable.run();
		
		//both way is fine...
		Thread thread=new Thread(runnable);
		thread.start();
		 
	}


//	public void run() {
//	 
//		for(int i=0;i<5 ;i++)
//		{
//			System.out.print("Child thread.. ");
//		}
//		
//	}
	
}

@FunctionalInterface
interface Test{
	
	public void m1();
	
	public default void m2()
	{
		System.out.println("Hello, default method");
	}
	
	public static void m3()
	{
		System.out.println("Hi, static block is here.....");
	}	
}


@FunctionalInterface
interface Test1{
	
	public void add(int a,int b);
}