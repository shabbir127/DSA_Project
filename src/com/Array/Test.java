package com.Array;

public class Test {
	
	public static void pandilrome(String[] arr)
	{
		int i=0;
		int j=arr.length-1;
		boolean flag=true;
		while(i< j)
		{
			if(arr[i] == arr[j])
			{
				i++;
				j--;
			}else {
				System.out.println("given Strimg is not pandrome");
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println("given Strimg is pandrome");	
		}
		
	}
	
	public static void main(String[] args) {
		String[] arr= {"l","e","v","e","l"};
		pandilrome(arr);
		
	}

}
