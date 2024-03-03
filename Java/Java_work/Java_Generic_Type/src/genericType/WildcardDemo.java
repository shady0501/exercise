package genericType;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {
	private static int countLength(List<? extends Dog> list) {
		return list.size();
	}
	
	private static int countLen(List<? super Dog> list) {
		return list.size();
	}

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
	    List<Pig> pigs = new ArrayList<>();
	    List<Dog> dogs = new ArrayList<>();
	    List<Cat> cats = new ArrayList<>();
	    List<Poodle> poodles = new ArrayList<>();
	    
	    int sum = 0;
	    //sum += countLength(animals);
	    //sum += countLength(pigs);
	    sum += countLength(dogs);
	    //sum += countLength(cats);
	    sum += countLength(poodles);
	    
	    sum += countLen(animals);
	    //sum += countLen(pigs);
	    sum += countLen(dogs);
	    //sum += countLen(cats);
	    //sum += countLen(poodles);
	    
	    System.out.println(sum);
	}
}

class Animal {
}

class Pig extends Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
	
class Poodle extends Dog {	
}

