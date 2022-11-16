package com.chainsys.day2;
import java.util.Scanner;

public class Book2 {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);
Book b=new Book();
System.out.println("Enter Book Id:");
int bookId=sc.nextInt();
System.out.println("Enter Book Name:");
String bookName=sc.next();
System.out.println("Enter author Name:");
String author=sc.next();
System.out.println("Enter price:");
int price=sc.nextInt();
System.out.println("Enter Book publishedYear:");
String publishedYear=sc.next();
b.bookId=bookId;
b.bookName=bookName;
b.author=author;
b.price=price;
b.publishedYear=publishedYear;
System.out.println(b.bookId);
System.out.println(b.bookName);
System.out.println(b.author);
System.out.println(b.price);
System.out.println(b.publishedYear);


	}

}
