package com.ibm.mq.message.app;

public abstract class AbstractClassAnimal {
	// we can declare variable inside the abstract class 
	public String message;
	
	public abstract void animalSound();
	
	public void sleep () {
		System.out.println("sleep");
	}
}
