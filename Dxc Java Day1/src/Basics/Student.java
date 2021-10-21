package Basics;

import ObjectClass.Util;

public class Student {
	
	String name; //partition 
	int age; // 
	
	/**
	 * default constructor -- harshita
	 */
	public Student() {
		System.out.println("harshita constructor");
	}
	
	
	/**
	 * lahari constructor
	 * @param name
	 */
	public Student(String name) {
		this.name = name;
		System.out.println("lahari constructor");
	}
	
	/**
	 * this is sathvika constructor
	 * @param name
	 * @param age
	 */
	public Student(String name, int age) {
		this(name);
		System.out.println("satvika constructor");
		//this.name = name;
		this.age = Util.incrementByTen(age);
		displayStudent(this);
	}

	static String COLLEGE_NAME = "IIT";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	void displayStudent(Student s) {
		System.out.println("students name is  "+s.name);
	}

	
	
	//Student[] students = new Student[100];
	
	

}