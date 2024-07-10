//take input from user & taking operation from user 

package com.loops;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		int ans=0;
		
		while(true) {
			System.out.println("enter Operator : ");
			char operator=ob.next().charAt(0);
			
			if(operator=='+' || operator=='-' || operator=='*' || operator=='/' ||operator=='%') {
				System.out.println("enter number 1:");
				int num1=ob.nextInt();
				System.out.println("enter number 2:");
				int num2=ob.nextInt();
				
				if(operator=='+') {
					ans=num1+num2;
				}
				if(operator=='-') {
					ans=num1-num2;
				}
				if(operator=='*') {
					ans=num1*num2;
				}
				if(operator=='/') {
					if(num2==0) {
						System.out.println("can't divide by zero");
					}else {
						ans=num1/num2;
					}	
				}
				if(operator=='%') {
					ans=num1%num2;
				}
				
			}
			else if(operator=='x' || operator=='X') {
				System.out.println("thanks for using my calculator");
				break;
			}else {
				System.out.println("enter valid operator!!");
			}
			
			System.out.println(ans);
		
		}
	

	}

}
