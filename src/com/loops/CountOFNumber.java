/*Countnumber:
	count the number of times a number x whould come in any number y
*/
package com.loops;

import java.util.Scanner;

public class CountOFNumber {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		int num=ob.nextInt();
		
		int count=0;
		
//		if(num %10==7) {
//			count++;
//		}

		while(num>0) {
			int rem=num%10;
			if(rem==7) {
				count++;
			}
			
			num = num/10;
		}
		
		System.out.println(count);
	}

}
