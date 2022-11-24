package com.chainsys.practies;

import java.util.Scanner;

public class GstBill {

	public static void main(String[] args) {
		float amount;
		float gstRate;
		float gst;
		  float total,total1,total2,total3,total4;
		  
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name=sc.next();
		boolean name1 = name.matches("[a-zA-Z]+");
		if (name1 == true) {
		
		
			System.out.println("Please select your Product:");
			System.out.println("1.Food");
			System.out.println("2.Texttiles");
			System.out.println("3.Computer");
			System.out.println("4.Vehicle");
			String category=sc.next();
		
			switch(category) {
			case "Food":
				System.out.println("Enter a food name:");
				String food=sc.next();
				System.out.println("Enter Quantity:");
				int quantity=sc.nextInt();
				
				System.out.println("Enter the amount:");
				Scanner n=new Scanner(System.in);
				amount=n.nextInt();
				total1=amount*quantity;
				System.out.println("GST Rate of Food-5%,Texttile-12%,Computer-18%,Vehicle-28%");
				System.out.println("Enter the Gst rate:");
				Scanner gr=new Scanner(System.in);
				gstRate=gr.nextInt();
				
				gst=(amount*gstRate)/100;
				total=amount+gst;
				System.out.println("\t \t \t**************WELCOME**************");
				if(gstRate==5)
				{
					System.out.println("\t \t \t----------ABC Food Court----------");
					System.out.println("\t \t \t\t123,Gandhi street,");
					System.out.println("\t \t \t\tKK.Nagar,");
					System.out.println("\t \t \t\tMadurai-625514.");
					System.out.println("\t \t \t\tPhoneNo:9876543210");
					System.out.println("\t \t \t\tEmail:abc@gmail.com");
					System.out.println("Bill No:1"+"\t\t\t\t\t\tDate:23/11/2022");
					System.out.println("\t\t\t\t\t\t\tTime:11:45:26");
					
				System.out.println("Name is:"+name);
				 int costomerId = (int) ((float) Math.random() * 10000);
	                System.out.println("Customer Id:" + costomerId);
				System.out.println("You select food:"+food);
				System.out.println("Your total quantity:"+quantity);
				System.out.println("Enter amount = "+amount+"\n"+"Total Amount="+total1+"\tGst Rate =  "+gstRate+"%");
				System.out.println("Total Gst "+gstRate+"% charge ="+gst );
				System.out.println("Total Amount ="+(total1+gst*quantity));
				System.out.println("\t \t\t*******Thank you visit again!!!*******");
				
			}	
				else{
					System.out.println("as per indian rule gst calculate only 4 type 5%,12%,18%,28% ");
					System.out.println(" you type GST RATE "+gstRate);
					
					}
				break;
			
			case "Texttiles":
				System.out.println("Enter a cloth name:");
				String text=sc.next();
				System.out.println("Enter Quantity:");
				int quantity1=sc.nextInt();
				System.out.println("Enter the amount:");
				Scanner n1=new Scanner(System.in);
				amount=n1.nextInt();
				total2=amount*quantity1;
				System.out.println("GST Rate of Food-5%,Texttile-12%,Computer-18%,Vehicle-28%");
				System.out.println("Enter the Gst rate:");
				Scanner gr1=new Scanner(System.in);
				gstRate=gr1.nextInt();
				
				gst=(amount*gstRate)/100;
				total=amount+gst;
				System.out.println("\t \t \t**************WELCOME**************");
				if(gstRate==12)
				{
					System.out.println("\t \t \t----------ABC Texttiles----------");
					System.out.println("\t \t \t\t123,Gandhi street,");
					System.out.println("\t \t \t\tKK.Nagar,");
					System.out.println("\t \t \t\tMadurai-625514.");
					System.out.println("\t \t \t\tPhoneNo:9876543210");
					System.out.println("\t \t \t\tEmail:abc@gmail.com");
					System.out.println("Bill No:2"+"\t\t\t\t\t\tDate:23/11/2022");
					System.out.println("\t\t\t\t\t\t\tTime:11:45:26");
				System.out.println("Name is:"+name);
				 int costomerId = (int) ((float) Math.random() * 10000);
	                System.out.println("Customer Id:" + costomerId);
				System.out.println("You select cloth:"+text);
				System.out.println("Your total quantity:"+quantity1);
				System.out.println("Enter amount = "+amount+"\n"+"Total Amount="+total2+"\tGst Rate =  "+gstRate+"%");
				System.out.println("Total Gst "+gstRate+"% charge ="+gst );
				System.out.println("Total Amount ="+(total2+gst*quantity1));
				System.out.println("\t \t\t*******Thank you visit again!!!*******");
			}	
				else{
					System.out.println("as per indian rule gst calculate only 4 type 5%,12%,18%,28% ");
					System.out.println(" you type GST RATE "+gstRate);
					
					}
				break;
			case "Computer":
				System.out.println("Enter Company name:");
				String computer=sc.next();
				System.out.println("Enter Quantity:");
				int quantity2=sc.nextInt();
				System.out.println("Enter the amount:");
				Scanner n2=new Scanner(System.in);
				amount=n2.nextInt();
				total3=amount*quantity2;
				System.out.println("GST Rate of Food-5%,Texttile-12%,Computer-18%,Vehicle-28%");
				System.out.println("enter the Gst rate:");
				Scanner gr2=new Scanner(System.in);
				gstRate=gr2.nextInt();
				
				gst=(amount*gstRate)/100;
				total=amount+gst;
				System.out.println("\t \t \t**************WELCOME**************");
				if(gstRate==18)
				{
					System.out.println("\t \t \t----------ABC Computer Shop----------");
					System.out.println("\t \t \t\t123,Gandhi street,");
					System.out.println("\t \t \t\tKK.Nagar,");
					System.out.println("\t \t \t\tMadurai-625514.");
					System.out.println("\t \t \t\tPhoneNo:9876543210");
					System.out.println("\t \t \t\tEmail:abc@gmail.com");
					System.out.println("Bill No:3"+"\t\t\t\t\t\tDate:23/11/2022");
					System.out.println("\t\t\t\t\t\t\tTime:11:45:26");
				System.out.println("Name is:"+name);
				 int costomerId = (int) ((float) Math.random() * 10000);
	                System.out.println("Customer Id:" + costomerId);
				System.out.println("You select :"+computer);
				System.out.println("Your total quantity:"+quantity2);
				System.out.println("Enter amount = "+amount+"\n"+"Total Amount="+total3+"\tGst Rate =  "+gstRate+"%");
				System.out.println("Total Gst "+gstRate+"% charge ="+gst );
				System.out.println("Total Amount ="+(total3+gst*quantity2));
				System.out.println("\t \t\t*******Thank you visit again!!!*******");
				}
				else{
					System.out.println("as per indian rule gst calculate only 4 type 5%,12%,18%,28% ");
					System.out.println(" you type GST RATE "+gstRate);
					
					}
				break;
			case "Vehicle":
				System.out.println("Enter your vehicle name:");
				String vec=sc.next();
				System.out.println("Enter Quantity:");
				int quantity3=sc.nextInt();
				System.out.println("Enter the amount:");
				Scanner n3=new Scanner(System.in);
				amount=n3.nextInt();
				total4=amount*quantity3;
				System.out.println("GST Rate of Food-5%,Texttile-12%,Computer-18%,Vehicle-28%");
				System.out.println("enter the Gst rate :");
				Scanner gr3=new Scanner(System.in);
				gstRate=gr3.nextInt();
				
				gst=(amount*gstRate)/100;
				total=amount+gst;
				System.out.println("\t \t \t**************WELCOME**************");
				if(gstRate==28)
				{
					System.out.println("\t \t \t----------ABC Vehicle Showroom----------");
					System.out.println("\t \t \t\t123,Gandhi street,");
					System.out.println("\t \t \t\tKK.Nagar,");
					System.out.println("\t \t \t\tMadurai-625514.");
					System.out.println("\t \t \t\tPhoneNo:9876543210");
					System.out.println("\t \t \t\tEmail:abc@gmail.com"); 
					System.out.println("Bill No:4"+"\t\t\t\t\t\tDate:23/11/2022");
					System.out.println("\t\t\t\t\t\t\tTime:11:45:26");
				System.out.println("Name is:"+name);
				 int costomerId = (int) ((float) Math.random() * 10000);
	                System.out.println("Customer Id:" + costomerId);
				System.out.println("You select vehicle name:"+vec);
				System.out.println("Your total quantity:"+quantity3);
				System.out.println("Enter amount = "+amount+"\n"+"Total Amount="+total4+"\tGst Rate =  "+gstRate+"%");
				System.out.println("Total Gst "+gstRate+"% charge ="+gst );
				System.out.println("Total Amount ="+(total4+gst*quantity3));
				System.out.println("\t \t\t*******Thank you visit again!!!*******");
			}
				else{
					System.out.println("as per indian rule gst calculate only 4 type 5%,12%,18%,28% ");
					System.out.println(" you type GST RATE "+gstRate);
					
					}

}
		}
			
			}
}

	