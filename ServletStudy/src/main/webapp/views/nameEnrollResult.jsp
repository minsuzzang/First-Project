<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>정보 입력</title>
 	<link rel="stylesheet" href="/resources/nameUpdate.css">
</head>
<body>
	<!-- http://localhost/views/nameUpdate.jsp -->
    <div class="container">
        <h2>정보 입력</h2>
        <p>이름 : ${member.name}</p>
        <p>비밀번호 : ${member.pwd}</p>
        <p>아이디 : ${member.id}</p>
    </div>
</body>
</html>




