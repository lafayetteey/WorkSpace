package singleton;

public class Singleton {
	//�̱����� �� �ϳ��� ��ü���� �����ؼ� ����ϴ� ������ ����
	//��ü�� �ϳ� �̻� �������� ���ϵ��� private �����ڸ� ���
	//[1]
	//private Singleton() {}
	
	
	//[2]
//	private Singleton() {
//		
//	}
//	
//	public static Singleton getInstance() {
//		return new Singleton();
//		
//	}

	//[3]
	private static Singleton one;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(one==null) {
			one = new Singleton();
		} 
		return one;
	}
	
	
	
	
	
	
	
	
}
