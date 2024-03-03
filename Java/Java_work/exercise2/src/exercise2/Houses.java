package exercise2;
import java.util.ArrayList;

public class Houses {
	public static int number=0;
	private String name;
	
	public Houses(){
		number++; 
		name = "";
	}
	
	public static void main(String[] args) {
			System.gc();
			System.out.println("Memoery1:"+Runtime.getRuntime().freeMemory());
			System.out.println("Creating houes...");
			ArrayList<Houses> area = new ArrayList<Houses>();			
			
			for(int i=0; i<2000000;++i){
				area.add(new Houses());
			}
			System.out.println("HouseNumber="+number);
			System.out.println("Memoery2:"+Runtime.getRuntime().freeMemory());

			System.out.println("Collecting garbage...");
			System.gc();
			System.out.println("Memoery3:"+Runtime.getRuntime().freeMemory());
			System.out.println("--------------");
		}
}
