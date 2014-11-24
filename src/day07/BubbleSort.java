package day07;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int length = 10;
		int[]arr=new int[length];
		for(int i =0;i<length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if (arr[j]>arr[j+1]){
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
