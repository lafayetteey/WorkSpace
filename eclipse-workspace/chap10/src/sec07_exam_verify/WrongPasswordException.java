package sec07_exam_verify;

public class WrongPasswordException extends Exception {
	
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}
