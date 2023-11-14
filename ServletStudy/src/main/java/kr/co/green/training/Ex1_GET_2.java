package kr.co.green.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/training.do")
public class Ex1_GET_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex1_GET_2() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String products = request.getParameter("product");
		String[] products = request.getParameterValues("product");
		
		String gift = request.getParameter("gift");
		String userName = request.getParameter("user_name");
		String addr = request.getParameter("addr");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
//		OOO님이 주문하신 상품은 : OOO Okg, OOO Okg 이며
//		선물 포장 선택은 (합니다/안합니다)
		
		String result = "";
		
		for(String product : products) {
			result += product + ", ";
		}
		
		if(gift.equals("yes")) {
			System.out.println(userName + "님이 주문하신 상품은 : " + 
					result + "이며, 선물 포장을 합니다");
		} else {
			System.out.println(userName + "님이 주문하신 상품은 : " + 
					result + "이며, 선물 포장을 안합니다");
		}
		
		System.out.println(addr);
		System.out.println(email);
		System.out.println(phone);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
