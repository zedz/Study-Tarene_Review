package day26xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket server;
	
	public Server(){
		try {
			server =  new ServerSocket(8088);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void start() {
		BufferedReader br = null;
		try {
			Socket socket = server.accept();
			InputStream in = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(in,"utf-8");
			br = new BufferedReader(isr);
			String line = null;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			System.out.println("done");
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}
}
