package com.ibm.mq.message.app;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringRemoveDuplicates {
	public static void main(String[] args) {
		String myString = "mattjasonmichael";
		String noDuplicates = Arrays.asList(myString.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(noDuplicates); 
		// Output: "matjsonihel"

	}

}
