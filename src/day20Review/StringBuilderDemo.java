package day20Review;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "国庆放假好开心";
		StringBuilder sb = new StringBuilder(str);
		sb.append(str.toCharArray(), 0, str.length());
		System.out.println(sb);
		sb.append(str,0,str.length());
		System.out.println(sb);
		sb.insert(4, "张紫珺");
		sb.insert(str.length()+4+3, "大家");
		System.out.println(sb);
		sb.delete(0, 4);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.replace(0, 2, "张紫珺");
		System.out.println(sb);
	}
}
