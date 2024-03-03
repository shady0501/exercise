package labWork10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.nio.*;
import java.nio.channels.*;

public class C_Transaction {
	private ArrayList<M_Account> account;
	
	
	public float calculateInterest() {
		float interest = 0;
		
		return interest;
	}
	
	public float calculateTime() {
		float time = 0;
		
		return time;
	}
	
	public void Deposit(float money) {
		long time = System.currentTimeMillis();
		M_Account account = new M_Account(money,time,1);
		
	}
	
	public void Withdrawal(float money) {
		long time = System.currentTimeMillis();
		M_Account account = new M_Account(money,time,2);
	}
	
	public void GetBalance() {
		long time = System.currentTimeMillis();
		M_Account account = new M_Account(time,3);
	}
	
	public void write(M_Account account) throws IOException{
		try {
			ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("d:/testt.dat"));
			byte[] b = account.toString().getBytes();
			file.write(b);
		}
		catch(IOException e) {
			System.out.println("error!!!");
		}
	}
	
	public M_Account read()throws IOException,ClassNotFoundException{
		M_Account account = new M_Account();
		try {
			ObjectInputStream file = new ObjectInputStream(new FileInputStream("d:/testt.dat"));
			account = (M_Account)file.readObject();
			return account;
		}
		catch(Exception e) {
			System.out.println("ERROR");
		}
		return account;
	}
}
