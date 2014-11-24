package day20Review;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FreshDeadline {
	public static void main(String[] args) {
		System.out.println("please enter a production date: (yyyy-MM-dd)");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			Date date = sdf.parse(str);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.YEAR, 1);
			calendar.set(Calendar.MONTH, Calendar.MARCH);
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			date = calendar.getTime();
			str = sdf.format(date);
			System.out.println(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
