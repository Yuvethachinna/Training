package com.chainsys.day2;
import java.util.Scanner;
public class Logical {

	public static void main(String[] args) {
	long accountNumber;
	int aadharNumber=45678,transactionPin=1234,password=9876;
	System.out.println("Enter account holder name:");
	Scanner sc=new Scanner(System.in);
	String accountHolderName=sc.next();
	if((accountHolderName.trim()!=null)&&(accountHolderName.length()>=3)) {
		System.out.println("Enter account Number:");
		accountNumber=sc.nextLong();
		System.out.println("Enter aadhar number:");
		aadharNumber=sc.nextInt();
		if(aadharNumber==45678) {
			System.out.println("Enter trasaction pin and password");
			transactionPin=sc.nextInt();
			password=sc.nextInt();
			if((transactionPin==1234)&&(password==9876)) {
				System.out.println("Successfull Transaction");
			}
			else {
				System.out.println("Invalid credentials");
			}
		}else {
				System.out.println("Invalid Aadhar details");
			}
		}
			else {
				System.out.println("Enter valid account");
			}
	

	}
	}


