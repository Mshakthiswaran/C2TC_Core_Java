package com.tnsif.dayOne.dailyWork.encapsulation;

public class StudentDemo {
	public static void  main(String[] args) {
		Student  ob = new Student();
		
		//reference variable 
		//student  when we create a new it willl be a object
		ob.setId(101);
		ob.setName("shakthi");
		System.out.println(ob.getId());
		System.out.println(ob.getName());
		
		
		//System.out.println(ob);
		
	}

}
 