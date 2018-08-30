package com.Collections;

import java.util.ArrayList;

public class TestCollection1 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		for(String obj: al) {
			System.out.println(obj);
		}
	}

}
