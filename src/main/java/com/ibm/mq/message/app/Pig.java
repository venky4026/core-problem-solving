package com.ibm.mq.message.app;

public class Pig extends AbstractClassAnimal {

	@Override
	public void animalSound() {
		System.out.println("Pig");
	}

	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.animalSound();
		pig.sleep();
	}
}
