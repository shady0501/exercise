package LabWork8;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestFileStream {
	private FileInputStream inf;
	private FileOutputStream outf;
	
	public TestFileStream(File file) throws IOException{
		creatfile(file);
		this.inf = new FileInputStream(file);
		this.outf = new FileOutputStream(file);
	}
	
	public static void creatfile(File file) throws IOException{
		if(!file.exists() || !file.isFile())
			file.createNewFile();
	}
	
	public void close() throws IOException{
		inf.close();
		outf.close();
	}
	
	public int read()throws IOException{
		return inf.read();
	}
	
	public void write(int arg) throws IOException{
		outf.write(arg);
	}
	
	public void write(byte[] arg) throws IOException{
		outf.write(arg);
	}
	
	public int avalible() throws IOException{
		return inf.available();
	}
	
	public static void main(String[] args) {
		try {
//			File file = new File("D:/test.txt");
//			TestFileStream tester = new TestFileStream(file);
//			tester.write(90);
//			tester.write('b');
//			tester.write(new String("好").getBytes());
//			tester.write('C');
//			tester.write('O');
//			tester.write('S');
//			tester.write('E');
//			tester.write(new String("软").getBytes());
//			tester.write(new String("件").getBytes());
//			tester.write(new String("学").getBytes());
//			tester.write(new String("院").getBytes());
//			System.out.println(tester.avalible()+" size1");
//			int i = tester.read();
//			while(i != -1)
//			{
//				System.out.println(i);
//				System.out.println((char)i);
//				i = tester.read();
//			}
			
			File file1 = new File("D:/tester.txt");
			//TestFileStream tester1 = new TestFileStream(file1);
			FileWriter writer = new FileWriter(file1,true);
			writer.write("COSE".toCharArray());
			writer.write("软件学院".toCharArray());
			//writer.flush();
			FileReader reader = new FileReader(file1);
			int cha = reader.read();
			while(cha != -1)
			{
				System.out.println((char)cha);
				cha = reader.read();
			}
		}
		catch(IOException e) {
			
		}
	}
}
