package com.chainsys.day2;

public class Testhospital {

	public static void main(String[] args) {
		Hospital hos=new Hospital();
		hos.hospitalName="Appolo";
		hos.avalaible=true;
		hos.registerNumber=51;
		hos.phoneNumber=987654321;
		hos.address="13,Guindy,chennai.";
		System.out.println("HospitalName:"+hos.hospitalName);
		System.out.println("Avaliable24/7?:"+hos.avalaible);
		System.out.println("RegisterNumber:"+hos.registerNumber);
		System.out.println("phonenumber:"+hos.phoneNumber);
		System.out.println("Address:"+hos.address);
	}

}
