package day04r;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		int[]arr = new int[10];
		for (int i=0; i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		
		int max = 0;
		
		for (int i=0;i<arr.length;i++){
			if (arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Max:"+max);
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1]=max;
		System.out.println(Arrays.toString(arr));

	}

}
