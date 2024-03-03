package LabWork7;

public class Person implements Cloneable {
	private int age;
	private String name;
	
	public Person(String n,int a) {
		this.age = a;
		this.name = n;
	}
	
	@Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
