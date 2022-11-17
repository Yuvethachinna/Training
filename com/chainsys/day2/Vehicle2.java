package com.chainsys.day2;

import java.util.Scanner;

public class Vehicle2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Vehicle vec=new Vehicle();

			System.out.println("Enter Vehicle Name:");
			String carName=sc.next();
			System.out.println("Enter Vehical Color:");
			String carColor=sc.next();
			System.out.println("Enter Engine Number:");
			int engineNumber=sc.nextInt();
			System.out.println("Avalaible A/C:");
			boolean avalaible=sc.nextBoolean();
			System.out.println("Enter address:");
			String address=sc.next();
			System.out.println("Enter Amount:");
			long carPrice =sc.nextLong();
			vec.carName=carName;
			vec.carColor=carColor;
			vec.engineNumber=engineNumber;
			vec.address=address;
			vec.carPrice=carPrice;
			System.out.println(vec.carName);
			System.out.println(vec.carColor);
			System.out.println(vec.engineNumber);
			System.out.println(vec.carPrice);
			System.out.println(vec.address);
		}

	}

}
