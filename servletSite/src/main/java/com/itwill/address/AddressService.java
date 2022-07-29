package com.itwill.address;

import java.util.List;

/*
 * - 주소록 (address) 관리 비즈니스로직(업무)를 수행하는 클래스
 * - GUI 객체 (스윙,서블릿,JSP)에서 직접접근(메쏘드 호출)하는 클래스
 * - AddressDao 객체를 이용해서 데이타 베이스에 접근하는 클래스
 */
public class AddressService {
	/*
	 * AddressDao 객체를 멤버필드로 가진다
	 */
	// 데이타 엑세스는 DAO
	// 업무는 서비스에서 처리
	private AddressDao addressDao; //여러개 엑세싱 가능하다
	public AddressService() {
		addressDao = new AddressDao();
		
	}
	
	/*
	 * 주소록 쓰기
	 */
	public int insert(Address newAddress) throws Exception {
		int result = 0;  //중복일 경우 0, 중복이 아닐경우 1
		/*
		 * 1. 아이디중복체크
		 * 2-1. 중복아니면 insert(o)
		 * 2-2. 중복이	면 insert(x)
		 */
		
		Address findAddress =
				 addressDao.selectById(newAddress.getId());
		if (findAddress == null) {
			//아이디 중복안됨
			addressDao.insert(newAddress);
			result = 1;
			System.out.println("아이디를 사용할 수 있습니다");
		}else {
			//아이디 중복됨
			result = 0;
			System.out.println("아이디가 중복됩니다");
		}
		
		
		return result;
	}
	
	/*
	 * 주소록 삭제
	 */
	public int deleteByNo(int no)throws Exception {
		return addressDao.deleteByNo(no);
	}
	/*
	 * 주소록 수정(한개)
	 */
	public int updateByNo(Address updateAddress) throws Exception {
		return addressDao.updateByNo(updateAddress);
	}
	/*
	 * 주소록 검색(번호)
	 */
	public Address selectByNo(int no) throws Exception {
		return addressDao.selectByNo(no);
	}
	
	/*
	 * 모든 주소록 검색
	 */
	public List<Address> selectAll() throws Exception {
		return addressDao.selectAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
