package day17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HowManyDays {

	public static void main(String[] args) throws ParseException {
		System.out.println("please enter a birthday");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		String f = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(f);
		Date date = sdf.parse(str);
		long datelong = date.getTime();
		date = new Date();
		long nowlong = date.getTime();
		long mm = nowlong-datelong;
		System.out.println("years:"+mm/365/24/60/60/1000);
		System.out.println("months:"+mm/365/24/60/60/1000*12);
		System.out.println("days:"+mm/24/60/60/1000);

	}

}
