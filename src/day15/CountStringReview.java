package day15;

import java.util.Arrays;

public class CountStringReview {

	public static void main(String[] args) {
		String str = "121212345612";
		String sub = "12";
		System.out.println(Arrays.toString(CountString(str,sub)));
	}
	
	public static int[] CountString(String str, String sub){
		int[] result = {};
		for(int i=0;i<=str.length()-sub.length();i++){
			if((str.substring(i, i+sub.length())).equals(sub)){
				result = Arrays.copyOf(result, result.length+1);
				result[result.length-1]=i;
			}
		}
		return result;
	}
	
	public static int[] CountString1(String str, String sub){
		int[] result ={};
		int index = -sub.length();
		do{
			index = str.indexOf(sub, index+sub.length());
			result = Arrays.copyOf(result, result.length+1);
			result[result.length-1]=index;
		}while(index==-1);
		return result;
	}
	
	public static int[] CountString2(String str, String key){
		    int[] ary = {};
		    int i = -key.length();
		    while(true){
		      i = str.indexOf(key, i+key.length());
		      if(i==-1)
		        break;
		      ary = Arrays.copyOf(ary, ary.length+1);
		      ary[ary.length-1] = i;//[1]
		    }
		    return ary;
	}
}

		    
