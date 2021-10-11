package bookmall.vo;

public class BookVo {
	private Long no;
	private String title;
	private int price;
	private Long categoryNo;
	
	
	
	public BookVo() {
		super();
	}
	
	public BookVo(String title, int price, Long categoryNo) {
		super();
		this.title = title;
		this.price = price;
		this.categoryNo = categoryNo;
	}
	
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
	public Long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	
	
}
