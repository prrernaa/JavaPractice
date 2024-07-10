package com.loops;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// reverse of a number 
		
		Scanner ob=new Scanner(System.in);
		int num=ob.nextInt();
		
		int rev=0;
		
		while(num>0) {
			int rem = num%10;
			rev=rev*10+rem;
			num =num/10;
			
		}
		
		System.out.println(rev);
		
	}

}
