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
//			System.out.println("���� ��� �Ϸ�");
//		} catch (Exception e) {
//			System.out.println("���� ��� ���� ����");
//		}
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("����: ");
		int num = sc.nextInt();
		System.out.println("Ű: ");
		double height = sc.nextDouble();
		
		
	}
	
	public void inputTest01() throws Exception { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���� �Է��ϼ���: ");
		
		String value = br.readLine();
		System.out.println("�Է¹��� ��: " + value);
	}
	
	public void inputTest02 () {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("���� �Է��ϼ���: ");
		
		try {
			String value = bf.readLine();
			//System.out.println("�Է¹��� ��: " + value);
			int num = Integer.parseInt(value);
			System.out.println("int�� ������� ��: " + num);
		} catch (IOException e) {}
		
		
		
		
		
	}
}
