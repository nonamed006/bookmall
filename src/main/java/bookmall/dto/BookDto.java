package bookmall.dto;

public class BookDto {
	private Long no;
	private String title;
	private int price;
	private String categoryName;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
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
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "BookDto [no=" + no + ", title=" + title + ", price=" + price + ", categoryName=" + categoryName + "]";
	}
	
	
	
}
