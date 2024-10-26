package com.ibm.mq.message.app;

public class RemoveSpecialCharactersForLoop {
	
	public static void main(String[] args) {
		String input = "Hel$lo";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				output += ch;
			}
			
		}
		System.out.println(output);
	}

}
