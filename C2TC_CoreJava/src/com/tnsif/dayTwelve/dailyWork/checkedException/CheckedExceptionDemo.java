package com.tnsif.dayTwelve.dailyWork.checkedException;
import java.io.IOException;
public class CheckedExceptionDemo {
public static void main(String[]args) {
	try {
		String str = CheckedException.acceptText();
		System.out.println("yours string is : "+str);
	}catch(IOException e){
		System.out.println("An error occurred while reading input: "+ e.getMessage());
	}
}
}
