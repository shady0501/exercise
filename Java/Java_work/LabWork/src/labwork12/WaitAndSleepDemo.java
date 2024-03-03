package labwork12;

import java.util.ArrayList;

public class WaitAndSleepDemo {
	public class MyTask1 implements Runnable{
		public synchronized void run() {
			String name = Thread.currentThread().getName();
			System.out.println(name + " started.");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			System.out.println(name + " ended.");
		}
	}
	
	public class MyTask2 implements Runnable{
		public synchronized void run() {
			String name = Thread.currentThread().getName();
			System.out.println(name + " started.");
			try {
				wait(1000);
			}
			catch(Exception e) {
				
			}
			System.out.println(name + " ended.");
		}
	}
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		WaitAndSleepDemo test = new WaitAndSleepDemo();
		//MyTask1 task1 = test.new MyTask1();//10077ms
		MyTask2 task1 = test.new MyTask2();//1015ms
		ArrayList<Thread> threadGroup = new ArrayList<Thread>();
		for(int i=0;i<10;++i) {
			Thread t = new Thread(task1,"thread"+i);
			threadGroup.add(t);
			t.start();
//			try {                   //为什么不能这么写?
//				t.join();           //这样会导致下一个线程还未开始本线程已结束
//			}						//最终相当于单线程
//			catch(Exception e) {
//			}
		}
		for(int i=0;i<threadGroup.size();++i) {
			Thread t= threadGroup.get(i);
			try {
				t.join();
			}
			catch(Exception e) {
			}
		}
		System.out.println("time: "+(System.currentTimeMillis()- begin)+" ms.");
	}
}
