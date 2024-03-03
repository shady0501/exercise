package LabWork7;

public class BadObjectException extends Exception {
	private Object badObject;
	
	public BadObjectException(Object object, String str){
		super(str);
		this.badObject = object;
	}
	
	public Object getBadObject() {
		return this.badObject;
	}
}
