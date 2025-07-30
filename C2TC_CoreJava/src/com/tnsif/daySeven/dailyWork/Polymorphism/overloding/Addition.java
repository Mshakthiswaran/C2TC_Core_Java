package com.tnsif.daySeven.dailyWork.Polymorphism.overloding;

public class Addition {
	
	public void add() {
	System.out.println("Addition");	
	}
	
	public int add(int a) {
		return a;
	}
	
	public double add(double a) {
		return a;
	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public void add(int a, String b) {
		System.out.println(""+a+""+b);
	}
	
}
