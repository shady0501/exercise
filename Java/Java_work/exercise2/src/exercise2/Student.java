package exercise2;

public class Student {
	private String name;
	private int age;
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name;
	}
	
	public void greet() {
		System.out.println("Hello, I'm "+name);
	}
	
	public static void main(String[] args) {
		Student tom = new Student("tom",10);
		System.out.println(tom);//打印tom对应的地址；覆盖toString（）后打印姓名
		System.out.println(tom.toString());//打印tom对应的地址，为上一句的全称
		System.out.println(tom.getClass());//打印tom对应的类
		System.out.println(tom);
		tom.greet();
	}
}
