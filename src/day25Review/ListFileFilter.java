package day25Review;

import java.io.File;
import java.io.FileFilter;

public class ListFileFilter {
	public static void main(String[] args) {
		File dir = new File(".");
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}
		};
		
		File[] files = dir.listFiles(filter);
		for(File file:files){
			System.out.println(file.getName());
		}
	}
}
