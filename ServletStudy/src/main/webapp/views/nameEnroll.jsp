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
        <form action="/nameEnroll.do" method="post">
            <div class="form-group">
                <label for="name">이름:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="id">아이디:</label>
                <input type="text" id="id" name="id" required>
            </div>
            <div class="form-group">
                <label for="pwd">비밀번호:</label>
                <input type="text" id="pwd" name="pwd" required>
            </div>
            
            <input type="submit" value="등록">
        </form>
    </div>
</body>
</html>