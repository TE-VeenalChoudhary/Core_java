package com.te.methods.common;

public class MethodsAndArguments {
	
	public static void m1(int a) { //actual arguments
		System.out.println("1st M1 is executing");
	}
	public static void m1(int a, int b) {
		System.out.println("2nd M1 is executing");
	}
	public static void m1(int... a) { //formal or variable arguments creating a dynamically growing array
		System.out.println("var args M1 is executing");
	}

}
