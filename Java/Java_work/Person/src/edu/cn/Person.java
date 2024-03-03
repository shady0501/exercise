package edu.cn;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void greet()
	{
		System.out.println("hello, I'm "+name+", and I'm "+age+" years old.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person tom = new Person("Tom",18);
		tom.greet();
	}

}
