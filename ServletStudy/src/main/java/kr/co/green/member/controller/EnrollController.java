package kr.co.green.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.green.member.model.dto.MemberDTO;
import kr.co.green.member.model.service.MemberServiceImpl;

@WebServlet("/nameEnroll.do")
public class EnrollController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MemberServiceImpl memberService;
       
    public EnrollController() {
        super();
        memberService = new MemberServiceImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		MemberDTO member = new MemberDTO();
		member.setId(id);
		member.setName(name);
		member.setPwd(pwd);
		
//		EnrollServiceImpl enrollService = new EnrollServiceImpl();
		int result = memberService.nameEnroll(member);
		
		if(result == 0) {
			response.sendRedirect("/views/common/error.jsp");
		} else {
//			request.setAttribute("name", name);
//			request.setAttribute("id", id);
//			request.setAttribute("pwd", pwd);
			request.setAttribute("member", member);
			
			RequestDispatcher view = request.getRequestDispatcher("/views/nameEnrollResult.jsp");                  
			view.forward(request, response);
		}
		
	}

}






