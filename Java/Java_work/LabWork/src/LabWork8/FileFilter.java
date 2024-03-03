package LabWork8;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class FileFilter {
	ArrayList<File> files;
	File path;
	String suffix;
	
	public FileFilter(File path, String suffix) {
		this.files = new ArrayList<File>();
		this.path  = path;
		this.suffix = suffix;
	}
	
	public void filter() {
		if(path.isDirectory()) {
			File[] fileInThisPath = path.listFiles();
			for(File f:fileInThisPath) {
				if(f.isDirectory()) {
					path = f;
					System.out.println("path = "+path);
					filter();
				}
				else if(path.toString().endsWith(suffix)) {
					files.add(f);
					System.out.println("match successfully");
				}
				System.out.println("path.toString = "+ path.toString());
					System.out.println("suffix = "+suffix);
			}
		}
	}
	
	public void reserve() {
		Collections.sort(files,(f1,f2)->-f1.compareTo(f2));
		System.out.println(files.toString());
	}

	public static void main(String[] args) {
		FileFilter lister = new FileFilter(new File("d://fff/"),".txt");
		lister.filter();
		lister.reserve();
	}
}
