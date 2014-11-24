package day20Review;

import java.util.Arrays;

/**
 * 使用两种方法得到子字符串在字符串中的位置，将位置存储在一个数组中返回
 * @author Jamie
 *
 */
public class CountWords {
	public static void main(String[] args) {
		String str = "12121234125612";
		String sub = "12";
		System.out.println(Arrays.toString(countLow(str,sub)));
		System.out.println(Arrays.toString(countHigh(str,sub)));
	}
	
	public static int[] countLow(String str, String sub) {
		int[] result={};
		for(int i=0;i<=str.length()-sub.length();i++){
			if (sub.equals(str.substring(i, i+sub.length()))) {
				result=Arrays.copyOf(result, result.length+1);
				result[result.length-1]=i;
			}		
		}
		return result;
	}
	
	public static int[] countHigh(String str,String sub) {
		int[] result={};
		int fromIndex=0;
		while(str.indexOf(sub, fromIndex)!=-1){
			result=Arrays.copyOf(result, result.length+1);
			result[result.length-1]=str.indexOf(sub, fromIndex);
			fromIndex=str.indexOf(sub, fromIndex)+sub.length();
		}
		return result;
	}
}
