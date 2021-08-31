package com.mega.mvc07.test;

import org.springframework.stereotype.Repository;

//특정한 방법을 가지고 처리하는 파일: 방법파일(Model, DAO)
@Repository //어노테이션에 따라 클래스의 기능이 달라짐!
public class MemberDAO {
	
	public void insert(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		System.out.println(dto.getName());
		System.out.println(dto.getTel());
		
	}
	public void check(MemberDTO dto) {
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		
	}

}
