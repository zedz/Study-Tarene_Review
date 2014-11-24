package day21Preview;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ServerListener extends Thread {
	@SuppressWarnings("resource")
	@Override
	public void run() {
		try {
			ServerSocket serverSocket = new ServerSocket(12345);
			while (true) {
				Socket socket = serverSocket.accept();
				JOptionPane.showMessageDialog(null, "有客户端连接到本机的12345端口");
				new ChatSocket(socket).start();;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
