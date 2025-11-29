package com.Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,7,9,8,3,2,1);
		Map<String, Integer> Student=new HashMap<>();
		Student.put("Shabbir", 90);
		Student.put("Amit", 45);
		Student.put("Rohit", 32);
		Student.put("Vivek", 60);
		Student.put("Shiva", 78);
		Student.put("Amit", 31);
		Student.put("Sujit", 34);
		
		
		List<Integer> marks=Arrays.asList(52,26,47,79,48,33,42,71);
		
		System.out.println("-----------------------Filter Function --------------------------");
		List<Integer> filterList=list.stream().filter(i-> i%2==0).toList();
		System.out.println("Divsible by 2 :-" + filterList);// input=10
		                                                    //output=0 to 10
		
		List<Integer> passed=marks.stream().filter(i-> i > 35).toList();
		System.out.println("Passed Student Result :- "+ passed); 
		
		System.out.println("-----------------------MAP Function --------------------------");
		List<Integer> graceMarks=marks.stream().filter(i-> i < 35).map(j-> j+5).filter(i -> i > 35).toList();
		System.out.println("After add graceMarks "+ graceMarks);// input=10
                                                                //output=10
		
		
		
		
		System.out.println("---------------------------------------- Working on Map with Stream API ----------------------------------------------------------------");
		System.out.println("All Student list : "+ Student);
	    Map<String, Integer> passedMap=Student.entrySet().stream().filter(i-> i.getValue() > 35).collect(Collectors.toMap(i-> i.getKey(),i->i.getValue() ));
	    System.out.println("Student passed with grace marks list : "+passedMap);
	    
	    Map<String, Integer> graceMap=Student.entrySet().stream().filter(i-> i.getValue() < 35).collect(Collectors.toMap(Map.Entry::getKey, i ->i.getValue() +5));
	    System.out.println("Grace mark got and passed student list : "+graceMap);
	    
	    System.out.println("\n----------------------------------COUNT Function ------------------------------------");
	    long CountStudent=marks.stream().filter(i-> i < 35).count();
	    System.out.println("Total failed student:- "+ CountStudent);
		
	    System.out.println("-----------------------------------Sorted-----------");
	    List<Integer> sortList = marks.stream().sorted().toList();
	    System.out.println("Sorted Marks List :-" + sortList); 
	   
	    List<Integer> decliList=  marks.stream().sorted((a,b) ->(a<b)?1 :(a>b) ?-1 :0).toList();
	    List<Integer> decliList1=  marks.stream().sorted((a,b)-> -a.compareTo(b)).toList();
	    System.out.println("Sorted in decasending order : "+ decliList);
	    System.out.println("Sorted in decasending order : "+ decliList1);
	
	}

}
