package com.ibm.mq.message.app;

import java.util.Arrays;
import java.util.List;

public class StreamRemoveDuplicates {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("matt", "jason", "michael", "matt", "jason", "michael");

		// Remove duplicates using Stream API
		List<String> distinctNames = names.stream().distinct().toList();

		// Print the distinct names
		System.out.println(distinctNames);
	}
}


