package bookmall.vo;

public class CartVo {
	private Long bookNo;
	private Long memberNo;
	private int count;
	
	
	public CartVo() {
		super();
	}
	public CartVo(Long bookNo, Long memberNo, int count) {
		super();
		this.bookNo = bookNo;
		this.memberNo = memberNo;
		this.count = count;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
