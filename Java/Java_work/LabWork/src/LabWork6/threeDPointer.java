package LabWork6;
import java.lang.Math;

public class threeDPointer extends towDPointer{
	public int z;
	
	public threeDPointer(int x, int y, int z) {
//		this.x = x;//用此方法在towDPointer中必须写空构造函数！！！
//		this.y = y;//用此方法在towDPointer中必须写空构造函数！！！
		
		super(x,y);//用此方法在towDPointer中无需写空构造函数
		this.z = z;
	}
	
	public double distance() {
		double dis = 0;
		dis = Math.sqrt(x*x + y*y + z*z);
		return dis;
	}
	
}
