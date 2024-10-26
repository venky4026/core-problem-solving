package com.ibm.mq.message.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public interface VaribaleDeclartion {

	// must need to instailze the vaule if want declare variable inside the
	// interface
	public Integer test = 10;

	List<String> list = new ArrayList<>();
	List<Integer> lis1 = new LinkedList<>();
	List<String> list3 = new Stack<>();
	List<Integer> l4 = new Vector<>();

	ArrayList<String> arrayList = new ArrayList<>();

}
