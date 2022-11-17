package com.chainsys.day3;

import java.util.Scanner;

public class LoopOddEven {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        
        int array;   
        System.out.println("Enter the size of the array: ");
        array=sc.nextInt();   
        
        int arr[]=new int[array];   
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array;i++)
        {
            arr[i]=sc.nextInt();   
        }
        System.out.println("The Even Elements are...");
        for(int i=0;i<array;i++)
        {
            if(arr[i]%2==0)   
            {
                System.out.print(arr[i]+" ");
           
            }
        }
        System.out.println(" ");
        
        
        System.out.println("The Odd Elements are...");
        for(int i=0;i<array;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+" ");
            }
        }	
		
	

	}




	}


