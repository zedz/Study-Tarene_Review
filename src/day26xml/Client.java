package day26xml;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {
	Socket socket;
	
	public Client(){
		try {
			socket = new Socket("localhost", 8088);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			FileInputStream fis = new FileInputStream(new File("emp.xml"));
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			br = new BufferedReader(isr);
			String line = null;
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			while((line=br.readLine())!=null){
				pw = new PrintWriter(osw);
				pw.println(line);
			}
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
			if(pw!=null){
				pw.close();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}

}
