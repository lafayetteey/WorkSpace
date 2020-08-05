package khacademy_0326;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Practice01 pr = new Practice01();
		
//		try {
//			pr.inputTest01();
//			System.out.println("정상 출력 완료");
//		} catch (Exception e) {
//			System.out.println("정상 출력 되지 않음");
//		}
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int num = sc.nextInt();
		System.out.println("키: ");
		double height = sc.nextDouble();
		
		
	}
	
	public void inputTest01() throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("값을 입력하세요: ");
		
		String value = br.readLine();
		System.out.println("입력받은 값: " + value);
	}
	
	public void inputTest02 () {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("값을 입력하세요: ");
		
		try {
			String value = bf.readLine();
			//System.out.println("입력받은 값: " + value);
			int num = Integer.parseInt(value);
			System.out.println("int로 변경받은 값: " + num);
		} catch (IOException e) {}
		
		
		
		
		
	}
}
