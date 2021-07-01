package com.te.datatypes;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year");
		
		int yr= sc.nextInt();
		if (((yr%4==0) || (yr% 400==0)) && (yr%100!=0))
		//if ((a%400==0) || (a%4==0 && a% 100 !=0)) 
		{
			System.out.println("A leap year");
		}else {
			System.out.println("not a leap year");
		}

	}

}
