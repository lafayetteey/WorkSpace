package sec06_thorws;

public class ThrowsExample {
	public static void main(String[] args) {
		//throws ����ó���� ����� ����
		//����ó���� ���� ���⼭ try _ catch ���� �ۼ�����
		try {			
		findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ���� ���� �ʽ��ϴ�.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
