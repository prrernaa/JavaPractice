package com.function;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		
		String msg=greet();
		System.out.println(msg);
		
		Scanner ob=new Scanner(System.in);
		String naam=ob.next();
		
		//here u can clearly see this naam & name can be different 
		String personalized=myGreet(naam);
		System.out.println(personalized);
		
		//internally the naam value will have passed to name of function 
		//hence value is passed not reference 
		//in java we have the concept of pass by value only we do not have pass by reference 
	}
	
	static String myGreet(String name) {
		String message="hello " +name;
		return message;
	}
	
	static String greet() {
		
		String greeting= "how are you ";		
		return greeting;
	}

}
