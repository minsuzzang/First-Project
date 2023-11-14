<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>이름과 사번 입력</title>
 	<link rel="stylesheet" href="/resources/nameUpdate.css">
</head>
<body>
	<!-- http://localhost/views/nameUpdate.jsp -->
    <div class="container">
        <h2>이름과 사번 입력</h2>
        <p>변경된 사용자 이름 : ${name}</p>
        <p>변경된 사용자 사번 : ${employeeId}</p>
        
    </div>
</body>
</html>