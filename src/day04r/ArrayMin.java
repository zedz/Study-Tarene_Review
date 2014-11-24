package day04r;

import java.util.Arrays;

public class ArrayMin {

	public static void main(String[] args) {
		int[]arr = new int[10];
		for (int i=0; i<arr.length;i++){
			arr[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr));
		
		int min = 100;
		
		for (int i=0;i<arr.length;i++){
			if (arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println("Min:"+min);
		int[]arr1=new int[arr.length+1];
		System.arraycopy(arr, 0, arr1, 1, arr.length);
		arr1[0]=min;
		System.out.println(Arrays.toString(arr1));

	}

}
