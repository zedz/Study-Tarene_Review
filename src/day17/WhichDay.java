package day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WhichDay {

	public static void main(String[] args) throws ParseException {
		System.out.println("please enter a date");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		String format = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(str);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 4);
		date = c.getTime();
		str = sdf.format(date);
		System.out.println(str);

	}

}
