package sec07_user_define_exception;

public class Account {
	//�ʵ�
	private long balance;
	
	//������
	public Account() {}

	//getter : private �ʵ��� ���� �����ؼ� ���� ����
	//source�� getter setter �ڵ����� ����� ���
	public long getBalance() {
		return balance;
	}
	//�Ա� �޼ҵ�
	public void deposit(int money) {
		balance += money;
	}
	//�ش� ��ݸ޼ҵ忡�� throws �� ���� ���ܸ�
	//AccountExample ���� Ŭ�������� 
	//try_catch�� ���� ó�� �������
	public void withdraw(int money) throws BalanceInsufficientException {
		//����� ���� ���� �ڵ� ����
		//��ġ�ݺ��� ��ݾ��� ũ�ٸ� 
		//throw new ��������ǿ����ڵ� Ŭ����(); �� ȣ���Ѵ�.
		if(balance < money) {
			throw new BalanceInsufficientException("�ܰ����:" + (money-balance) + "���ڶ�");
		}
		balance -= money;
	}
}
