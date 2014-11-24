package day02;

import java.util.Scanner;
public class PlusCalculator {

	public static void main(String[] args) {
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		System.out.print(num1+"+"+num2+"=");
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int i = 0,j = 0;
		s.close();
		while (i<10){
			if (r==-1){break;}
			else if (r == num1+num2){
				System.out.println("Correct!");
				j += 10;}
			else if (r != num1+num2){
				System.out.println("Wrong!");
			}
			i++;
			}
		System.out.println("Your score:"+j);
	}
}
