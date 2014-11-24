package day04r;

import java.util.Scanner;

public class sort3num {

	public static void main(String[] args) {
		System.out.println("please enter three number, seperated by blank:(a,b,c)");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		s.close();
		System.out.println("your input is a="+a+", b="+b+", c="+c);
		int t = 0;
		
		if (a>b){
			t=a;
			a=b;
			b=t;
		}
		if (b>c){
			t=b;
			b=c;
			c=t;
		}
		if (a>b){
			t=a;
			a=b;
			b=t;
		}
		System.out.println("sort output is a="+a+", b="+b+", c="+c);		

	}

}
