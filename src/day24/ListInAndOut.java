package day24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListInAndOut {
	public static void main(String[] args) {
		ListBucket listBucket = new ListBucket();
		ListIn listIn = new ListIn();
		ListOut listOut = new ListOut();
		
		Thread in = new Thread(listIn);
		in.start();
		
		Thread out = new Thread(listOut);
		out.start();
	}
}

class ListBucket{
	static List<String> list = new ArrayList<String>();
	
}


class ListIn implements Runnable{
	Scanner s = new Scanner(System.in);
	public void run() {
		String str = null;
		while(true){
			str = s.nextLine();
			ListBucket.list.add(str);
		}
	}
}

class ListOut implements Runnable{
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Iterator<String> it = ListBucket.list.iterator();
			if(it.hasNext()){
				System.out.println(it.next());
				it.remove();
			}
			
		}
	}
}