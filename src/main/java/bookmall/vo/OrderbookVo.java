package bookmall.vo;

public class OrderbookVo {
	private int orderNo;
	private int book_no;
	private int count;
	private int price;
	
	
	
	public OrderbookVo() {
		super();
	}

	public OrderbookVo(int orderNo, int book_no, int count, int price) {
		super();
		this.orderNo = orderNo;
		this.book_no = book_no;
		this.count = count;
		this.price = price;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getBook_no() {
		return book_no;
	}
	public void setBook_no(int book_no) {
		this.book_no = book_no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
