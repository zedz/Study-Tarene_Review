package day20Review;

import java.util.Scanner;

public class IntOrDoub {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		String regex = "\\-?\\d+(\\.\\d+)?";
		if(str.matches(regex)){
			if(str.indexOf(".")==-1){
				System.out.println("Integer"+str);
			}else{
				System.out.println("Double"+str);
			}
		}else {
			System.out.println("Error");
		}
	}
}
