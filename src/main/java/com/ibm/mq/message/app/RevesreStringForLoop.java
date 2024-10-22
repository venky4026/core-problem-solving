package com.ibm.mq.message.app;

public class RevesreStringForLoop {

	public static void main(String[] args) {
		String input = "Venky";
		String output = "";
		for (int i = 0; i <input.length(); i++) {
			output = input.charAt(i) + output;

		}
		System.out.println(output);
	}
}
