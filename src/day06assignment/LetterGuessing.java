package day06assignment;

import java.util.*;
public class LetterGuessing {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("欢迎来到猜字母游戏！");
		int l = 0;
		do {
			System.out.println("请选择您的游戏等级：（5，7，9）");			
			l = s.nextInt();
		}while(l!=5&&l!=7&&l!=9);
		char[] chs = generate(l);
		System.out.println(Arrays.toString(chs));
		
		int[] result = new int[2];
		int score = 100*l+10;
		do {
			System.out.println("请输入您的猜测：");
			String str = s.next().trim().toUpperCase();	
			if ("EXIT".equals(str)){
				System.out.println("欢迎下次再猜！");
				break;
			}
			char[] input = str.toCharArray();
			result=check(chs, input);
			System.out.println("您猜对的字母有"+result[0]+"个。您猜对的位置有"+result[1]+"个。");
			score -= 10;
		}while(result[1]!=l);
		
		s.close();
		if (result[1]==l){
			System.out.println("恭喜你！猜对了！");
			System.out.println("您的的分是:"+score);
		}
	}

	public static char[] generate(int l){
		char[]letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O',
				'P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[]chs=new char[l];
		boolean[] flags=new boolean[letters.length];
		int index;
		for (int i=0;i<l;i++){
			do{
				index = (int)(Math.random()*letters.length);
			}while(flags[index]);
			flags[index]=true;
			chs[i]=letters[index];
		}
		return chs;
	}
	
	public static int[] check(char[]chs, char[]input){
		int[]result=new int[2];
		for(int i=0;i<chs.length;i++){
			for(int j=0;j<input.length;j++){
				if (chs[i]==input[j]){
					result[0]++;
					if (i==j){
						result[1]++;
					}
				}
			}
		}
		return result;
	}
	
	
}
