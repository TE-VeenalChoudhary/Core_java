package com.te.datatypes;

import java.util.Scanner;

public class SwitchAssignment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month's number:");
		int month =sc.nextInt();
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("The month is January and it has 31 days ");
			break;
		
		case 2:
			if ((year%400==0) || (year%4==0 && year% 100 !=0)) {
				System.out.println("The month is Feburary and it has 29 days in the year "+ year);}
			else {
				System.out.println("The month is Feburary and it has 28 days in the year "+ year);
			}
			break;
		
		case 3:
			System.out.println("The month is March and it has 31 days ");
			break;
		
		case 4:
			System.out.println("The month is April and it has 30 days ");
			break;
		
		case 5:
			System.out.println("The month is May and it has 31 days ");
			break;
		
		case 6:
			System.out.println("The month is June and it has 30 days ");
			break;
		
		case 7:
			System.out.println("The month is July and it has 31 days ");
			break;
		
		case 8:
			System.out.println("The month is August and it has 31 days ");
			break;
			
		case 9:
			System.out.println("The month is September and it has 30 days ");
			break;
		case 10:
			System.out.println("The month is October and it has 31 days ");
			break;
		case 11:
			System.out.println("The month is November and it has 30 days ");
			break;
		case 12:
			System.out.println("The month is January and it has 31 days ");
			break;
		default:
			System.out.println("Entered an invalid number");
			break;
		}

	}

}
