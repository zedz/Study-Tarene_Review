package day04r;

public class PrintTriangle {

	public static void main(String[] args) {
		int i,j,k;
		int num = 7;
		
		for (i=0;i<num;i++){
			for (k=num-i;k>0;k--){
				System.out.print(" ");
			}
			
			for(j=0;j<2*i+1;j++){
				char letter;
				letter = (char)(65+i);
				System.out.print(letter);
			}
			System.out.println();
		}

	}

}
