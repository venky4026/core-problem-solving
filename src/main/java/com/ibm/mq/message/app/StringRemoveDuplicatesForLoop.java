package com.ibm.mq.message.app;

public class StringRemoveDuplicatesForLoop {
	public static void main(String[] args) {
		String input = "Venkateswarlu";
		String output = "";
		
		for (int i = 0; i < input.length(); i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < output.length(); j++) {
				if (input.charAt(i) == output.charAt(j)) {
					isDuplicate = true;
					break;
				}

			}
			if (!isDuplicate) {
				output = output + input.charAt(i);
			}
		}
		
		System.out.println(output);
	}

}
