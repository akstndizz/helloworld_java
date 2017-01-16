package com.test.quiz2;

import java.util.Scanner;

public class Quiz2 {
public static void main(String []args){
	 
	System.out.println("숫자입력 : ");
	
	Scanner input = new Scanner(System.in);
	
	int value=input.nextInt();
	
	switch(value){
		case 1 :
			System.out.println("*");
			System.out.println("**");
			System.out.println("***");
			System.out.println("****");
			System.out.println("*****");
			break;
		case 2 :
			System.out.println("    *");
			System.out.println("   **");
			System.out.println("  ***");
			System.out.println(" ****");
			System.out.println("*****");
			break;
		case 3 :
			
			System.out.println("*****");
			System.out.println(" ****");
			System.out.println("  ***");
			System.out.println("   **");
			System.out.println("    *");
			break;
		case 4 :
			
			System.out.println("*****");
			System.out.println("****");
			System.out.println("***");
			System.out.println("**");
			System.out.println("*");
			break;
	}
	}
}
