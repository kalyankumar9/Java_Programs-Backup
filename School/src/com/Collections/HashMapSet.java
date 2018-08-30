package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;

class Person{
	private String Name;
	private String Skill;
	
	Person(String Name, String Skill){
		this.Name = Name;
		this.Skill = Skill;		
	}
	public void showData() {
		System.out.println("name: "+this.Name+" skill: "+this.Skill);
	}
}
public class HashMapSet {
	public static void main(String args[]) {
		Person dev1 = new Person("A","Java");
		Person dev2 = new Person("B","Java");
		Person dev3 = new Person("C","Java");
		Person dev4 = new Person("D","Java");		
		
		ArrayList<Person> devList = new ArrayList<Person>();
		devList.add(dev1);
		devList.add(dev2);
		devList.add(dev3);
		devList.add(dev4);
		
		HashMap<String, ArrayList<Person>> javaTeam = new HashMap<String,ArrayList<Person>>();
		javaTeam.put("Sudhakar", devList);
		ArrayList<Person> personList = javaTeam.get("Sudhakar");
		for(Person p : personList) {
			p.showData();
		}			
		Person QA1 = new Person("E","Testing");
		Person QA2 = new Person("F","Testing");
		Person QA3 = new Person("G","Testing");
		
		ArrayList<Person> QAList = new ArrayList<Person>();
		QAList.add(QA1);
		QAList.add(QA2);
		QAList.add(QA3);
		
		HashMap<String, ArrayList<Person>> QATeam = new HashMap<String, ArrayList<Person>>();
		QATeam.put("Kalyan", QAList);
		ArrayList<Person> person1 = QATeam.get("Kalyan");
		for(Person p1 : person1) {
			p1.showData();
			}			
		}
	}
