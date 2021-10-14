package bookmall.dto;

public class OrderDto {
	private String OrderNum;
	private String title;
	private int price;
	private String name;
	private String address;
	
	public String getOrderNum() {
		return OrderNum;
	}
	public void setOrderNum(String orderNum) {
		OrderNum = orderNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "OrderDto [OrderNum=" + OrderNum + ", title=" + title + ", price=" + price + ", name=" + name
				+ ", address=" + address + "]";
	}
	
	
}
