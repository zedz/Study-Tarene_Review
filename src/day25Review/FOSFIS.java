package day25Review;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FOSFIS {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("demo.txt");
			FileOutputStream fos = new FileOutputStream("demo.txt");
			
			int len = 0;
			byte[] buf={};
			if((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
			}
			System.out.println("done");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
