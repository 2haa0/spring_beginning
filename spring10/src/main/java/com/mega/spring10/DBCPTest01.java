package com.mega.spring10;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DBCPTest01 {

	public static void main(String[] args) {
		DBConnectionMgr dbcp = DBConnectionMgr.getInstance();
		try {
			//1단계(드라이버 설정), 2단계(DB연결)까지 dbcp가 해준다.
			Connection con = dbcp.getConnection();
			//dbcp에서 연결해 놓은 것 중 하나의 견결을 꺼내와서 2,4단계를 구현한다.
			String spl = "insert into member values ('gorilla','go','ril','la')";
			PreparedStatement ps = con.prepareStatement(spl);
			ps.executeUpdate();
			//10개 중에서 하나 꺼내썼던 con(주소)를 다시 되돌려준다.
			dbcp.freeConnection(con, ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
