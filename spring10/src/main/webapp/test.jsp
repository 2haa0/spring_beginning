<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/*
	 * 1. driver설정
	 * 2. DB연결 
	 * 3. SQL객체
	 * 4. SQL전송
	 */
	 
	//1.
	Class.forName("com.mysql.jdbc.Driver");
	out.print("1. driver설정 성! 공!<br>"); //out객체는 코드에 문장을 삽입해줌
	
	//2
	String url = "jdbc:mysql://database-1.cploq7lzbdsz.us-east-2.rds.amazonaws.com/shop";
	// rds의 엔드포인트가 url주소.
	String user = "root";
	String password = "*mega709";
	Connection con = DriverManager.getConnection(url, user, password);
	out.print("2. DB연결 성성! 공공!<br>");
	//3
/*	String sql = "insert into member values('rds', 'rds', 'rds', 'rds')";
	PreparedStatement ps = con.prepareStatement(sql);
	out.print("3. sql객체 설정 성성성! 공공공!<br>"); */
	
	//4
/*	ps.executeUpdate();
	out.print("4. sql전송 성성성성! 공공공공!<br>"); */
%>
</body>
</html>