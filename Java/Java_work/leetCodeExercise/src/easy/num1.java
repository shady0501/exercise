package easy;

public class num1 {
	 public static int[] twoSum(int[] nums, int target) {
	        int[] a = new int[2];

	        for(int i=0;i<nums.length;++i){
	            for(int j=i+1;j<nums.length;++j){
	            	int sum = nums[i]+nums[j];
	                if(sum==target)
	                    a[0]=i;
	                    a[1]=j;	                
	            }
	        }

	        return a;
	    }
	 
	 public static void main(String[] args) {
//		 Scanner scanner = new Scanner(System.in);
//		 scanner.nextInt();
		 int[] nums = {2,7,11,15};
		 int target = 9;
		 int[] b = twoSum(nums,target);
		 for(int i=0;i<b.length;++i) {
			 System.out.print(b[i]);
		 }
	 }
}
