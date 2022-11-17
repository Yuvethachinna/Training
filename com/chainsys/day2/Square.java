package com.chainsys.day2;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		double len=sc.nextDouble();
		System.out.println("Enter the breadth");
		double br=sc.nextDouble();
		if(len==br) {
			System.out.println("Square");
		}
		else {
			System.out.println("Not a Square");
		}

	}

}
