package com.tnsif.dayWork.dailyWork.uncheckedExection;

public class UncheckedExection {
		public static void main(String[] args) {
			int intArray[];
			try {
				intArray = new int[] { 1, 2, 3, 4 };
				System.out.println(intArray[2]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Specified index does not exist. "+e.getMessage());
			}
		}

} 
