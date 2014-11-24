package day17;

import java.util.Scanner;

public class StrToInt {

	public static void main(String[] args) {
		System.out.println("please enter a number");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		String regex = "\\-?\\d+\\.?(\\d+)?";
		if(str.matches(regex)){
			if(str.indexOf(".")==-1){
				int num = Integer.parseInt(str);
				System.out.println("Integer:"+num);
			}else{
				double num2 = Double.parseDouble(str);
				System.out.println("Float:"+num2);
			}
		}else{
			System.out.println("input error");
		}

	}

}
