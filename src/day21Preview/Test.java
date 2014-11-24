package day21Preview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		ExecutorService threadpool = Executors.newFixedThreadPool(2);
		for (int i = 0; i < 5; i++) {
			Handler handler = new Handler();
			threadpool.execute(handler);
		}
	}
}

class Handler implements Runnable{
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("done");
		
	}
}