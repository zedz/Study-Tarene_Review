package day20;


import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		RandomAccessFile ori = new RandomAccessFile("original.avi","rw");
		RandomAccessFile des = new RandomAccessFile("copy.avi","rw");
		int len = 0;
		byte[] b = new byte[1024*1024*100];
		long start = System.currentTimeMillis();
		while((len=ori.read(b))!=-1){
			des.write(b, 0, len);
		}
		long end = System.currentTimeMillis();
		System.out.println("Done!"+"cost"+(end-start)+"ms");

	}

}
