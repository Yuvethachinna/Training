package com.chainsys.day2;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		long phoneNumber = 98765432;
		long pinNumber = 609;
		long amount = 50000;
		System.out.println("WELCOME ABC BANK ATM");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Phone Number:");
		phoneNumber = sc.nextLong();
		if (phoneNumber == 98765432) {
			System.out.println("Enter Your Pin Number:");

			pinNumber = sc.nextLong();
			if (pinNumber == 609) {
				System.out.println("Enter Your Amount:");
			} else {
				System.out.println("Invaild Pin Number");
			}
			amount = sc.nextLong();
			if (amount < 50000) {
				System.out.println("Cash Collected");
			} else {
				System.out.println("only cash less than 50000 can be withdraw");
			}
		} else {
			System.out.println("Invalid phone Number");
		}

	}
}
