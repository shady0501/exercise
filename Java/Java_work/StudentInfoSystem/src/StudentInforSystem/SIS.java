package StudentInforSystem;
import java.util.Scanner;

public class SIS {
	private Student[] students;
	Student stu = new Student();
	private int getCounter() {
		return stu.getCounter();
	}
	
	public void setStudentsArray(int id,String name,boolean gender,int javaScore) {
		Student tempStudent = new Student();
		
		tempStudent.setStudentId(id);
		tempStudent.setStudentName(name);
		tempStudent.setStudentGender(gender);
		tempStudent.setStudentJavaScore(javaScore);
		
		if(getCounter()>0) {
			students[getCounter()-1] = tempStudent;
		}
	}

	public void Sort() {
		for(int i=0;i<getCounter();++i){
			for(int j=i;j<getCounter();++j) {
				if(students[i].getStudentJavaScore()<students[j].getStudentJavaScore()) {
					Student tempstu = students[i];
					students[i] = students[j];
					students[j] = tempstu;
				}
			}
		}
	}
}
