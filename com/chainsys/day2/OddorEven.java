package com.chainsys.day2;
import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.err.println("Enter your value:");
int num=sc.nextInt();
if(num%2==0) {
	System.out.println("The Number"+num+"is Even");
}
else {
	System.out.println("The Number"+num+"is Odd");
}
	}

}
