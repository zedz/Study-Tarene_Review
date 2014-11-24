package day21Preview;

import java.io.IOException;
import java.net.Socket;

public class ChatSocket extends Thread {
	Socket socket;
	
	public ChatSocket(Socket socket){
		this.socket = socket;
	}
	
	public void out(String str) {
		try {
			socket.getOutputStream().write(str.getBytes("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true){
			count++;
			out("loop+"+count);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
