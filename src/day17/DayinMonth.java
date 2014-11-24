package day17;

import java.util.Calendar;

public class DayinMonth {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2013);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		int jan = c.getActualMaximum(Calendar.DATE);
		System.out.println(jan);
		
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		int feb = c.getActualMaximum(Calendar.DATE);
		System.out.println(feb);
		
		c.set(Calendar.MONTH, Calendar.MARCH);
		int mar = c.getActualMaximum(Calendar.DATE);
		System.out.println(mar);
		
		c.set(Calendar.MONTH, Calendar.APRIL);
		int apr = c.getActualMaximum(Calendar.DATE);
		System.out.println(apr);
		


	}

}
