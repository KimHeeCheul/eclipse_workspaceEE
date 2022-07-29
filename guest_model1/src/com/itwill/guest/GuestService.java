package com.itwill.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GuestService {
	private GuestDao guestDao;
	public GuestService() {
		guestDao = new GuestDao();
	}
	public List<Guest> selectAll()throws Exception {
		return guestDao.selectAll();
	}
	//select
	public Guest selectByNo(int no)throws Exception {
		return guestDao.selectByNo(no);
	}
	//insert
	public int insertGuest(Guest guest)throws Exception {
		return guestDao.insertGuest(guest);
	}
	//update
	public int updateGuest(Guest guest)throws Exception {
		return guestDao.updateGuest(guest);
	}
	//delete
	public int deleteGuest(int no)throws Exception {
		return guestDao.deleteGuest(no);
	}

}
