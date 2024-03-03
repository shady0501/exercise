package StudentInforSystem;

public class Student{
	private int id;
	private String name;
	private boolean gender;
	private int javaScore;
	
	private static int counter = 0;
	public int getCounter(){
		return counter;
	}
	public void finalize() {
		counter--;
	}
	
	public void setStudentId(int id) {
		this.id = id;
	}
	public void setStudentName(String name) {
		this.name = name;
	}
	public void setStudentGender(boolean gender) {
		this.gender = gender;
	}
	public void setStudentJavaScore(int score) {
		this.javaScore = score;
	}
	
	public int getStudentId() {
		return id;
	}
	public String getStudentName() {
		return name;
	}
	public boolean getStudentGender() {
		return gender;
	}
	public int getStudentJavaScore() {
		return javaScore;
	}
}