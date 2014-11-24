package day20;

public class Add {
	public static void main(String[] args){
		System.out.println(add(100,0));
	}
	public static int add(int i,int sum){
		if(i>0){
			sum+=i;
			sum=add(i-1,sum);
		}
		return sum;
	}
}
