package com.tnsif.dayfour.DailyWork.firstPackage;

public class Base {
int varDefault =10;
public int varPublic =20;
private int varPrivate = 30;
protected int varProtected =40;

void methodDefault() {
	System.out.println("Default access base class");
	System.out.println("Default Variable : "+varDefault);
}

public void methodPublic() {
	System.out.println("Public access Base Class ");
	System.out.println("Public variable : "+varPublic);
}

/*private void methodPrivate() {
	System.out.println("Private access base class ");
	System.err.println("Private variable : "+varPrivate );
}*/
protected void methodProtected() {
	System.out.println("Protected access base class");
	System.out.println("Protected variable :"+varProtected);
}

}
