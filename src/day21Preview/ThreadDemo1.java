package day21Preview;

public class ThreadDemo1 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println("runner:"+i);
				}
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<100;i++){
			System.out.println("main:"+i);
		}
	}
}
