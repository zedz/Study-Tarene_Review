package day20Review;

import java.io.File;
import java.util.Calendar;

public class GetActualMaximum {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2014);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DATE, 1);
		
		
		for(int i=0;i<=c.getActualMaximum(Calendar.MONTH);i++){
			System.out.println(c.get(Calendar.YEAR)+"年"+(i+1)+"月有"+c.getActualMaximum(Calendar.DATE)+"天");
			c.set(Calendar.MONTH, i+1);
		}
		
	
	}
}
