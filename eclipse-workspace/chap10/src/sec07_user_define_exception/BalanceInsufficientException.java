package sec07_user_define_exception;

//����� ���� ���ܸ� �߻���Ű���� ���ܸ� ���extends �޾ƾ��Ѵ�.
public class BalanceInsufficientException extends Exception {
	//����� ���� ���� �ۼ� �ڵ�� 
	//�߿��ϴ� �ܿ���!
	//������1
	public BalanceInsufficientException() {}
	
	//���ܹ߻� ������ �Է��Ҽ��յ��� �Ű����� ���� ��
	//super�� �θ� �����ڿ� �Ű������� �����Ѵ�.
	//������2
	public BalanceInsufficientException(String message) {
		super(message);
	} 
}
