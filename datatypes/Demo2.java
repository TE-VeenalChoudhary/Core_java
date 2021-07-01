package com.te.datatypes;

public class Demo2 {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		
		System.out.println((a++ >5 ) && (++b >6)); //false
		System.out.println(a); //6
		System.out.println(b); //6
		
		a=5; b=6;
		System.out.println((++a >5 ) && (++b >6)); //true
		System.out.println(a); //6
		System.out.println(b); //7

		
		a=5; b=6;
		System.out.println((a++ >5 ) & (++b >6)); //false
		System.out.println(a); //6
		System.out.println(b); //7
		
		a=5; b=6;
		System.out.println((a++ >5 ) || (++b >6)); //true
		System.out.println(a); //6
		System.out.println(b); //7
		
		a=5; b=6;
		System.out.println((++a >5 ) || (++b >6)); //true
		System.out.println(a); //6
		System.out.println(b); //6
		
		a=5; b=6;
		System.out.println((a++ >5 ) | (++b >6)); //true
		System.out.println(a); //6
		System.out.println(b); //7
		
		a=5; b=6;
		System.out.println((++a >5 ) | (++b >6)); //true
		System.out.println(a); //6
		System.out.println(b); //7




	}

}
