package review_board;

public class ReviewBoardSQL {
	public final static String REVIEWBOARD_INSERT=
			"insert into review_board (r_no,r_date,r_title,r_content,r_count,userId,p_no)";
	public final static String REVIEWBOARD_UPDATE=
			"update review_board set r_date=?,r_title=?,r_content=?,r_count=?,userId=?,p_no=? where r_no=?";
	public final static String REVIEWBOARD_REMOVE=
			"delete review_board where r_no=?";
	public final static String REVIEWBOARD_BY_NO=
			"select r_no,r_date,r_title,r_content,r_count,userId,p_no from review_board where r_no=?";
}
