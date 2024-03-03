package Student;
/**
 * @author xpy05
 * 
 */
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
		else
			males = "female";
		System.out.print("Hello, I am "+name+". I am a "+males+" student, and I am from Class "+id+".");
	}
	
	public void input(String nam, String age)
	{
		name = nam;
		male = true;
		id = Integer.parseInt(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("name:"+args[0]+"  age:"+args[1]);
	}

}
