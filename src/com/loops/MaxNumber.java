// check which number is greater 

package com.loops;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		
		//first approach 
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter numbers : ");
		int n1=ob.nextInt();
		int n2=ob.nextInt();
		int n3=ob.nextInt();
		int max=0;
		if(n1>n2 && n1>n3) {
			max=n1;
		}else if (n2>n1 && n2>n3) {
			max=n2;
		}else {
			max=n3;
		}
		
		System.out.println(max);
		
		//second approach 
		int maxNum=n1;
		if(n2>maxNum) {
			maxNum=n2;
		}
		if(n3>maxNum) {
			maxNum=n3;
		}
		
		System.out.println(maxNum);
		
		

	}

}
