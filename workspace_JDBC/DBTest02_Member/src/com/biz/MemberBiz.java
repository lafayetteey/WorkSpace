package com.biz;

import java.util.List;

import com.dto.Member;

public interface MemberBiz {
//트랜잭션 관리
	public List<Member> selectAll();
	public Member selectOne(int no);
	public int insert(Member m);
	public int delete (int no);
	public int update(Member m);
	
}
