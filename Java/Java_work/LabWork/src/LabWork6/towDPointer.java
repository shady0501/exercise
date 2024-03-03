package LabWork6;
import java.lang.Math;

public class towDPointer {
	public int x;
	public int y;
	
	public towDPointer(int x, int y){
		this.x = x;
		this.y = y;
	}

	public double distance() {
		double dis = 0;
		dis = Math.sqrt(this.x^2 + this.y^2);
		return dis;
	}
	
	public int projection() {
		int pro = 0;
		pro = x*y;
		return pro;
	}
}
