<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.co.green.submit.MemberDTO" %>



<% 
	String userName = (String)request.getAttribute("userName");

	MemberDTO member = (MemberDTO)request.getAttribute("member");
//	public String testMethod() {
//		return "메소드 호출됨";
//	}

	String str = testMethod();
	
	int sum = 0;
	for(int i=0; i<10; i++) {
		sum+=1;
	}
%>

<!-- 선언문 -->
<%!
	public String testMethod() {
		return "메소드 호출됨";
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%=sum %> </p>
	<p><%=str %></p>
	
	<% if(userName.equals("김재섭")) { %>
		<span>유저의 이름은 : <%=userName %></span>
	<% } else if(true) { %>
	 	<span>김재섭 유저가 아닙니다.</span>
	<% } else { %>
		<span>김재섭 유저가 아닙니다.</span>
	<% } %>
	
	<input type="text" value="<%= member.getUserName() %>">
	<input type="text" value="<%= member.getPassword() %>">
	
	<!-- 
		<EL>
		기존의 불편했던 방식을 개선한 언어
		불편했던 방식 : 서버로부터 전달받은 변수 또는 객체를 사용할 때
					 불필요한 과정들이 너무 많다 
	-->
	<hr>
	<input type="text" value="${ member.userName }" >
	
	<!-- 
		JSTL
		
		==  : eq
		!=  : ne
		<   : lt
		<=  : le
		>   : gt
		>=  : ge
		empty 변수명  :  값이 null인지 확인, null이면 true
		
	-->
	<c:set var="num" value="3" />
	<c:if test="${num ge 5}">
		<p>num 변수의 값 : ${num}</p>
	</c:if>
	
	<c:if test="${num lt 5}">
		<p> num 변수가 5보다 작습니다. </p>
	</c:if>
	
	
	<c:choose>
		<c:when test="${ num == 1 }">
			<p> num은 1입니다. </p>
		</c:when>
		<c:when test="${ num == 2 }">
			<p> num은 2입니다. </p>
		</c:when>
		
		<c:otherwise>
			<p>조건이 모두 해당하지 않습니다.</p>
		</c:otherwise>
	</c:choose>
	
	<% pageContext.setAttribute("list",
								new String[]{"1", "2", "3", "4", "5"}); %>
	
	<!-- 
		for(String item : list) {
		
		}
	 -->
	<c:forEach var="item" items="${list}" begin="2" end="3"> 
		<p> ${item} </p>
	</c:forEach>
	
	
	
</body>
</html>




