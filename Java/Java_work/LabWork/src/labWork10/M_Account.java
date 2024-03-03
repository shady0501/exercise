package labWork10;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class M_Account {
	private String name;
	private float money;
	private long time;
	private int selectItem;
	
	public M_Account() {
		name = "";
		money = 0;
		selectItem = 3;
		time = 0;
	}
	
	public M_Account(float mon, long tim, int select) {
		money = mon;
		time = tim;
		selectItem = select;
	}
	
	public M_Account(long tim,int select) {
		time = tim;
		selectItem = select;
	}
}
