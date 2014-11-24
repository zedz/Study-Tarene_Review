package day21Preview;

import java.util.Date;

public class ThreadDemo2 {
	public static void main(String[] args) {
		Thread t = new Thread(){
			@Override
			public void run() {
				while(true){
					System.out.println(new Date());
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		};
		
		t.start();
		try {
			Thread.sleep(10000);
			t.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
