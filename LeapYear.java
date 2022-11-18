package com.chainsys.day3;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter The Year");
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		while(year<=year&&(year%4==0) ){
			System.out.println(year+"Leap Year!!!");
			year++;
		System.out.println(year+"Not Leap Year");
		year++;
		}

	}
	}
