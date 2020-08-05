package args;

public class MainArgs {

	public static void main(String[] args) {
		System.out.println("전달값 갯수: " + args.length);
		for(int i =0; i<args.length; i++) {
			System.out.println(i + "번째 값: " + args[i]);
		}
	}

}
