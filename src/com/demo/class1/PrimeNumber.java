package com.demo.class1;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);		//to take output from user.
		
		int no =sc.nextInt();
		int temp=0;								// temp variable for store result value
		
		for(int i=2 ; i<=no-1 ; i++) {			// condition for loop	
			
			if(no%i==0) {						// condition for prime number
				
				temp=temp+1;
			}
		}
		if(temp==0) {					
			System.out.println("this is prime no" + no);
		}
		else {
			System.out.println("this is not prime no" + no);
		}
}
}