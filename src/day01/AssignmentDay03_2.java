package day01;

import java.util.Scanner;
public class AssignmentDay03_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year = s.nextInt();
		System.out.println("请输入月份：");
		int month = s.nextInt();
		s.close();
		
		boolean isLY = year%100 != 0 && year %4==0 ||year%400 ==0;
		int day = 0;
		
		switch (month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if (isLY == true){day = 29;}
			else {day = 28;}
			break;
		}

		System.out.println(year + "年" + month + "月有" + day + "天");
	}

}
