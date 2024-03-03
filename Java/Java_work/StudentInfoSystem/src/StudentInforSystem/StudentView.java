package StudentInforSystem;
import java.util.Scanner;

public class StudentView {
		SIS sis = new SIS();
		
		public void read() {
			System.out.println("id:");
			Scanner sc = new Scanner(System.in);
			int id = sc.nextInt();

			System.out.println("name:");
			String name = sc.nextLine();
			
			System.out.println("id:");
			boolean gender = sc.nextBoolean();
			
			System.out.println("id:");
			int score = sc.nextInt();
			
			sis.setStudentsArray(id,name,gender,score);
		}
		
		public void run() {
			read();
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentView view = new StudentView();
		view.run();
	}
}