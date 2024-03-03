package genericType;

public class Plate<E> {
	private E item;
	
    public Plate(E e){
    	item = e;
    }
    
    public void set(E e){
    	item = e;
    }
    
    public E get(){
    	return item;
    }
    
    public static void main(String[] args) {
    	Plate<Fruit> plate1 = new Plate<Fruit>(new Fruit());
    	plate1.get();
    	
    	Plate<Apple> plate2 = new Plate<Apple>(new Apple());
    	plate2.get();
    	
    	Plate<Fruit> plate3 = new Plate<Apple>(new Apple());
    	plate3.get();
    	
    }
}
