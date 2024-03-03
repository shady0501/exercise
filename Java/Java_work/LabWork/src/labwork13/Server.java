package labwork13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public void server() {
		try {
		ServerSocket ser = new ServerSocket(8088);
		System.out.println("服务器已启动");
		Socket socket = ser.accept();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),true);
			while(true) {
				String str = in.readLine();
				if(str != null && str.equals("你好"))
						out.println("你好，我是服务器");
				else 
					out.println("听不懂");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			socket.close();
			ser.close();
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Server serve = new Server();
		serve.server();
	}
}
