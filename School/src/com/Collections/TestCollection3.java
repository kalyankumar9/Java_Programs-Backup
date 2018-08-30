package com.Collections;

import java.util.ArrayList;

class Student1{
	int age;
	String name;
	int rollno;
	
	Student1(int age, String name, int rollno) {
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}
//	public void ShowDetails() {
//		System.out.println("Age: "+age + "Name: "+name +"RollNo: "+rollno);
//	}
}
public class TestCollection3 {
	public static void main(String args[]) {
		Student1 s1 = new Student1(20,"Raji",201);
		Student1 s2 = new Student1(21,"Raghu", 202);
		
		ArrayList<Student1> sa = new ArrayList<Student1>();	
		sa.add(s1);
		sa.add(s2);
		for(Student1 obj: sa) {
			System.out.println("Age: "+obj.age + "Name: "+obj.name +"RollNo: "+obj.rollno);
		}
	}

}
