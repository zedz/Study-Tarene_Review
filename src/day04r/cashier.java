package day04r;

import java.util.Scanner;

public class cashier {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("单价：");
		double unitPrice = s.nextDouble();
		System.out.println("数量：");
		double unit = s.nextDouble();
		System.out.println("金额：");
		double money = s.nextDouble();
		s.close();
		
		double total = unitPrice*unit;
		
		if (total>=500){
			total = total*0.8;
		}

		double change = money - total;
		
		if (change>=0){
			System.out.println("应收："+total+"元，找零："+change+"元。");
		}else{
			System.out.println("应收："+total+"元，还差"+(-change)+"元。");
		}
	}

}
