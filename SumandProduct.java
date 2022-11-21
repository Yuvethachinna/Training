package com.chainsys.array;

import java.util.Arrays;

public class SumandProduct {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};

	       int sum = 0, product = 1;

	       for(int x: arr){

	           sum += x;

	           product *= x;

	       }

	      System.out.println("Given Array: " + Arrays.toString(arr));

	       System.out.println("Sum of elements: " + sum);

	       System.out.println("Product of elements: " + product);

}
}
