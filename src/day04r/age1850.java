package day04r;

import java.util.Scanner;

public class age1850 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		s.close();
		
		boolean bl = age>18&&age<50;
		System.out.println(bl);
		
	}

}
