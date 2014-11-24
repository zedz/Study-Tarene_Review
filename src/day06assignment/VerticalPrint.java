package day06assignment;

public class VerticalPrint {

	public static void main(String[] args) {
		VerticalPrint("现在开始测试代码，你好我是张紫珺。现在开始测试代码，你好我是张紫珺。现在开始测试代码，你好我是张紫珺。", 5);
//1,2,3,5,10,
	}

	public static void VerticalPrint(String str, int l) {
		char[] chs = str.toCharArray();
		for (int i = 0; i < l; i++) {
			if (i < chs.length % l) {
				System.out.print("    ");
				for (int j = chs.length - i - 1; j >= 0; j -= l) {
					System.out.print(chs[j]);
				}
			} else {
				System.out.print("     ");
				for (int j = chs.length - l + i - (chs.length % l); j >= 0; j -= l) {
					System.out.print(chs[j]);
				}
			}
			System.out.println();
		}

	}
}
