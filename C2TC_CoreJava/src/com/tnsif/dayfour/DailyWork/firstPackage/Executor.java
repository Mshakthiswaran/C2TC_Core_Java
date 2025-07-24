package com.tnsif.dayfour.DailyWork.firstPackage;

public class Executor {
	public static void main(String[]args) {
		Base b1 = new Base();
		b1.methodDefault();
		b1.methodPublic();
		b1.methodProtected();
		
		System.out.println(b1 instanceof Base);
	}
}
