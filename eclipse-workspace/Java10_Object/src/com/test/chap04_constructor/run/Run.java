package com.test.chap04_constructor.run;

import java.util.Date;

import com.test.chap04_constructor.model.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		u1.info();
		//new�����ڷ� ��ü ���� �ÿ� ��ȣ�ȿ� �ʱ�ȭ ����
		User u2 = new User("user01" , "pass01" , "��â��");
		u2.info();
		
		User u3 = new User("user02" , "pass02" , "ȫ�浿" , new Date() );
		u3.info();
		
	}

}
