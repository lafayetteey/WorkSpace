
package com.test.chap01_string.run;

public class Run {
	//String 
	//immutable(�Һ�) , ������ ���� , �бⰡ ���� ��쿡 ����
	public static void main(String[] args) {
		//Run.method1();
		Run.method2();
	}

	public static void method1() {
		//1.���ڿ��� ���ͷ��� ����
		String str = "abc";
		String str1 = "abc";
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		System.out.println();
		
		//2. �����ڸ� ���� ���ڿ� ����
		String str2 = new String ("abc");
		String str3 = new String ("abc");
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
	}
	
	public static void method2() {
		//charAt(index)
		String str = "abc";
		System.out.println(str.charAt(1));
		//concat(��ġ��)
		System.out.println(str.concat("def"));
		//contains(���ڿ� ���� ���� Ȯ�� �� true false ����) ex : "ac" false ���ϵ�
		System.out.println(str.contains("ac"));
		//equals(���ڿ� ��)
		System.out.println(str.equals("abc"));
		//lenght (���ڿ� ���� Ȯ�� �� ������ ����)
		System.out.println(str.length());
		
		
		//split()
		String str1 = "ab, c, def";
		//�迭������ ���Ϲ���
		String[] strArr = str1.split(",");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		//���� for��
		//����Ÿ�԰� ���ο�� : ���� ����
		for(String arr : strArr ) {
			System.out.println(arr);
		}
		
		//toUpperCase() , toLowerCase �빮�ڷ� ����
		System.out.println(str.toUpperCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//subString() ���ڿ� �߶󳻱� �Ʒ� ������ 2~4������ �ε��� �߶󳻱�
		System.out.println(str1.substring(2, 5));
		
		//trim() ��������(�յ� ���鸸 ���� , ���ڻ����� �߰� ������ ���� �Ұ�
		String str2 = "               ab c   ";
		System.out.println(str2);
		System.out.println(str2.trim());
		//replace() ������ ��ĭ���� �ٲ�
		System.out.println(str2.replaceAll(" ", ""));
		
		
		
	}

}
