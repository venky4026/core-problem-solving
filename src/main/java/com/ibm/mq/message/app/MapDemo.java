package com.ibm.mq.message.app;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
        
        Map<String, Person> myMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        myMap.put("key1", new Person("Alice", 25));

        // Retrieve values from the HashMap
        System.out.println(myMap.get("key1")); 

	}

}
