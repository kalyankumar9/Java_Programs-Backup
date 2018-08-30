package com.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class Student{
	int rollno;
	String name, address;
	
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student>{
	public void compare(Student Obj) {
		
	}

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class ComparatorDemo {
	public static void main(String args[]) {
		
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(1, "A", "VA"));
		ar.add(new Student(2, "B", "TN"));
		ar.add(new Student(3, "C", "TG"));
		ar.add(new Student(4, "D", "AP"));
		System.out.println("Unsorted");
		for(Student student : ar) {
			System.out.println(student.toString());
		}
		
	}

}
