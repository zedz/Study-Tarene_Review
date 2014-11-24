package day04r;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("welcome to number guessing game!");
		int num = (int)(Math.random()*1000+1);
		int guess = -1;

		
		do{
			System.out.println("please enter your guess:");
			guess = s.nextInt();
			
			if (guess==0){
				System.out.println("see you next time");
				break;
			}
			if (guess>num){
				System.out.println("too big");
			}else if(guess<num){
				System.out.println("too small");
			}
			
		}while(guess!=num);
		s.close();
		if (guess==num){
			System.out.println("Correct!");
		}
	
	}

}
