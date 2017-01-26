<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		int major = Integer.parseInt(request.getParameter("major"));
		int city = Integer.parseInt(request.getParameter("city"));

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String jdbcDriver = "jdbc:oracle:thin:@127.0.0.1:1521:MYORACLE";
		String dbUser = "ora_user";
		String dbPass = "test";
		String query = "select * from students_table";
		conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
		pstmt = conn.prepareStatement(
				"insert into students_table(no,name,gender,major,city)" + "values (seq_3.nextval,?,?,?,?)");
		pstmt.setString(1, name);
		pstmt.setString(2, gender);
		pstmt.setInt(3, major);
		pstmt.setInt(4, city);
		pstmt.executeUpdate();
%>
{"result":"OK"}
<%
	} catch (Exception ex) {
		ex.printStackTrace();
%>
{"result":"FAIL"}
<%
	} finally {

		if (pstmt != null)
			try {
				pstmt.close();
				} catch (SQLException ex) {ex.printStackTrace();}
		if (conn != null)
			try {
				conn.close();
			} catch (SQLException ex) {ex.printStackTrace();}
	}
%>