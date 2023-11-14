<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Member List</title>
</head>
<body>
    <h1>Member List</h1>

    <c:choose>
        <c:when test="${empty memberList}">
            <p>회원이 없습니다.</p>
        </c:when>
        <c:otherwise>
            <table border="1">
                <tr>
                    <th>회원 ID</th>
                    <th>이름</th>
                    <th>비밀번호</th>
                </tr>
        <c:forEach var="member" items="${memberList}">
            <tr>
                <td>${member.id}</td>
                <td>${member.name}</td>
                <td>${member.pwd}</td>
            </tr>
                </c:forEach>
            </table>
        </c:otherwise>
    </c:choose>
</body>
</html>





