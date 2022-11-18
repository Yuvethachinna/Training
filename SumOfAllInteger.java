package com.chainsys.day3;

import java.util.Scanner;

public class SumOfAllInteger {

	public static void main(String[] args) {
			int x,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Number of integer:");
			int n=sc.nextInt();
			for(int i = 0;i<n;i++) {
				System.out.println("Enter the number:");
				x=sc.nextInt();
				sum=sum+x;
			}
				System.out.println("The sum of all integer number is:"+sum);
			}
		

	}


