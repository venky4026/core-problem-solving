package com.ibm.mq.message.app;

public class RevesreStringStringBuilder {

	public static void main(String[] args) {
		String input = "Geeks for Geeks";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();
		System.out.println(input1);
	}
}
