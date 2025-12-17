package com.sk.interview;

import java.util.Arrays;
import java.util.List;

public class Java_8 {
	
	public static void main(String[] args) {
		
		//first occourance 
		List<Integer> nums=Arrays.asList(9,10,22,34,5,100,13);
		nums.stream().findFirst().ifPresent(System.out::println);
		
		//total number of element is present
		System.out.println( "Total number :- "+nums.stream().count());
		nums.stream().filter(num -> num%2==0).forEach(System.out::println);
		 
		
		
	}

}
