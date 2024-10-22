package com.ibm.mq.message.app;

public class PrimaryNumbers {

	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		if (isPrime(11))
			System.out.println("11 is a prime number.");
		else
			System.out.println("11 is not a prime number.");

		if (isPrime(15))
			System.out.println("15 is a prime number.");
		else
			System.out.println("15 is not a prime number.");
	}

}
