package com.ibm.mq.message.app;

import java.util.stream.Collectors;

public class RemoveSpecialCharacters {
	public static void main(String[] args) {
		String str = "P1r!ogr#am%m*in&g Lan?#guag(e";

		// using for loop

		String resultStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				resultStr += ch;
			}
		}
		System.out.println("For loop result :" + resultStr);

		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		/**
//		 * 1.This line initializes a string variable str with the value 
//		 * 2.String resultStr = "";: Here, another string variable resultStr is initialized with an empty string.
//		 *  
//		 * 3.for (int i = 0; i < str.length(); i++) {: This loop
//		 * iterates through each character in the str string. char ch = str.charAt(i);:
//		 * Inside the loop, the character at the current index i is extracted from the
//		 * str string and stored in the ch variable.
//		 * 
//		 * 4.if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {: 
//		 * This condition checks if the character ch is an uppercase letter (A to Z) or a lowercase letter (a to z).
//		 * 
//		 * 5.if the condition is true, the character is appended to the resultStr.
//		 * 
//		 * 6.System.out.println("For loop result :" + resultStr);: Finally, the filtered characters (letters only)
//		 *  are printed to the console along with the message "For loop result :".
//		 */
//		// using Regular Expression
//				String result = str.replaceAll("[^a-zA-Z0-9]", "");
//				System.out.println("Regular Expression Output :" + result);
//		// using stream API
//
//		String resultStream = str.chars().filter(Character::isLetterOrDigit).mapToObj(c -> String.valueOf((char) c))
//				.collect(Collectors.joining());
//		System.out.println("stream api :" + resultStream);
//		/**
//		 * In this code, str.chars() creates an IntStream representing all the
//		 * characters in the string. The filter method removes any characters that are
//		 * not letters or digits. The mapToObj method converts the remaining characters
//		 * back into a stream of strings, and collect joins them all together into a
//		 * single string. Please replace str with your actual string. Let me know if you
//		 * need help with anything else! 😊
//		 * 
//		 */
//
//		// using StringBuilder
//
//		StringBuilder resultStringBuilder = new StringBuilder();
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
//				resultStringBuilder.append(ch);
//			}
//		}
//		System.out.println("StringBuilder result :" + resultStringBuilder);
//		/**
//		 * This code checks each character in the input string. If the character is a
//		 * letter (either uppercase or lowercase) or a digit, it appends the character
//		 * to the result string. All other characters (i.e., special characters) are
//		 * ignored. The resulting string, therefore, contains no special characters. You
//		 * can run this code with your specific input to remove special characters.
//		 * Please note that this code considers space also as a special character. If
//		 * you want to keep spaces in your string, you can add an additional condition
//		 * in the if statement. Let me know if you need help with anything else.
//		 */
	}

}
