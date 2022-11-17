package com.chainsys.day2;
import java.util.Scanner;
public class DesignCalculator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the two values:");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	System.out.println("Choose Operator:+,-,*,/,%");
	char operator=sc.next().charAt(0);
	if(operator=='+'){
		System.out.println("The ans is:"+(num1+num2));
	}
	else if(operator=='-') {
		System.out.println("The ans is:"+(num1-num2));	
	}
	else if(operator=='*') {
		System.out.println("The ans is:"+(num1*num2));	
	}
	else if(operator=='/') {
		System.out.println("The ans is:"+(num1/num2));	
	}
	else if(operator=='%') {
		System.out.println("The ans is:"+(num1%num2));	
	}
	else {
		System.out.println("Operator Invalid");
	}
	}

}
