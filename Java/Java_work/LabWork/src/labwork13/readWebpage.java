package labwork13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class readWebpage {
	public static void main(String[] args) {
		try {
			URL coseURL= new URL("https://baidu.com");
			URLConnection connection = coseURL.openConnection();
			BufferedReader in = new BufferedReader(
					new InputStreamReader(connection.getInputStream()));
			String html = in.readLine();
			//System.out.println("hello");
			while(html!= null) {
				//System.out.println("hello2");
				System.out.println(html);
				html = in.readLine();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
