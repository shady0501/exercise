package LabWork3;

public class Student {
	private int id;
	private String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean equals(Object b) {		
		return (this.id == ((Student)b).id) ;
		
//		if(this.id == ((Student)b).id) 
//			return true;
//		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student("tom",1);
		Student b = new Student("Mark",1);
			System.out.println(a.equals(b));
	}

}
