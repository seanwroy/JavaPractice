package JavaSemester2;

//Creating a new exception
public class BadSumException extends Exception {
	public BadSumException() {
		super();
	}
	
	public BadSumException(String message) {
		super(message);
	}
}
