package com.ibm.mq.message.app;

public class NumberFormatExceptionDemo {
	
	
	public static void main(String[] args) {
		// NumberFormatException proved
		//String message="hello";
		//String message="";
		//String message="1 ";  //white space proved
		String message="12"; //Positive case
		int num=Integer.parseInt(message);
		System.out.println("Message..."+message);
		
	}

}
