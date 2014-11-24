package day17;

import java.util.Scanner;

public class IntOrDouble {

	public static void main(String[] args) {
		System.out.println("please enter a number");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		String regex = "\\-?\\d+\\.?(\\d+)?";
		if(str.matches(regex)){
			if(str.indexOf(".")==-1){
				System.out.println("this is a integer");
			}else{
				System.out.println("this is a float");
			}
		}else{
			System.out.println("input error! not a number");
		}

	}

}
