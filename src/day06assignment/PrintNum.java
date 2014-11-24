package day06assignment;

public class PrintNum {

	public static void main(String[] args) {
		int num = (int)(Math.random()*10000);
		System.out.println(num);
		int gewei = num%10;
		int shiwei = (num%100-gewei)/10;
		int baiwei =(num%1000-shiwei-gewei)/100;
		int qianwei = (num%10000-baiwei-shiwei-gewei)/1000;
		System.out.println(qianwei+" "+baiwei+" "+shiwei+" "+gewei);
	}

}
