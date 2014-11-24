package day20Review;
/**
 * 用两种方法判断是否是回文
 * @author Jamie
 *
 */
public class Reverse {
	public static void main(String[] args) {
		String str = "1234567890987654321";
		System.out.println(isReverse(str));
		System.out.println(isReverse2(str));
	}
	public static boolean isReverse(String str) {
		StringBuilder sBuilder = new StringBuilder(str);
		return sBuilder.reverse().equals(sBuilder)?true:false;
	}
	public static boolean isReverse2(String str) {
		boolean result = true;
		for(int i=0;i<str.length()/2;i++){
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				result = false;
				break;
			}
		}
		return result;
	}
}
