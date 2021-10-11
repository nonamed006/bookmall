package bookmall.dto;

public class CartDto {
	private String title;
	private int price;
	private String categoryName;
	private String memberName;
	private int count;
	
	
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
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "CartDto [title=" + title + ", price=" + price + ", categoryName=" + categoryName + ", memberName="
				+ memberName + ", count=" + count + "]";
	}
	
	
}
