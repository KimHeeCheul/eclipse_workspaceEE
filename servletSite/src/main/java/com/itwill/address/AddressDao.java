package com.itwill.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class AddressDao { // Return 전부다 int
							// 인자 = PK data or DTO
	
	/*
	 * Dao 객체는 멤버변수로 Connection을 생성하는 DataSource 객체를 가진다
	 */
	/*
	 * Dao(Data[DataBase] Access Object)객체(클래스)
	 *   - address테이블에 CRUD(Create,Read,Update,Delet)작업을 하는 
	 *     단위메쏘드를 가지고있는 객체(클래스)
	 */
	private DataSource dataSource;
	public AddressDao() {
		/*
		 * DataSource 멤버필드 초기화(객체생성)
		 */
		dataSource = new DataSource();
	}
	
	public int insert(Address address) throws Exception { // insert

		String insertSql = "insert into address values(address_no_seq.nextval,'" + address.getId() + "','"
				+ address.getName() + "','" + address.getPhone() + "','" + address.getAddress() + "')";

		Connection con = dataSource.getConnection(); // Connection 은 있어야한다
		
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(insertSql);
		
		stmt.close();
		con.close();
		
		return rowCount;
	}

	// ↓ 호출하는곳으로부터 업데이트하기위해서 받아야할것이 무엇인지 생각해볼것
	public int updateByNo(Address address) throws Exception { // update
		String updateSql = "update address set name='" + address.getName() + "',phone='" + address.getPhone()
				+ "',address='" + address.getAddress() + "' where no = " + address.getNo();

		Connection con = dataSource.getConnection();
		
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(updateSql);
		
		stmt.close();
		con.close();
		
		return rowCount;
	}

	public int deleteByNo(int no) throws Exception { // delete
		String deleteSql = "delete address where no=" + no;

		Connection con = dataSource.getConnection();
		
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);
		
		stmt.close();
		con.close();
		
		return rowCount;
	}

	public Address selectByNo(int no) throws Exception { // select
		String selectSql = "select no,id,name,phone,address from address where no = " + no;
		
		Address findAddress = null; // 로칼변수이기떄문에 초기화 필요

		Connection con = dataSource.getConnection();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) { // DTO 객체 생성
			findAddress = new Address(rs.getInt("no"), rs.getString("id"), rs.getString("name"), rs.getString("phone"),
					rs.getString("address"));
		}
		rs.close();
		stmt.close();
		con.close();		// 여기는 여기만 닫고 전부 다 안닫았지만 계속 전부 안닫을 경우 Connection이 안될수도 있다
		return findAddress;
	}
	
	public Address selectById(String id) throws Exception { 
		String selectSql = "select no,id,name,phone,address from address where id = '" + id+"'";
		
		Address findAddress = null;
		
		Connection con = dataSource.getConnection();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while (rs.next()) { 
			findAddress = new Address(rs.getInt("no"), rs.getString("id"), rs.getString("name"), rs.getString("phone"),
					rs.getString("address"));
		}
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
	}

	public List<Address> selectAll() throws Exception { // select all
		String selectSql = "select no,id,name,phone,address from address";
		
		List<Address> addressList = new ArrayList<Address>();

		Connection con = dataSource.getConnection();
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);

		while (rs.next()) {
			addressList.add(new Address(rs.getInt("no"), rs.getString("id"), rs.getString("name"),
					rs.getString("phone"), rs.getString("address")));
		}
		
		rs.close();
		stmt.close();
		con.close();

		return addressList;
	}

}
