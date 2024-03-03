package labwork12;

public class TScheduling implements Runnable{
	public void run() {
		while(true) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is running");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Runnable myTask = new TScheduling();
		Thread t1 = new Thread(myTask);
		t1.setName("t1");t1.setPriority(10);
		Thread t2 = new Thread(myTask);
		t2.setName("t2");t2.setPriority(1);
		t1.start();t2.start();
	}
}
