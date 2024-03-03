package LabWork5;

public class BenchmarkImpl extends benchmark{
	
	public BenchmarkImpl() {
		
	}
	
	@Override
	public int[] sorting1(int[] input) {
		
		for(int i=0;i<input.length;++i) {
			for(int j=i;j<input.length;++j) {
				if(input[i]>input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		return input;
	}
	
	@Override
	public int[] sorting2(int[] input) {
		
				
		return input;
	}
}
