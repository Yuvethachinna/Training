package com.chainsys.day2;
import java.util.Scanner;

public class Hospital2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hospital hos=new Hospital();
		
		
		System.out.println("Enter Hospital Name:");
		String hospitalName=sc.next();
		System.out.println("Avalaible:");
		boolean avalaible=sc.nextBoolean();
		System.out.println("Enter Register Number:");
		int registerNumber=sc.nextInt();
		System.out.println("Enter phoneNumber:");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter address:");
		String address=sc.next();
		hos.hospitalName=hospitalName;
		hos.avalaible=avalaible;
		hos.registerNumber=registerNumber;
		hos.phoneNumber=phoneNumber;
		hos.address=address;
		System.out.println(hos.hospitalName);
		System.out.println(hos.avalaible);
		System.out.println(hos.registerNumber);
		System.out.println(hos.phoneNumber);
		System.out.println(hos.address);

	}

}
