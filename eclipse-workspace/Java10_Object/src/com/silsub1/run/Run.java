package com.silsub1.run;

import com.silsub1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		Member mb = new Member();
		
		mb.setMemberId("khAcademy");
		mb.setMemberPwd("12345");
		mb.setMemberName("±è½ÂÁø");
		mb.setAge(33);
		mb.setGender('M');
		mb.setEmail("ksjaon162@gmail.com");
		mb.setPhone("010-5758-8453");
		
		System.out.println(mb.getMemberId());
		System.out.println(mb.getMemberPwd());
		System.out.println(mb.getMemberName());
		System.out.println(mb.getAge());
		System.out.println(mb.getGender());
		System.out.println(mb.getPhone());
		System.out.println(mb.getEmail());

	}

}
