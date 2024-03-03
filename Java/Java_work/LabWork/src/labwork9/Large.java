package labwork9;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class Large {
	static int length = 1024*1024*1024;
	public static void main(String args[]) throws Exception{
		MappedByteBuffer out = new RandomAccessFile("d:/tt.txt","rw").
				getChannel().map(FileChannel.MapMode.READ_WRITE,0,length);
		long begin = System.currentTimeMillis();
		for (int i=0;i<length;++i) {
			out.put((byte)'x');
			
		}
		long end = System.currentTimeMillis();
		
		System.out.println("Finish writing using "+(end-begin)+" ms.");
		for(int i = length/2;i<length/2+6;++i) {
			System.out.println((char)out.get(i));
		}
		
	}
}
