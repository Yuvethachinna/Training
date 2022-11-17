package com.chainsys.day2;

import java.util.Scanner;

public class LoanCalculate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle amount");
		int principle=sc.nextInt();
		System.out.println("Enter the interest precentage:");
		int interest=sc.nextInt();
		System.out.println("Enter the term:");
		int term=sc.nextInt();
		int rate=(principle/interest)*term;
		System.out.println("Rate of Interest,"+rate);
		int total=principle+rate;
		System.out.println("Total amount to be paid:"+total);
		int month=total/(term*12);
		System.out.println("Paid per month: "+month);
		for(int i=total;i>=0;)
		{
			System.out.println(""+i);
			i=i-month;
		}

	}

}
