package sec06_thorws;

public class ThrowsExample {
	public static void main(String[] args) {
		//throws 예외처리를 여기로 던짐
		//예외처리를 위해 여기서 try _ catch 문을 작성해줌
		try {			
		findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재 하지 않습니다.");
		}
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
