package com.te.datatypes;

import java.util.Scanner;

public class MarriageExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		/*
		 * if (age <= 27) { System.out.println("Not Eligible"); }else { if ((age>=27) &&
		 * (age<=35)) { System.out.println("Fit for Marriage"); }else {
		 * System.out.println("No use"); } }
		 */
		
		if (age>= 27) {
			if (age<=35) {
				System.out.println("Fit for marriage");
			}else
			{
				System.out.println("no use");
			}
		}else {
			System.out.println("Not eligible");
		}
	}

}
