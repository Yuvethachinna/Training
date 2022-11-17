package com.chainsys.day2;

import java.util.Scanner;

public class Purchase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your quantity");
		double pur=sc.nextDouble();
		if(pur>1000) {
			System.out.println("The total cost="+(pur-(pur/100*10)));
			}
		else {
			System.out.println("The total cost="+pur);
		}

	}

}
