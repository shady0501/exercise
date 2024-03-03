package labwork11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Array {
		public static int[][] a = new int[][] {{0},{1,2,3,5,4}};
		public static int[][] b = new int[][] {{0},{1,2,3,5,4}};
		
		public void class1() {
			String[] str1 = new String [10];
			String[] str2 = new String[10];
			Arrays.fill(str2, "Kobe");
			Arrays.fill(str1, "Kobe");
			System.out.println(Arrays.hashCode(str1));
			System.out.println(Arrays.hashCode(str2));
			System.out.println(Arrays.equals(str1,str2));
			System.out.println(Arrays.toString(str1));
			System.out.println(Arrays.toString(str2));
		
			System.out.println(Arrays.equals(a, b));
			System.out.println(Arrays.deepEquals(a, b));
			System.out.println(a.equals(b));
			
			System.out.println("");
		}
		
		public void class2() {
			ArrayList<String> list = new ArrayList<String>();
			list.add("kobe");
			String x = list.get(0);
			System.out.println("ArrayList test: "+list.size()+" "+x);
			
			System.out.println("");
		}
		
		public void class3() {
			ArrayList<String> list = new ArrayList<String>();
			list.add("S");
			list.add("D");
			list.add("S");
			list.add("S");
			list.add("E");
			System.out.println("before" + list);
			list.remove("S");
			System.out.println("after" + list);
			
			System.out.println("");
		}
		
		public void Hashmap() {
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(123, "Tom");
			map.put(124,"Kate");
			map.put(125,"Linda");
			Iterator<Integer> interator = map.keySet().iterator();
			while(interator.hasNext()) {
				Integer key = interator.next();
				String value = map.get(key);
				System.out.println("Key = "+key+", value = "+value);
			}
			
			System.out.println("");
		}
		
	public static void main(String args[]) {
		Array arr = new Array();
		arr.class1();
		arr.class2();
		arr.class3();
		arr.Hashmap();
	}
}
