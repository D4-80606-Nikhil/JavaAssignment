package com.sunbeam.queOne;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/JavaEmployee";
	public static final String DB_USER = "D4_80606_Nikhil";
	public static final String DB_PASSWD = "sunbeam";
	
	
	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(Exception ex) {
			ex.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection getConnections() throws Exception{
		return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
	}
	
}
