package singleton;

public class SingletonRun {

	public static void main(String[] args) {
		//[1]
		//Singleton sg = new Singleton();
		
		//[2]
		
//		
//		Singleton singleton2 = Singleton.getInstance();
//		System.out.println(singleton.hashCode());
//		System.out.println(singleton2.hashCode());
		
		//[3]
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		
	}

}
