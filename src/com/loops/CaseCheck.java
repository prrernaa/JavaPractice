//find out enytered value is lowercase letter or upper case letter 

package com.loops;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		
		System.out.println("enter char : ");
		Scanner ob=new Scanner(System.in);
		
		char ch=ob.next().charAt(0);
		System.out.println(ch);
		
		if(ch >= 'a' && ch <='z') {
			System.out.println("Lowercase ");
		}else {
			System.out.println("Uppercase");
		}

	}

}
