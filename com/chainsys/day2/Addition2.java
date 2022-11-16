package com.chainsys.day2;
import java.util.Scanner;
public class Addition2 {

	public static void main(String[] args) {
		Addition add=new Addition();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers;");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		add.a=num1;
		add.b=num2;
		System.out.println("The add is:"+(num1+num2));
		System.out.println("The sub is:"+(num1-num2));
		System.out.println("The mul is:"+(num1*num2));
		System.out.println("The div is:"+(num1/num2));
		

	}

}
