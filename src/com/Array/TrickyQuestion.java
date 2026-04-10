package com.Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public  class TrickyQuestion implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		
		System.out.println("Main String methods...");
		int [] arr= {123,346,6};
		main(arr);
	}
	
public static void main(int[] args) {
		
		System.out.println("int arguments...");
		
		
		String string="tringS";
		string.chars()
		   .mapToObj(c -> (char)c)
		   .distinct()
		   .findFirst()
		   .ifPresent(System.out::println);
		
		char [] ch=string.toCharArray();
		for(char charr:ch)
		{
			if (string.indexOf(charr) == string.lastIndexOf(charr)) {
				System.err.println(charr);
				
			}
		}
		
	  List<Integer>list=Arrays.asList(1,2,3,4,5,2,3,45,5,3);
	  
	  Map<Integer, Integer>map=new LinkedHashMap<>();
	  for(int num:list)
	  {
		  if (!map.containsKey(num)) {
			map.put(num, 1);
		}else {
			map.put(num, map.get(num) + 1);
		}
	  }
	  
	  System.out.println(map);
	  
	  for(Map.Entry<Integer, Integer> entry:map.entrySet())
	  {
		  if (entry.getValue() == 1) {
			System.out.println(entry.getKey());
			break;
		}
	  }
	 
	  for(int num:list) {
		  if (list.indexOf(num)== list.lastIndexOf(num)) {
			System.out.println(num);
			break;
		}
	  }
	  
	  
	  String name="My name is Shabbir";
	  String [] words=name.split(" ");
	  StringBuilder sBuilder=new StringBuilder();
	  for(int i=words.length -1; i >= 0 ;i--)
	  {
		  sBuilder=sBuilder.append(words[i]+" ");
	  }
	  System.out.println(sBuilder);
	  
	  Map<String, Integer>wordcount=new LinkedHashMap<>();
	  
		for(String check : words )
		{
			if (!wordcount.containsKey(check)) {
				wordcount.put(check, 1);
			}else {
				wordcount.put(check, wordcount.get(check) +1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:wordcount.entrySet())
		{
			if (entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
			
		}
		
		
		
		String string2="java code";
		String [] rev=string2.split(" ");
		String output=" ";
		for(String str:rev)
		{
			String revString=" ";
			for(int i=str.length()-1;i>=0;i--)
			{
				revString=revString+str.charAt(i);
			}
			output=
revString;
			
		}
		System.out.println(output);	
		
	
	}
  



	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int method1(int a) {
		// TODO Auto-generated method stub
		return 0;
	}





	
	
}



interface InterfaceA
{
	void method1();
}
interface InterfaceB
{
	int method1(int a);
}




