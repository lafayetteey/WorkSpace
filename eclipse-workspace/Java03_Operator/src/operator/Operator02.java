package operator;

public class Operator02 {
	public static void main(String[] args) {
		Operator02 op = new Operator02();
		//op.test1();
		op.test2();
	}
	
	public void test1() {
		int age = 19;		
		System.out.println("현재 나이는? " + age);		
		++age;
		System.out.println("++age의 결과는? " + age);		
		age++;
		System.out.println("age++의 결과는? " + age);		
		--age;
		System.out.println("--age의 결과는? " +age);		
		age--;
		System.out.println("age--의 결과는?" + age);
		
	}
	public void test2() {
		int num1 = 20;
		//후위 연산자
		//계산을 먼저 처리하고 난 뒤 증감처리 된다.
		int res = num1++ * 3;
		//20*3 을 먼저 계산 후 res에 대입 한 후 num1 을 증감시킨다
		System.out.println("res: " + res);
		System.out.println("num1: " + num1);
		
		int num2 = 20;
		//전위 연산자
		//증가를 먼저 하고 난 뒤 계산을 한다
		int res2 = ++num2 * 3;
		System.out.println("res2: " + res2);
		System.out.println("num2: " + num2);
		
		
	}
}
