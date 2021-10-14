package bookmall.vo;

public class OrderVo {
	private Long no; 
	private String orderNum;
	private int price;
	private String address;
	private int memberNo;
	
	
	
	public OrderVo() {
		super();
	}

	public OrderVo(String orderNum, int price, String address, int memberNo) {
		super();
		this.orderNum = orderNum;
		this.price = price;
		this.address = address;
		this.memberNo = memberNo;
	}
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	
	
	
	
}
