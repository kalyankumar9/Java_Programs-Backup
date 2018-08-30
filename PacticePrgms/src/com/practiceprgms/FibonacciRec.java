package com.practiceprgms;

import java.util.Scanner;

public class FibonacciRec {
	static int n1=0,n2=1,n3=0;
	
	static void Fib(int n) {
			if(n>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			Fib(n-1);
		}
	}
	public static void main(String args[]) {
		System.out.println("Enter any (Input) number :");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.print(" "+n1);
		System.out.print(" "+n2);
		Fib(n);
	}

}
