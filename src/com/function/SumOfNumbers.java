//Write a function that returns the sum of first n natural numbers.

package com.function;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=ob.nextInt();
		System.out.println(sum(num));

	}
	
	static int sum(int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=i;
		}
		return sum;
	}

}
