package com.te.datatypes;

public class Demo {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		
		a = ++a;
		System.out.println(a);
		
		a = ++a;
		System.out.println(a);
		
		a = a++;
		System.out.println(a);
		
		a = a++;
		System.out.println(a);
		
		b = a++;
		System.out.println(a);
	}

}
