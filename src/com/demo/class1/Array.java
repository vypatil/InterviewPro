package com.demo.class1;
import java.util.Scanner;
import java.util.Arrays;

public class Array {

	static int [] newarray = {1,2,3,4,5,6,7,8,9,10};
	static String s3= "vaibhav";
	static String s1 = new String("vaibhav");
	static String s2 = new String("vaibhav");

	public static void main(String[] args) {

		System.out.println(s2==s1);
		
		System.out.println(s2.equals(s1));

		Array a = new Array();

		System.out.println(a.s3.toUpperCase());	


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int no =sc.nextInt();
		int temp=0;

		for (int i=2 ; i<=no-1 ; i++) {

			if (no%i==0) {

				temp=temp+1;
			}

			if(temp==0) {
				System.out.println(no+"is prime no");
			}
			else {
				System.out.println(no+"is not prime");
			}
		}

	}
}






