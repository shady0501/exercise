package labwork13;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;

public class netWork {
	public void getIP() {
		try {
			InetAddress iAddress = InetAddress.getLocalHost();
			
			String localIP = iAddress.getHostAddress().toString();
			
			String hostName = iAddress.getHostName().toString();
			System.out.println("IP:"+localIP);
			System.out.println("主机名："+hostName);
		}
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getALLIP(){
		ArrayList<String> allIP = new ArrayList<String>();
		try {
			String hostName = InetAddress.getLocalHost().getHostName();
			if(hostName.length()>0) {
				InetAddress[] addresses = InetAddress.getAllByName(hostName);
				for(int i=0;i<addresses.length;++i) {
					allIP.add(addresses[i].getHostAddress().toString());
				}
			}
			return allIP;
		}
		catch(Exception e){
			e.printStackTrace();
			return allIP;
		}
	}
	
	private static final int TIMEOUT = 5000;
	
	public void ping(InetAddress addr) {
		try {
			String hostName = addr.getHostName();
			int i =0;
			while(true) {
				if(addr.isReachable(TIMEOUT)) {
					System.out.println(i++ +"Reply from "+hostName+" within "+TIMEOUT+" ms");
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		netWork net = new netWork();
		net.getIP();
		ArrayList<String> list = net.getALLIP();
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("ip:"+iterator.next());
		}
		try {
		InetAddress addr1 = InetAddress.getLocalHost();
		InetAddress addr2 = InetAddress.getByName("127.0.0.1");
		InetAddress addr3 = InetAddress.getByName("cose.seu.edu.cn");
		net.ping(addr2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
