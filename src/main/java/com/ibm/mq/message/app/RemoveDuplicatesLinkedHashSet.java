package com.ibm.mq.message.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesLinkedHashSet {

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("G", "e", "e", "k", "s"));
        System.out.println("Original ArrayList: " + stringList);
        ArrayList<String> newStringList = removeDuplicates(stringList);
        System.out.println("ArrayList with duplicates removed: " + newStringList);
    }
}
