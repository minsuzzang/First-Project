<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${dto.age >= 18}">
		<p>${dto.name }님은 성인입니다.<p>
	</c:if>
	
	<c:if test="${dto.age < 18}">
		<p>미성년자입니다.<p>
	</c:if>
	
	<c:choose> 
		<c:when test="${dto.age >= 18}">
			<p>${dto.name }님은 성인입니다.<p>
		</c:when>
		<c:when test="${dto.age < 18}">
			<p>미성년자입니다.</p>
		</c:when>
	</c:choose>
</body>
</html>






