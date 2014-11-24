package day20;

import java.io.File;

public class DeleteAll {
	public static void main(String[]args){
		File dir = new File("/Users/Jamie/Workspaces/MyEclipse 2015 CI/Study@Tarene_Review/a");
		delete(dir);
		System.out.println("done");
	}
	
	public static void delete(File dir){
		if(dir.isDirectory()){
			File[] subs = dir.listFiles();
			for(File sub:subs){
				delete(sub);
			}
		}
		dir.delete();
		
	}
}
