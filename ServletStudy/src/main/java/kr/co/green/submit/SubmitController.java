package kr.co.green.submit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit.do")
public class SubmitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SubmitController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		
		String userName = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String food = request.getParameter("food");
		
		String[] animals = request.getParameterValues("animal");
		
		MemberDTO mDto = new MemberDTO();
		mDto.setUserName("유저네임1");
		mDto.setUserName("유저네임2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String userName = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String food = request.getParameter("food");
		String[] animals = request.getParameterValues("animal");
		
		MemberDTO member = new MemberDTO();
		member.setUserName(userName);
		member.setPassword(password);
		member.setEmail(email);
		member.setFood(food);
		member.setAnimal(animals);
		
		
//		Ctrl + Shift + O
//		response.setContentType("text/html; charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<p>사용자 이름 : " + userName + "</p>");
//		if(userName.equals("김재섭")) {
//			out.println("<p> 이메일 : " + email + "</p>");
//		} else {
//			out.println("<p> 사용자 이름이 김재섭이 아닙니다 </p>");
//		}
//		out.println("</body>");
//		out.println("</html>");
		
//		request.setAttribute("userName", userName);
		request.setAttribute("member", member);
		
//		RequestDispatcher view = request.getRequestDispatcher("/ex1/dataResponse.jsp");                      
		RequestDispatcher view = request.getRequestDispatcher("/ex1/register.jsp");                      
		
		view.forward(request, response);
		
		for(String animal : animals) {
			System.out.println("선택한 동물 : " + animal);
		}
	}

}
