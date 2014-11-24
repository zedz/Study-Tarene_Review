package day02;

import java.util.Scanner;
public class Guess01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter your guess:(1-1000) press 0 to esc");
		int guess = s.nextInt();
		s.close();
	
		int num = (int)(Math.random()*1000+1);
		
		while (guess!=num){
			if (guess == 0){break;}
			else if (guess>num){System.out.println("too big!");}
			else if (guess<num){System.out.println("too small");}
			System.out.println("please enter your guess:(1-1000) press 0 to esc");
			guess = s.nextInt();
		}
		
		if (guess == num){System.out.println("Congrats!You get it!");}
		else if (guess ==0){System.out.println("Well,come back next time!");}
		}
		
		}



