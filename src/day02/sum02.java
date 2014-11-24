package day02;

import java.util.Scanner;
public class sum02 {

	public static void main(String[] args) {
		//9:32
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个位数：");
		int pst = s.nextInt();
		s.close();
		int i = 0;
		int sum = 0;
		int a = 0;
		while (i < pst){
			a = a*10+9;
			sum += a;
			if (i<pst-1){
			System.out.print(a+"+");
			}
			else{
				System.out.print(a);
			}
			i++;
		}
		System.out.println("="+sum);
		
	}

}
