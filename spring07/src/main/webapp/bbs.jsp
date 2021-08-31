<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/out.css">
</head>
<body>
<hr>
<form action="bbs.mega">
번호 : <input name="bNo"><br>
제목 : <input name="title"><br>
내용 : <input name="content"><br>
작성자 : <input name="writer"><br>
날짜: <input type="date" name="date"><br>
<button>글작성 one</button>
</form>
<a href="bbs?bNo=100&title=test&content=test&writer=test&date=20210827">글작성 two</a>
</body>
</html>