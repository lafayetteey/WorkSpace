package sec07_exam_verify;

public class NotExistIDException extends Exception {
	
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}
