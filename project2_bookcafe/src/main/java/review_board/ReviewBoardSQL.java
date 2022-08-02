package review_board;

public class ReviewBoardSQL {
	//리뷰 등록
	public final static String REVIEW_BOARD_INSERT=
			"insert into review_board (r_no, r_date, r_title, r_content, r_count, userid, p_no) values (review_board_r_no_SEQ.nextval, sysdate, ?, ?, ?, ?, ?)";
	//리뷰 수정
	public final static String REVIEW_BOARD_UPDATE=
			"update review_board set r_date=?,r_title=?,r_content=?,r_count=?,userId=?,p_no=? where r_no=?";
	//리뷰 삭제
	public final static String REVIEW_BOARD_REMOVE=
			"delete review_board where r_no=?";
	//리뷰 정보
	public final static String REVIEW_BOARD_BY_NO=
			"select r_no,r_date,r_title,r_content,r_count,userId,p_no from review_board where r_no=?";
	//리뷰 전체 정보
	public final static String REVIEW_BOARD_ALL=
			"select * from review_board;";
	
}
