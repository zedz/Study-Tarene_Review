package day06assignment;

public class PrimeNumber {

	public static void prime(int range){
		int count = 0;
		int sum = 0;
		for (int i=2;i<=range;i++){
			boolean flag = true;
			for(int j=2;j<i;j++){
				if (i%j==0){
					flag = false;
					break;
				}
			}
				if (flag) {
					System.out.print(i+" ");
					count++;
					sum += i;
					if (count%10==0){
						System.out.println();
					}
				}
			}
		System.out.println();
		System.out.println(count);
		System.out.println(sum);
		}
		
	
	public static void main(String[] args) {
		prime(100);
		
	}

}
