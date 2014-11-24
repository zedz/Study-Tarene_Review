package day23;

import java.util.Date;

/**
 * 编写计时线程，每隔5秒钟输出当前的日期-时间，主线程结束后计时完毕
 * 
 * @author Jamie
 *
 */
public class Assignment {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println(new Date());
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		t1.setDaemon(true);
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
