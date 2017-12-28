package com.eviac.blog.sdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoToot {

	private static String jurl="jdbc:mysql://localhost:3306/user";
	private static String className="com.mysql.jdbc.Driver";
	private static String user="root";
	private static String pw="123456";
	
	public static Connection getConnect(){
		Connection con=null;
		
		try {
			Class.forName(className);
			con=DriverManager.getConnection(jurl,user,pw);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void release(Connection con) {
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
