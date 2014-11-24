package day06assignment;

public class Valign {
	
	public static void valign(String txt, int charPerCol){
		int len = txt.length();
		int col = len%charPerCol==0?(int)len/charPerCol:(int)(len%charPerCol)+1;
		char[]chs = txt.toCharArray();
		char[]temp = new char[col];
		for (int i=0;i<charPerCol;i++){
			for (int j=i;j<len;j+=charPerCol){
				temp[j]=chs[j];
				if (temp[col]==0){
					temp[col]=' ';
				}
			for (j=col;j>=0;j--){
				System.out.print(temp[j]);
			}
			}
		}
	}

	public static void main(String[] args) {
		valign("1234567890",3);

	}

}
