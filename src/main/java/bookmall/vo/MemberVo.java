package bookmall.vo;

public class MemberVo {
	private Long no;
	private String name;
	private String email;
	private String password;
	private String tel;
	
	public MemberVo() {
		super();
	}
	public MemberVo(String name, String email, String password, String tel) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", tel=" + tel
				+ "]";
	}
	
	
	
}
