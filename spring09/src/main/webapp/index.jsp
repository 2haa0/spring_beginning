<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
2021년 8월 31일 spring09 index 페이지
<form action="login.mega">
id: <input name="id"><br>
pw: <input name="pw"><br>
<button>로그인 요청</button>
</form>
<hr>

<form action="password.mega">
password: <input name="pass"><br>
<button>암호 처리 요청</button>
</form>

<hr>
<!-- Quiz01. 컨트롤러에 check method 넣고 닉네임이 superman이면 super.jsp로 닉네임이 다른 것이면 common.jsp로 -->
<form action="check.mega">
nickname: <input name="nick"><br>
<button>닉네임 처리 요청</button>
</form>
</body>
</html>