package com.ibm.mq.message.app;

public class FinalizeDemo {
	private static Integer value=100;
	// yes it's method and it's deprecated from 9th version
	@SuppressWarnings("deprecation")
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	public static void Method(Integer args) {
		value++;
		
	}
	public static void main(String[] args) {
		
		Method(value);
		System.out.println("Tets ..."+value);
	}

}
