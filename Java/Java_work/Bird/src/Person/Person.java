package Person;

public class Person {
	private String name;
	private int age;
	public static int counter=0;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		counter++;
	}
	
	protected void finalize() {
		counter--;
	}
	
	public void greet() {
		System.out.println("Hello, I'm "+name+", and I'm "+age+" years old.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<1000000;++i) {
			Person tom = new Person("Tom",18);
			//tom.greet();
		}
		
		System.out.println(counter);
	}

}
