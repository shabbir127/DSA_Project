package com.sk.interview;

import java.util.Arrays;
import java.util.List;

public class Java_8 {
	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(10,22,34,5,100,13);
		nums.stream().findFirst().ifPresent(System.out::println);
		
		
	}

}
