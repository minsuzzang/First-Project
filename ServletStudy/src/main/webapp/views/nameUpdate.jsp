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
        <form action="/nameUpdate.do" method="post">
            <div class="form-group">
                <label for="name">변경할 이름:</label>
                <input type="text" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="employee-id">사번:</label>
                <input type="text" id="employee-id" name="employee-id" required>
            </div>
            <input type="submit" value="수정">
        </form>
    </div>
</body>
</html>