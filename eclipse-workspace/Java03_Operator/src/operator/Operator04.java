package operator;

public class Operator04 {

	public static void main(String[] args) {
		//비교연산자(관계연산자)
		// -> 두 개의 변수의 관계를 따지는 연산자
		// -> 비교 연산자는 조건을 만족하면 true , 만족하지 못하면 false 를 리턴
		Operator04 op = new Operator04();
		op.opTest();
		System.out.println();
		
		new Operator04().opTest();
		
	}
	public void opTest() {
		int a = 10 , b = 20;
		
		boolean res, res1, res2, res3;
		
		res = (a != b);
		res1 = (a == b);
		res2 = (a <= b);
		res3 = (a >= b);
		
		System.out.println("a == b: " + res1);
		System.out.println("a <= b: " + res2);
		System.out.println("a >= b: " + res3);
		
		
	}

}
