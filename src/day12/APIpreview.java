package day12;

public class APIpreview {

	public static void main(String[] args) {
		double pi = 3.141592653;
		int a = 123;
		char[] chs = {'a','b','c','c','d'};
		boolean b = true;
		
		System.out.println(String.valueOf(pi));
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(chs));
		System.out.println(String.valueOf(b));
		
		StringBuilder s = new StringBuilder();
		s.append("Jamie Zhang").append(" is trying to chase Huang").insert(5, "*").replace(0, 5, "Zijun");
		System.out.println(s.toString());
		s.delete(0, 5);
		System.out.println(s.toString());
		

	}

}
