package day01;

import java.util.Scanner;
public class AssignmentDay03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter two integer number:a,b,c(seperated by blank):");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		
		int max = a>=b?a:b;
		max = max>=c?max:c;
		
		int min = a<=b?a:b;
		min = min<=c?min:c;
		
		int second=0;
		
		if (max - a != 0 && min - a != 0){second = a;}
		else if (max - b != 0 && min - b != 0){second = b;}
		else if (max - c != 0 && min - c != 0){second = c;}
		
		System.out.println("The number you have entered is:");
		System.out.println("a = " + a +", b = " + b +", c = " + c);
		System.out.println("The ascending order is:");
		System.out.println("a = " + min +", b = " + second +", c = " + max);
		
	}

}
