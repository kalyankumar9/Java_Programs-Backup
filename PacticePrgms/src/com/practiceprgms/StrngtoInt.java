package com.practiceprgms;

public class StrngtoInt {
	public static void main(String args[]) {
		String test = "10";
		int a = Integer.parseInt(test);
		System.out.println(a);
		
		int b = Integer.valueOf(test);
		System.out.println(b);
	}
}
