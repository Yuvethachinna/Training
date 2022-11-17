package com.chainsys.day2;

import java.util.Scanner;

public class MedicalCause {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes: ");
		System.out.println("Number of classes held: ");
		int classes=sc.nextInt();
		int classesheld=sc.nextInt();
		System.out.println("percentage of class attended:");
		int percentage=sc.nextInt();
		System.out.println("Have a medical certificate");
		String medicalcertificate=sc.next();
		if(percentage>=75)
		{
			System.out.println("Student is allowed to sit in exam");
			}
		else if (medicalcertificate.equals("Yes")) {
			System.out.println("Student is allowed to sit in exam");
			
		}
		
		else if (percentage<75) {
			System.out.println("Student is  not allowed to sit in exam");
	}
		else {
			System.out.println("not valid");
		}

}
}
