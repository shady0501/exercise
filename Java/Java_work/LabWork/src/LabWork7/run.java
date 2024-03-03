package LabWork7;

public class run {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person p1 = new Person("Tom",18);
	Person p2 = new Person("Tom",18);
	Person p3 = new Person("Jack",18);
	Person p4 = p1;
	Person p5 = null;
	
	try {
		p5 = (Person)p1.clone();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	Person source = p1;
	Person target = p2;
	
	try {
		if(source.hashCode() != target.hashCode()) throw(new BadObjectException(target,""));
		else System.out.println("Same HashCode");
	}
	catch(BadObjectException ee) {
		System.out.println("The source hashCode: "+source.hashCode());
		System.out.println("Bad object hashCode: "+ ((Person)ee.getBadObject()).hashCode());
	}
	
	}
}

