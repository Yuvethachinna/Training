package com.chainsys.day2;
import java.util.Scanner;

public class Hotel2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hotel hot=new Hotel();
		
		System.out.println("Enter Hotel Name:");
		String hotelName=sc.next();
		System.out.println("Hotel Address:");
		String hotelAddress=sc.next();
		System.out.println("Enter MailId:");
		String mailId=sc.next();
		System.out.println("Enter phoneNumber:");
		long phoneNumber=sc.nextLong();
		System.out.println("Open and close Time:");
		String opencloseTime=sc.next();
		hot.hotelName=hotelName;
		hot.hotelAddress=hotelAddress;
		hot.mailId=mailId;
		hot.phoneNumber=phoneNumber;
		hot.opencloseTime=opencloseTime;
		System.out.println(hot.hotelName);
		System.out.println(hot.hotelAddress);
		System.out.println(hot.mailId);
		System.out.println(hot.phoneNumber);
		System.out.println(hot.opencloseTime);




	}

}
