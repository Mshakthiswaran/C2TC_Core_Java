package com.tnsif.dayfour.DailyWork.firstPackage;

public class Person {
	private String personName;
	private int personAge;
	private String personCity;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	public Person() {
		System.out.println("Default Constructor");
	}
	
	public Person(String personName, int personAge, String personCity) {
		
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
	
}
