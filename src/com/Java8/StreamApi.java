package com.Java8;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,7,9,8,3,2,1);
		
		List<Integer> filterList=list.stream().filter(i-> i%2==0).toList();
		System.out.println("Divsible by 2 :-" + filterList);
		
	}

}
