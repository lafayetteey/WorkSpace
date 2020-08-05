package com.test.chap03_field.test01;

public class KindsOfVariable { // Ŭ���� ������ ����
	// field // Ŭ���� ������ �ۼ��ϴ� ������ �ʵ�� �Ѵ�.
	// �ʵ� == ������� or ��������
	// ������� ( Ŭ������ ������ ������ �ǹ�)
	// �������� ( Ŭ���� �������� ����� �� �ִ� ������� �ǹ�)
	private int globalNum;

	public void test(int num) {
		// �޼ҵ� �������� �ۼ��ϴ� ������ " �������� " ��� �Ѵ�. (�޼ҵ�ۿ����� ���Ұ���)
		// �޼ҵ� ���� �� ��ȣ �ȿ� �����ϴ� ������ "�Ű�������" ��� �Ѵ�.(�޼ҵ�ۿ����� ���Ұ���)
		int localNum = 0;

		// �Ű������� ȣ�� �� ���� �Ѿ�ͼ� ����Ǳ� ������ �ʱ�ȭ�� �ʿ����.
		System.out.println(num);

		// ���������� ���� �ܿ� �ٽ� ����ϱ� ���ؼ��� �ݵ�� �ʱ�ȭ�� �Ǿ� �־����
		System.out.println(localNum);

		
		//Ŭ���� �������� ��밡���� ����
		System.out.println(globalNum);

	} // �޼ҵ� ������ ��
	
	public void testmethod2() {
		// �ٸ� �޼ҵ忡�� ���������� ���� localNum �� �ٸ� �޼ҵ忡���� ���Ұ�
		//System.out.println(localNum);
		System.out.println(globalNum);
		
		
		
		
	}

} // Ŭ���� ������ ��
