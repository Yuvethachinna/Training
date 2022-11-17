package com.chainsys.day2;

import java.util.Scanner;

public class Cricket {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two teams:");
	String team1=sc.next();
	String team2=sc.next();
	System.out.println("Enter team score");
	int score=sc.nextInt();
	if(score>298) {
		System.out.println("Team A is winner");
	}
	else if(score<298) {
		System.out.println("Team B is winner");
	}
	else if(score==298) {
		System.out.println("Match will be Draw");
	}
	
	else {
		System.out.println("No Match");
	}
	

	}

}
