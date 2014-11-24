package day02;

import java.util.Scanner;
public class PlusCalculator2 {

	public static void main(String[] args) {
		int i = 1,score = 0;
		Scanner s = new Scanner(System.in);
		for (i=1;i<=10;i++){
			int num1 = (int)(Math.random()*100);
			int num2 = (int)(Math.random()*100);
			int r = num1+num2;
			System.out.println("("+i+")"+num1+"+"+num2+"=? (press -1 to esc)");
			int answer = s.nextInt();
			
			if (answer==-1){break;}
			else if (answer!=r){
				System.out.println("Wrong!");}
			else {System.out.println("Correct!");
			score += 10;
			}
		}
		s.close();
		System.out.println("Your score is "+score);
	}

}
