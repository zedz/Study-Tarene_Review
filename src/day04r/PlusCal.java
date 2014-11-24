package day04r;

import java.util.Scanner;

public class PlusCal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = 0;
		System.out.println("welcome to plus exam. enter -1 to exit");
		
		for (int i=0;i<10;i++){
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			System.out.print("("+(i+1)+")"+num1+"+"+num2+"=");
			int input = s.nextInt();
			if (input==-1){
				System.out.println("Exit!");
				break;
			}
			if (input==num1+num2){
				System.out.println("Correct!");
				score += 10;
			}else{
				System.out.println("Wrong!");
			}
			
		}
		System.out.println("Your score is "+score);
		s.close();

	}

}
