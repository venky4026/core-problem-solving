package com.ibm.mq.message.app;

public class StringImmutable {
	static int count = 0;

	public static void main(String[] args) {
		String s = "Venky";
		s.concat("Dasari");
		System.out.println("String Immutable :" + s);
		s = s.concat("Dasari");
		System.out.println("String can modify with reference By appending concat : " + s);
		display();
		Inner inner = new Inner();
		inner.display1();
	}

	static void display() {
		System.out.println("Static method called " + " static count : " + count);
	}

	static {
		System.out.println("Static block executed");
	}

	static class Inner {
		void display1() {
			System.out.println("Static nested class");
		}
	}
}
