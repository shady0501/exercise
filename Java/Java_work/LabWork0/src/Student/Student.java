package Student;
import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private boolean male;
	
	public Student(String names, boolean males, int ids)
	{
		name = names;
		male = males;
		id = ids;
	}
	
	public void greet()
	{
		String males;
		if(male == true)
			males = "male";
		else if(male == false)
			males = "female";
		else {
			System.out.println("作为默认值true处理");
			males = "male";
		}
		System.out.print("Hello, I am "+name+". I am a "+males+" student, and I am from Class "+id+".");
	}
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入姓名：");
		name = sc.next();
		System.out.print("性别是否为男(true or false)：");
		male = sc.nextBoolean();
		System.out.print("请输入班级：");
		id = sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("",true,0);
		stu.input();
		stu.greet();
	}

}
