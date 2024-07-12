package com.function;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {
		//take two numbers and print the sum 
		
		//if we have to do this 100 times then we will not copy paste this as this is not a good way 
		//instead we can have a function & then we can call the function 
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter number 1: ");
//		int n1=sc.nextInt();
//		System.out.println("Enter number 2: ");
//		int n2=sc.nextInt();
//		
//		int sum=n1+n2;
//		System.out.println("sum of two numbers is : "+sum);
//		
		
		//sum(); //we can not use it like this as we have not defined the function as static 
		//simply if we need to use anything in static then it should be static
		
		
		sum();
		
		sum2(); //for printing we have to store the value in some variable & as sum has integer value 
		//we have to take the variable of int type 
		
		int ans=sum2();
		System.out.println(ans );
		
		//or else we can directly print the sum 
		System.out.println(sum2());
	}
	
	
	/*
	 * acces_modifier return_type function_name() {
	 *  //body return statement; 
	 *  }
	 */
	
	
//	void sum() {
	static void sum() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();

		int sum = n1 + n2;
		System.out.println("sum of two numbers is : " + sum);

	}
	
	
	static int sum2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();

		int sum = n1 + n2;
		return sum; //sum is the type integer 
		//return basically means the value of function call  , inside this i am giving the value as sum 

		//return means end of function 
		//after this if we write anything then this will not run 
		
		//System.out.println("this will never execute ");
		//ERROR : Unreachable code
	}
	
	

}
