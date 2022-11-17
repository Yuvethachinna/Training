package com.chainsys.day2;

//import java.util.Scanner;

public class LoanForloop {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int amount=sc.nextInt();
		int amount=1000;
		int interest=10;
		int year=5;
		
				
		for(int i=1000;i>5;i--) {
		int total=amount* interest*year/10;
		System.out.println(total);
		}

	}

}
