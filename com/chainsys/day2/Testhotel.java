package com.chainsys.day2;

public class Testhotel {

	public static void main(String[] args) {
		Hotel hot=new Hotel();
		hot.hotelName="Anantha";
		hot.hotelAddress="3,vanagaram,chennai.";
		hot.phoneNumber=789654332;
		hot.mailId="anathhos.com";
	    hot.opencloseTime="6Am-10PM";
System.out.println("Hotelname:"+hot.hotelName);
System.out.println("HotelAddress:"+hot.hotelAddress);
System.out.println("PhoneNumber:"+hot.phoneNumber);
System.out.println("MailId:"+hot.mailId);
System.out.println("Open and close Time:"+hot.opencloseTime);
	}

}
