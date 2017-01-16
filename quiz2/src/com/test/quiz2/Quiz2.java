package com.test.quiz2;

import java.util.Scanner;

public class Quiz2 {
public static void main(String []args){
	
	String choice="반복";
	
	while(choice.equals("�반복")){
	
	System.out.print("숫자 입력> ");
	
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
		System.out.print("반복, 종료 선택 > ");
		Scanner n = new Scanner(System.in);
		choice = n.next();
	}
	}
}
