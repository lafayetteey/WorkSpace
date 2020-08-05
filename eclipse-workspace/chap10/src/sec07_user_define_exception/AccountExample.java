package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ�: " + account.getBalance());
		
		//����ϱ�
		try {
			account.withdraw(19000);
			System.out.println("���ݾ�: " + account.getBalance());
		} catch (BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			System.out.println(e.toString());
			
		}

	}

}
