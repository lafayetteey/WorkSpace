package sec07_user_define_exception;

//사용자 정의 예외를 발생시키려면 예외를 상속extends 받아야한다.
public class BalanceInsufficientException extends Exception {
	//사용자 정의 예외 작성 코드들 
	//중요하니 외우자!
	//생성자1
	public BalanceInsufficientException() {}
	
	//예외발생 이유를 입력할수잇도록 매개변수 선언 후
	//super로 부모 생성자에 매개값으로 전달한다.
	//생성자2
	public BalanceInsufficientException(String message) {
		super(message);
	} 
}
