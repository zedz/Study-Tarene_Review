package day25Review;

public class Add {
	public static void main(String[] args) {
		System.out.println(sum(100, 0));
	}
	
	public static int sum(int i, int sum) {
		if(i>=0){
			sum += i;
			sum = sum(i-1, sum);
		}
		return sum;
	}
}
