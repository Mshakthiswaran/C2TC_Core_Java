package com.tnsif.dayfour.DailyWork.secondPackage;
import com.tnsif.dayfour.DailyWork.firstPackage.Base;
public class Executor {
	public static void main(String[]args) {
		Base b1 = new Base();
		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();

	}
}
