package sec07_user_define_exception;

public class Account {
	//필드
	private long balance;
	
	//생성자
	public Account() {}

	//getter : private 필드의 값을 수정해서 리턴 해줌
	//source의 getter setter 자동생성 기능을 사용
	public long getBalance() {
		return balance;
	}
	//입금 메소드
	public void deposit(int money) {
		balance += money;
	}
	//해당 출금메소드에서 throws 가 던진 예외를
	//AccountExample 실행 클래스에서 
	//try_catch로 예외 처리 해줘야함
	public void withdraw(int money) throws BalanceInsufficientException {
		//사용자 정의 예외 코딩 구역
		//예치금보다 출금액이 크다면 
		//throw new 사용자정의예외코드 클래스(); 를 호출한다.
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money-balance) + "모자람");
		}
		balance -= money;
	}
}
