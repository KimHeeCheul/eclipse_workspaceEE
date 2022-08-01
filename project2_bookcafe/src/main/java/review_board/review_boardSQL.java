package review_board;

public class review_boardSQL {
	public final static String REVIEW_BOARD_INSERT=
			"insert into review_board (r_no,r_date,r_title,r_content,r_count,userId,p_no)";
	public final static String REVIEW_BOARD_UPDATE=
			"update review_board set r_date=?,r_title=?,r_content=?,r_count=?,userId=?,p_no=? where r_no=?";
	public final static String REVIEW_BOARD_REMOVE=
			"delete review_board where r_no=?";
	public final static String REVIEW_BOARD_BY_NO=
			"select r_no,r_date,r_title,r_content,r_count,userId,p_no from review_board where r_no=?";
}
