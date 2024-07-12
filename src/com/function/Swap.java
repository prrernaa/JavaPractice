package com.function;

public class Swap {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//swap of numbers 
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
		swap(10, 20);
		//this will not swap the values 
		//cause java have only pass  by value 
		//both the a & b are pointing to same value 

		//here we can not print num1 , num2 as they are only used for reference 
		//System.out.println(num1);
		//num1 cannot be resolved to a variable
	}
	
	static void swap(int num1, int num2) {
		//num1 , num2 are available only in this function 
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
