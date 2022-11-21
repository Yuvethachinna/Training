package com.chainsys.string;

public class Findstring {

	public static void main(String[] args) {
		String find="Hello, world";
		System.out.println("The first 'o' position is:"+find.indexOf('o'));
		System.out.println("The ',' position is:"+find.indexOf(','));
		System.out.println("The last 'o' position is:"+find.lastIndexOf('o'));
		System.out.println("The ',' position is:"+find.lastIndexOf(','));
	}

}
