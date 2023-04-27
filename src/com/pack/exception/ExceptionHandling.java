package com.pack.exception;

public class ExceptionHandling {
	String s=null;
	void meth1() {
		System.out.println(10);
	try {
		System.out.println("try block executed");
		System.out.println(20/0);
		System.out.println(s.length());
	}
	catch(Exception e) {
	System.out.println("catch block executed");	
	//System.out.println(e.getMessage());
	//System.out.println(e.toString());
	e.printStackTrace();
	}
//	catch(ArithmeticException | NullPointerException e) {
//		e.printStackTrace();
//	}

	finally {
		System.out.println("finally block executed");
	}
		System.out.println(30);
	}
	public static void main(String[] args) {
		new ExceptionHandling().meth1();
	}
	

}
