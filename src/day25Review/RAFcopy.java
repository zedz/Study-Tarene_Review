package day25Review;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFcopy {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			RandomAccessFile raf = new RandomAccessFile("demo.txt", "rw");
			raf.write("helloworld".getBytes());
			raf.seek(0);
			int b = raf.read(new byte[10]);
			System.out.println(b);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
