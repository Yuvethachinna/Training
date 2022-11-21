package com.chainsys.string;

public class Umbrella {

	public static void main(String[] args) {
		String um="Umbrella";
		boolean s=false;
		for(int i=0;i<um.length();i++) {
			if(um.charAt(i)=='e') {
			s=true;
			break;
			}
		}
System.out.println(" check if the letter 'e' is present in the word Umbrella:"+s);
	}

}
