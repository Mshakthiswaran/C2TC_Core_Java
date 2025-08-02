package com.tnsif.dayTwelve.dailyWork.userDefiendExection;

public class Service {
	public static boolean validateMarks(int[] marks) throws InvalidMarksException {
		for(int ele:marks)
		{
			if (ele<0 || ele>100)
				throw new InvalidMarksException(""+marks);
		}
		return true;
		 
	}
	public static float calculatePercentage(int[] marks)
	{
		int total=0;
		for(int value:marks)
			total+=value;
		float per=total/marks.length;
		return per;
		
	}


}
