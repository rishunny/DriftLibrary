<%@ page contentType="text/html; charset=gb2312"%>

<%@ page language="java"%>

<%@ page import="com.mysql.jdbc.Driver"%>

<%@ page import="java.sql.*"%>

<%

//����������

String driverName="com.mysql.jdbc.Driver";

//���ݿ��û���

String userName="root";

//����

String userPasswd="zsq001";

//���ݿ���

String dbName="driftlibrary";

//����

String tableName="user";

//�����ַ���

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