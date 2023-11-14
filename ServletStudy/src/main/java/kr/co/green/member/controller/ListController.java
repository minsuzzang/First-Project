package kr.co.green.member.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.member.model.dto.MemberDTO;
import kr.co.green.member.model.service.MemberServiceImpl;

@WebServlet("/memberList.do")
public class ListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MemberDTO> memberList = new ArrayList<>();
		
		MemberServiceImpl memberService = new MemberServiceImpl();
		memberService.memberList(memberList);
		
		for(MemberDTO item : memberList) {
			System.out.println(item.getId());
		}
		
		request.setAttribute("memberList", memberList);
		RequestDispatcher view = request.getRequestDispatcher("/views/memberList.jsp");
		view.forward(request, response);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
