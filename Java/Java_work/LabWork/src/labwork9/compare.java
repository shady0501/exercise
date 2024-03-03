package labwork9;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class compare {
	static int length = 1000;//1 1 8 8; 3 5 12 78; 7 14 16 686; 19 45 33 6611
	
	
	public static void main(String args[]) throws Exception{
	MappedByteBuffer mout = new RandomAccessFile("d:/t.txt","rw").
			getChannel().map(FileChannel.MapMode.READ_WRITE,0,length);
	
	DataOutputStream dout = new DataOutputStream(
			new BufferedOutputStream(new FileOutputStream(new File("t.txt"))));
	
	DataInputStream dput = new DataInputStream(
			new BufferedInputStream(new FileInputStream(new File("t.txt"))));
	
	RandomAccessFile ranout = new RandomAccessFile("t.txt","rw");
	
	System.gc();
	long mbegin = System.currentTimeMillis();
	for(int i=0;i<length;++i) {
		mout.put((byte)'x');
	}
	long mend = System.currentTimeMillis();
	System.out.println("Finish mappedByteBuffer writing using "+(mend-mbegin)+" ms.");
	
	System.gc();
	long dbegin = System.currentTimeMillis();
	for(int i=0;i<length;++i) {
		dout.write((byte)'x');
	}
	long dend = System.currentTimeMillis();
	System.out.println("Finish dataoutputStream writing using "+(dend-dbegin)+" ms.");
	
	System.gc();
	long dputbegin = System.currentTimeMillis();
	for(int i=0;i<length;++i) {
		dput.read();
	}
	long dputend = System.currentTimeMillis();
	System.out.println("Finish datainputstream writing using "+(dputend-dputbegin)+" ms.");
	
	System.gc();
	long ranbegin = System.currentTimeMillis();
	for(int i=0;i<length;++i) {
		ranout.write((byte)'x');
	}
	long ranend = System.currentTimeMillis();
	System.out.println("Finish randomAccessfile writing using "+(ranend-ranbegin)+" ms.");
	
	}
}
