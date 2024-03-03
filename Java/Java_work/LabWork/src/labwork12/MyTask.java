package labwork12;

public class MyTask implements Runnable{
	//method1
//	public void run() {
//		while(true) {
//			System.out.println(Thread.currentThread().getName()+" is doing MyTask");
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
	
	public void run() {
		for(int i=0;i<100;++i) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName+ " is running "+i+" times");
		}
	}
	
	public static void main(String[] args) {
//		Thread thread = new Thread(new MyTask(),"My thread");
//		thread.start();
		System.out.println(Thread.currentThread().getName()+" is running");
		Runnable MyTask = new MyTask();
		Thread thread1 = new Thread(MyTask);
		thread1.setName("thread1");
		Thread thread2 = new Thread(MyTask);
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
		System.out.println(Thread.currentThread().getName()+" is running");
	}
}
