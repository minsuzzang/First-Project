package kr.co.green.member.model.service;

import java.sql.Connection;
import java.util.List;

import kr.co.green.common.DatabaseConnection;
import kr.co.green.member.model.dao.MemberDAO;
import kr.co.green.member.model.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO;
	private DatabaseConnection dc;
	private Connection con;
	
	public MemberServiceImpl() {
		memberDAO = new MemberDAO();
		dc = new DatabaseConnection();
	}
	
	// 유저 추가
	public int nameEnroll(MemberDTO member) {
		con = dc.connDB();
//		int result = memberDAO.nameEnroll(con, member);
		return memberDAO.nameEnroll(con, member);
	}
	
	//	이름 수정
	@Override
	public int nameUpdate(String name, int employeeId) {
		con = dc.connDB();
		
//		UpdateDAO updateDAO = new UpdateDAO();
		int result = memberDAO.nameUpdate(con, name, employeeId);
		
		return result;
	}
	
	// 유저 조회
	@Override
	public void memberList(List<MemberDTO> memberList) {
		con = dc.connDB();
		memberDAO.memberList(con, memberList);
	}
}





