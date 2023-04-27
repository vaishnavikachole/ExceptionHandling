package com.pack.exception;

public class FinalInJava{
	final int a = 10;
	
	void method1() {
		System.out.println("method1 called");
	//	System.out.println(a++); // we can't change final variable value.
		System.out.println(a);
	}
	
	protected void finalize() {
		System.out.println("finalized method called");
	}
	
	public static void main(String[] args) {
		FinalInJava obj = new FinalInJava();
		obj.method1();
		
		obj = null;
		System.gc();
	}
}
