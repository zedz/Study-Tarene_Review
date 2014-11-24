package day06assignment;

import java.util.Scanner;

public class test {
	public void valign(String txt,int charPerCol){
		char[] ch=txt.toCharArray();
		String x="";
		int l=txt.length()/charPerCol;
		if (txt.length()%charPerCol !=0){
			l++;
		}
		for (int i = 0; i < charPerCol; i++) {
			for (int j = i; j < ch.length; j=j+charPerCol) {
				x=ch[j]+x;
			}
			if(x.length()<l){
				x=" "+x;
			}
			System.out.println(x);
			x="";
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("输入字符串");
		String txt=s.next();
		System.out.println("折行的位置");
		int charPerCol=s.nextInt();
		test a=new test();
		a.valign(txt,charPerCol);
		s.close();
	}
}
