package LabWork6;

public class tester {
	public void run() {
		threeDPointer threeD = new threeDPointer(2,1,1);
		System.out.println(threeD.distance());
		System.out.println(threeD.projection());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tester test = new tester();
		test.run();
	}
}
