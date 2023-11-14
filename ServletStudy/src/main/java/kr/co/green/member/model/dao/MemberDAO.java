package kr.co.green.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kr.co.green.member.model.dto.MemberDTO;

public class MemberDAO {
	private PreparedStatement pstmt;
	
	// 유저 조회
	public void memberList(Connection con, List<MemberDTO> memberList) {                                             
		String query = "SELECT * FROM member";
		
		try {
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO member = new MemberDTO();
				String id = rs.getString("MEMBER_ID");
				String pwd = rs.getString("MEMBER_PWD");
				String name = rs.getString("MEMBER_NAME");
				String indate = rs.getString("MEMBER_IN_DATE");
				
				member.setId(id);
				member.setName(name);
				member.setPwd(pwd);
				
				memberList.add(member);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int nameEnroll(Connection con, MemberDTO member) {                            
		String query = "INSERT INTO member VALUES(?, ?, ?, SYSDATE)";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPwd());
			pstmt.setString(3, member.getName());
			
			int result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int nameUpdate(Connection con, String name, int employeeId) {                                        
		String query = "UPDATE employees"
				+ "		SET first_name = ?"
				+ "	 	WHERE employee_id = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, employeeId);
			
			int result = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}
}
