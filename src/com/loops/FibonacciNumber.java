/*fibonacci number : 
	- start from 0 & 1 then add two previous number will make the next   
	: 0 , 1, 1 , 2, 3, 5 , 8....
*/
package com.loops;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		
		//find the nth fibonacci number 
		 int a =0;
		 int b=1;
		 Scanner ob=new Scanner(System.in);
		 int n=ob.nextInt();
		 int count=2;
		 
		 while(count<=n) {
			 int temp=b;
			 b= b+a;
			 a=temp;
			 count++;
		 }
		 
		 System.out.println(b);
		 
		 
	}

}
