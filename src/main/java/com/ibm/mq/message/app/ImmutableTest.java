package com.ibm.mq.message.app;

public class ImmutableTest {
	
	public static void main(String[] args) {
		
		String s="Rana";
		//s.concat("Deep");  //in this case it will print rana only 
		s=s.concat("deep"); // but hear with reference of string it will print ranadeep
		
		System.out.println(s);
		
		
	}

}
