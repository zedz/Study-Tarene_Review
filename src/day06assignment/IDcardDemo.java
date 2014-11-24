package day06assignment;

public class IDcardDemo {
	public static void main(String[] args) {
		ID("34052419800101001x");	
	}

	public static void ID(String num) {
		char[] numArr = num.toCharArray();
		int[] coefficient = { 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8,
				4, 2 };

		int product = 0;
		for (int i = 0; i < numArr.length - 1; i++) {
			product += (numArr[i]-'0') * coefficient[i];
		}
		System.out.println("乘积："+product);

		int reminder = product % 11;
		System.out.println("乘积除以11取余"+reminder);

		char last = numArr[numArr.length - 1];
		System.out.println("最后一位："+last);
		
		char[]lastR = {'1','0','x','9','8','7','6','5','4','3','2'};
		char lastRight = lastR[reminder];

		System.out.println("正确的最后一位："+lastRight);

		if (last == lastRight) {
			System.out.println("此身份证号是一个正确的身份证号");
		} else {
			System.out.println("身份证号错误");
		}

	}

}
