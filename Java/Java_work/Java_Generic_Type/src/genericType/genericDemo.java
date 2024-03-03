package genericType;

import java.util.ArrayList;
import java.util.Iterator;

public class genericDemo {
	public void nullList() {
		ArrayList list = new ArrayList();
		list.add("SDS");
		list.add(1324);
		list.add('c');
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			String str = obj.toString();
			int len = str.length();
			System.out.print("len = " + len + "; ");
			System.out.println(obj);
		}
	}
	
	public void objectList() {
		ArrayList<Object> list = new ArrayList<>();
		list.add("SDS");
		list.add(1324);
		list.add('c');
		
		Iterator<Object> iterator = list.iterator();
		while(iterator.hasNext()) {
			Object obj = iterator.next();
			String str = obj.toString();
			int len = str.length();
			System.out.print("len = " + len + "; ");
			System.out.println(obj);
		}	
	}
	
	public void stringList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("SDS");
		list.add("1324");
		list.add("c");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			int len = str.length();
			System.out.print("len = " + len + "; ");
			System.out.println(str);
		}	
	}
	
	public static void main(String[] args) {
		genericDemo demo = new genericDemo();
		demo.nullList();
		System.out.println("--------------");
		demo.objectList();
		System.out.println("--------------");
		demo.stringList();
	}
}
