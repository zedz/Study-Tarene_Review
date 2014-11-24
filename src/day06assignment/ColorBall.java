package day06assignment;

import java.util.Arrays;

public class ColorBall {

	public static void main(String[] args) {
		int[]redNum = new int[33];
		int[]red = new int[7];
		int blue;
		boolean[]b = new boolean[redNum.length]; 
		
		blue = (int)((Math.random()*16)+1);
		
		for(int i=0;i<redNum.length;i++){
			redNum[i]=i+1;
		}
		
		int index;
		for (int i=0;i<red.length;i++){
			do{
				index = (int)(Math.random()*redNum.length);
			}while(b[index]);
			red[i]=redNum[index];
			b[index]=true;
		}
		
		System.out.print(Arrays.toString(red));
		System.out.println(blue);

	}

}
