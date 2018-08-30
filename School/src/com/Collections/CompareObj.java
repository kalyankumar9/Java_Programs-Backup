package com.Collections;

class Person1 implements CompareObj<Person1>{					// comparing customized objects
	private String name;
	private String skill;
	
	Person1(String name, String skill){
		this.name = name;
		this.skill = skill;		
	}
	public void showData() {
		System.out.println("Name: "+this.name+" Skill: "+this.skill);
	}
}

public class CompareObj {
	public static void main(String args[]) {
		PersonId P1 = new PersonId("Kalyan", "26");
		PersonId P2 = new PersonId("Kumar", "25");
		System.out.println("Comparsion of P1,P2: ");
	
	}
}