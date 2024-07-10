package com.loops;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		//print numbers from 1 to 5 
		
		//for(initialization ; condition ; increment/decrement ){
		// `		body 
		// }
		
		for(int i=0;i<6;i++) {
			System.out.println(i);
		}
		
		
		//print message for n times 
		Scanner ob=new Scanner(System.in);
		System.out.println("enter num : ");
		int num=ob.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println("hello "+ i);
		}
	}

}
