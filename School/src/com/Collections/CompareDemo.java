package com.Collections;

class PersonId{					// comparing only primitive datatypes
	private String name;
	private String skill;
	
	PersonId(String name, String skill){
		this.name = name;
		this.skill = skill;		
	}
	public void showData() {
		System.out.println("Name: "+this.name+" Skill: "+this.skill);
	}
}

public class CompareDemo {
	
	public static void main(String args[]) {
		String s1 = new String("kalyan");
		String s2 = new String("Mech");		
		System.out.println("Comparsion of Strings: "+s1.compareTo(s2));
	
	}

}
