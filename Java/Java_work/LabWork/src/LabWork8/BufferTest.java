package LabWork8;

import java.io.*;
import java.util.ArrayList;

public class BufferTest {
	private ArrayList<Integer> StoreSource;
	private ArrayList<Integer> StoreTarget;
	private final int max = 500000;
	private File file;
	
	public static int getRandom() {
		return (int)(Math.random()*255);
	}
	
	private void setStore() {
		for(int i=0;i<max;i++)
		{
			StoreSource.add(getRandom());
		}
	}
	
	public BufferTest(File file) {
		this.StoreSource = new ArrayList<Integer>();
		this.StoreTarget = new ArrayList<Integer>();
		this.setStore();
		this.file = file;
	}
	
	private void useFileInputStream()throws IOException{
		FileInputStream inf = new FileInputStream(file);
		int value = inf.read();
		while(value != -1)
		{
			this.StoreTarget.add(value);
			value = inf.read();
		}
		inf.close();
	}
	
	private void useFileOutputStream()throws IOException{
		FileOutputStream outf = new FileOutputStream(file);
		for(int i=0;i<this.StoreSource.size();++i) {
			outf.write(StoreTarget.get(i)));
		}
		outf.close();
	}
	
	private void useBufferInputStream()throws IOException{
		BufferedInputStream binf = new BufferedInputStream(new FileInputStream(file));
		int value = binf.read();
		while(value != -1)
		{
			this.StoreTarget.add(value);
			value = binf.read();
		}
		binf.close();
	}
	
	private void useBufferOutputStream()throws IOException{
		BufferedOutputStream boutf = new BufferedOutputStream(new FileOutputStream(file));
		for(int i=0;i<this.StoreSource.size();++i) {
			boutf.write(StoreTarget.get(i));
		}
		boutf.close();
	}
	
	private void test() throws IOException() {
		System.gc();
		long time1 = System.currentTimeMillis();
		this.useFileOutputStream();
		long time2 = System.currentTimeMillis();
		this.useFileinputStream();
		
	}
}
