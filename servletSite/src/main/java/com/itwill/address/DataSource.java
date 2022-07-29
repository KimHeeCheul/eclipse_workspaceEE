package com.itwill.address;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Connection을 생성하고, 해지하는 역할을 하는 클래스
 */
public class DataSource {
	/**********************************************/
	private String driverClass="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="scott";
	private String password="sys";
	/**********************************************/
	/*******************************************
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	String user="jdeveloper07";
	String password="jdeveloper07";
	*******************************************/
	
/*
 * Connection 객체를 생성해서 반환하는 메쏘드(getConnection)
 */
	public Connection getConnection() throws Exception{
	
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		
		return con;
		
	}
	public static void main(String[] args) {
		System.out.println("2.deleteGuest");
				System.out.println("3.updateGuest");
				System.out.println("4.selectByNo");
				System.out.println("5.selectAll");
	}
}
