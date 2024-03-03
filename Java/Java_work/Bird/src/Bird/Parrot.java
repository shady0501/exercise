package Bird;

public class Parrot extends Bird {
		public void eat() {
			System.out.println("eat");
	}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Bird p = new Parrot();
			p.eat();
		}
}
