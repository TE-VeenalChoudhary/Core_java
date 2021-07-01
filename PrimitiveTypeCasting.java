package com.te.methods.common;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		System.out.println("-------Widening-----");
		int i=10;
		double d=i;
		System.out.println(d);
		
		System.out.println("-------Narrowing-----");
		double b= 10.98564;
		int a= (int) b;
		System.out.println(a);

	}

}
