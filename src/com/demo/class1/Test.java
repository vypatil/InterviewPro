package com.demo.class1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

			String name = new String("Prowings");
			
			char ch;
			String blank = "";
			
			System.out.println("original word "  + name);
			
			for (int i=0 ; i<name.length() ; i++) {
				
				ch=name.charAt(i);
				blank = ch+blank;
				
			}
			
			System.out.println(" reversed word " + blank);
	}

}


