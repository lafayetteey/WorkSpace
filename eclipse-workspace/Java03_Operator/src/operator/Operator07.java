package operator;

public class Operator07 {

	public static void main(String[] args) {
		//복합대입연산자(산술대입연산자)
		//+= , -= , *= , /= , %= 등
		Operator07 op = new Operator07();
		op.opTest();
		
	}
	public void opTest() {
		int res , num = 10;
		
		System.out.println("num: " + num);
		
		//3증가
		num += 3;
		System.out.println("num: " + num);
		
		num -= 5;
		System.out.println("num: " + num);
		
		num *=3;
		System.out.println("num: " + num);
		
		num *=6;
		System.out.println("num: " + num);
		
		num /=4;
		System.out.println("num: " + num);
		
		num %=1;
		System.out.println("num: " + num);
		
		
	}

}
