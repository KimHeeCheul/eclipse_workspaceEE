package com.itwill.datasource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class BasicDataSourceExample {
	public static void main(String[] args) throws Exception {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		basicDataSource.setUrl("jdbc:oracle:thin:@182.237.126.19:1521:XE");
		basicDataSource.setUsername("jdeveloper07");
		basicDataSource.setPassword("jdeveloper07");
		/******************** << javax.sql.DataSource >> **************************/
		DataSource dataSource = (DataSource) basicDataSource;
		Connection con = dataSource.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from userinfo");
		while (rs.next()) {
			System.out.println(rs.getString("userid") + " " + rs.getString("password") + " " +rs.getString("name") + " " + rs.getString("email"));
		}
		con.close();
		/************************************************************************/
		basicDataSource.close();
	}

}