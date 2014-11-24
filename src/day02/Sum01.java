package day02;

import java.util.Scanner;
public class Sum01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个分母：");
		int fm = s.nextInt();
		s.close();
		int i = 1;
		double sum = 0;
		while (i<fm+1){
			if (i<fm){
			System.out.print("1/"+i+"+");}
			else{System.out.print("1/"+i);}
			sum += 1.0/i;
			i++;
		}
		System.out.println("="+sum);
	}

}
