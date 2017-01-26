<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.SQLException"%>

{"students":[
<%
       Class.forName("oracle.jdbc.driver.OracleDriver");
       Connection conn = null;
       Statement stmt = null;
       ResultSet rs = null;
       try {
		String jdbcDriver = "jdbc:oracle:thin:@127.0.0.1:1521:MYORACLE";
       	String dbUser="ora_user";
       	String dbPass="test";
       	String query="select * from students_table";
       	conn=DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
       	stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        rs = stmt.executeQuery(query);

       	
       	//전체개수구하기
       	int size=0, count=1;
       	try{
       			rs.last();
       			size=rs.getRow();
       			rs.first();
       	} catch(SQLException ex) {}
       	while(rs.next()){
%>
			{"no":<%=rs.getInt("NO") %>, "name":"<%=rs.getString("NAME")%>",
			"gender":"<%=rs.getString("GENDER") %>", "major":<%=rs.getInt("MAJOR") %>,
			"city":<%=rs.getInt("CITY") %>, "created_at":"<%=rs.getDate("CREATE_AT") %>"
<%       		if ( count >= (size-2)){%>
					}
<%       		} else { %>
					},
<%
       			} count++;
       		}
       	 } catch(SQLException ex) { ex.printStackTrace();
		} finally{
    	   if (rs!=null) try{rs.close();} catch(SQLException e){}
    	   if (stmt!=null) try{stmt.close();} catch(SQLException e){}
    	   if (conn!=null) try{conn.close();} catch(SQLException e){}
     }
%>
]}
