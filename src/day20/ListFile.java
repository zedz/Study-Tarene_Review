package day20;

import java.io.File;
import java.io.FileFilter;

public class ListFile {
	public static void main(String[]args){
		File dir = new File(".");
		File[] subs = dir.listFiles();
		for(File sub:subs){
			System.out.print(sub.isDirectory()?"Directory: ":"File: ");
			System.out.println(sub.getName());
		}
		
		File[] list = dir.listFiles(new FileFilter(){

			@Override
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}
			
		});
		System.out.println();
		for(File sub:list){
			System.out.println(sub.getName());
		}
	}

}
