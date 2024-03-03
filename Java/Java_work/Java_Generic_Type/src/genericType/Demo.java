package genericType;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void printList(List<?> list) {
	    for (Object elem: list) {
	        System.out.print(elem + " ");
	    }
	}
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(123);
		list1.add(456);
		printList(list1);
	}
}
