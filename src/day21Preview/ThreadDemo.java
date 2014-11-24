package day21Preview;

class MyThread implements Runnable{
	private int tickets = 5;
	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
				if(tickets>0){
					System.out.println(name+"tickets:"+tickets--);
				}
			}
		}
		
	}
	
}

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread m1 = new MyThread("A");
//		MyThread m2 = new MyThread("B");
//		MyThread m3 = new MyThread("C");
		Thread t1 = new Thread(m1,"A");
		Thread t2 = new Thread(m1,"B");
		Thread t3 = new Thread(m1,"C");
		t1.start();
		t2.start();
		t3.start();
	}
}
