package LabWork5;
import java.util.Arrays;

public abstract class benchmark {
	public final int size = 1000;
	public final int runNumber = 100;
	public int[] input=new int[size];
	public int[] originInput=new int[size];
	
	public int[] getInput(){
        for (int i = 0; i < size; i++) {
            input[i]=(int)(Math.random()*size);
        }
        originInput= Arrays.copyOf(input,size);
        System.out.println("successful");
        return input;
    }
	
	abstract int[] sorting1(int[] input);
	abstract int[] sorting2(int[] input);
	
	public benchmark() {
	}
	
	public boolean validate() {
		Arrays.sort(input);
		return Arrays.equals(originInput, sorting1(input));
	}
	
	public void runTime() {
		
		for(int i=0;i<size;++i) {
			System.out.println(originInput[i]);
		}
		
		long millis1 = System.nanoTime();
		
		for(int i=0;i<runNumber;++i) {
			Arrays.sort(input);
		}
		
		long millis2 = System.nanoTime();
        long time1 = millis2-millis1;
        System.out.println("  java run time = "+time1/runNumber);
        
        long millis3 = System.nanoTime();
		
		for(int i=0;i<runNumber;++i) {
			sorting1(input);
		}
		
		long millis4 = System.nanoTime();
        long time2 = millis4-millis3;
        System.out.println("player run time = "+time2/runNumber);
    }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BenchmarkImpl mark = new BenchmarkImpl();
		//mark.getInput();
		mark.runTime();
		
	}
}
