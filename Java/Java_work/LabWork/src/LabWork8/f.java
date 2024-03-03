package LabWork8;

import java.io.File;
import java.io.IOException;

public class f {
	f(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File(".");
		
		try {
			System.out.println(f.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
