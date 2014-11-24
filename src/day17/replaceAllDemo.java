package day17;

import java.util.Arrays;

public class replaceAllDemo {

	public static void main(String[] args) {
		String str ="234fa,dfa8,s8sa6,faf87fa897a,dsf5as897d";
		String rstr = str.replaceAll("\\d+", "number");
		System.out.println(rstr);
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));

	}

}
