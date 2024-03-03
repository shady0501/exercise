package labwork12;

public class JoinDemo extends Thread{
	public void run() {
//		String name = Thread.currentThread().getName();//测试join()
//		System.out.println(name+ " Thread started");
//		for(int i=0;i<10;++i) {
//			System.out.println(name + "Thread is running");
//		}
//		System.out.println(name + "Thread ended");
		
		System.out.println("Thread started");
//		while(true) {
//			try{
//				System.out.println("Thread running");
//				Thread.sleep(1000);
//			}
//			catch(InterruptedException e) {
//				System.out.println("interrupted, Thread ended");
//				return ;
//			}
//		}
		int i = 1;
		while(!interrupted()) {
			System.out.println("Thread running"+ i++);
		}
		System.out.println("interrupted, Thread ended");
	}
	
	public static void main(String[] args) {
//		System.out.println("Main started");//测试join()
//		Thread t1 = new JoinDemo();
//		t1.setName("t1");
//		t1.start();
//		Thread t2 = new JoinDemo();
//		t2.setName("t2");
//		t2.start();
//		try {
//			t1.join();
//			t2.join();
//		}
//		catch(Exception e) {
//			
//		}
//		System.out.println("main ended");
		
		System.out.println("Main started");
		
		try {
			Thread t1 = new JoinDemo();
			t1.start();
			Thread.sleep(1000);
			t1.interrupt();
		}
		catch(Exception e) {
			
		}	
		System.out.println("main ended");
	}
}
