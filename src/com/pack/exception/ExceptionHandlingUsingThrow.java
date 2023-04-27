package com.pack.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionHandlingUsingThrow {
	int availableAmount = 1000;
	
	void withdraw(int withdraw_amount){
		if(availableAmount < withdraw_amount) {
			throw new RuntimeException("balanace is not sufficient");
			
		}
		else {
			System.out.println("Transaction is successful");
		}
		
	}
	void meth2() throws FileNotFoundException
	{
	FileOutputStream fos = new FileOutputStream("D:\\Java\\HelloJava");
	System.out.println("hello java");
	 //fos.close();
	}
	public static void main(String[] args) throws FileNotFoundException{
		ExceptionHandlingUsingThrow object = new ExceptionHandlingUsingThrow();
		object.withdraw(5000);
		object.meth2();
//		try {
//		object.meth2();
//		}
//		catch(Exception e){          // it is not recommended
//			e.printStackTrace();
	
	
//		}
	}
}
