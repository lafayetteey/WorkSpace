package singleton;

public class Singleton {
	//싱글톤은 단 하나의 객체만을 생성해서 사용하는 디자인 패턴
	//객체를 하나 이상 생성하지 못하도록 private 접근자를 사용
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
