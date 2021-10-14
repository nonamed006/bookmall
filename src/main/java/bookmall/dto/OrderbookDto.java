package bookmall.dto;

public class OrderbookDto {
	private int orderNo;
	private String title;
	private int count;
	private int price;
	
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	
	@Override
	public String toString() {
		return "OrderbookDto [orderNo=" + orderNo + ", title=" + title + ", count=" + count + ", price=" + price + "]";
	}
	
	
}
