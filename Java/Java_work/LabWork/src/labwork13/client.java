package labwork13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {
	public static void main(String[] args) {
		try {
		Socket socket = new Socket("localhost",8088);
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(
						socket.getOutputStream())),true);
		out.println("你好");
		System.out.println("w:你好");
		System.out.println("fwq:"+in.readLine());
		Thread.sleep(1000);
		out.println("今天星期几");
		System.out.println("w:今天星期几");
		System.out.println("fwq:"+in.readLine());		
		socket.close();
		}
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
