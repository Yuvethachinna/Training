package com.chainsys.day2;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes held:");
		int x=sc.nextInt();
		System.out.println("Number of classes attend:");
		int y=sc.nextInt();
		float pf=(y*100)/x;
		if(pf>=75) {
			System.out.println("Eligible:"+pf);
		}
		
		else {
			System.out.println("Not eligible:"+pf);
		}
	}

}
