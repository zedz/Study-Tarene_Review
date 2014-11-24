package day20Review;

import java.util.Random;

/**
 * 生成五位验证码
 * @author Jamie
 *
 */
public class FiveDigitCode {
	public static void main(String[] args) {
		System.out.println(generate());
	}
	public static String generate() {
		StringBuilder code=new StringBuilder();
		Random r = new Random();
		for(int i=0;i<5;i++){
			int num = r.nextInt(3);
			switch (num) {
			case 0:
				char t = (char)('A'+r.nextInt(26));
				code.append(t);
				break;
			case 1:
				t = (char)('a'+r.nextInt(26));
				code.append(t);
				break;
			case 2:
				t= (char)('0'+r.nextInt(10));
				code.append(t);
				break;
			}
			
		}
		return code.toString();
	}
}
