package com.function;

import java.util.Scanner;

public class Parameters_Arguments {

	public static void main(String[] args) {
		
		//sum();  //this will give error as we have to pass values which we are giving as parameters in function 
		int ans=sum(23,45);
		System.out.println("sum : "+ ans);
	}
	
	//pass values of numbers when you are calling the method in main()
	//without using scanner we can take values from the user 
	static int sum(int a,int b) {
		int sum =a+b;
		return sum;
	}
	
	
	static int sum2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int n2 = sc.nextInt();

		int sum = n1 + n2;
		return sum;
		
	}

}
