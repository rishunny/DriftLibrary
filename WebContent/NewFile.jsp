<%@ page contentType="text/html; charset=gb2312"%>

<%@ page language="java"%>

<%@ page import="com.mysql.jdbc.Driver"%>

<%@ page import="java.sql.*"%>

<%

//驱动程序名

String driverName="com.mysql.jdbc.Driver";

//数据库用户名

String userName="root";

//密码

String userPasswd="zsq001";

//数据库名

String dbName="driftlibrary";

//表名

String tableName="user";

//联结字符串

String url="jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd;

Class.forName("com.mysql.jdbc.Driver").newInstance();

Connection connection=DriverManager.getConnection(url);

Statement statement = connection.createStatement();

String sql="SELECT * FROM "+tableName;

ResultSet rs = statement.executeQuery(sql); 
while(rs.next()){
System.out.println(rs.getString("Email"));
}

rs.close(); 

statement.close(); 

connection.close(); 

%>