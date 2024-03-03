package exercise2;

public class Son extends Father {
	String name = "Son";
	
	public void print() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father s = new Son();
		s.showName();
	}

}
