package com.tnsif.daySeven.dailyWork.Polymorphism.overloding;

public class MethodOverLoadingDemo {
public static void main(String[]args  ) {
	Addition a = new Addition();
	a.add();
	System.out.println(a.add(6));
	System.out.println(a.add(6.0));
	System.out.println(a.add(6,7));
	a.add(101,"shakthi");
	
	}
}
