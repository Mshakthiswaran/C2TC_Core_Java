package com.tnsif.dayTwelve.dailyWork.checkedException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
   static String acceptText()throws IOException {
	   try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
		   System.out.println("enter the string: ");
		   String str = br.readLine();
		   return str;
	     }
   }
}
