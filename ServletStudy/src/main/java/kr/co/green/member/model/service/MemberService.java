package kr.co.green.member.model.service;

import java.util.List;

import kr.co.green.member.model.dto.MemberDTO;

public interface MemberService {
	// 유저 추가
	abstract public int nameEnroll(MemberDTO member);

	// 이름 수정
	abstract public int nameUpdate(String name, int employeeId);
	
	// 유저 조회
	public void memberList(List<MemberDTO> memberList);
}








