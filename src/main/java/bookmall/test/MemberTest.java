package bookmall.test;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberTest {

	public static void main(String[] args) {
		MemberDao.findAll();
		
		MemberVo vo = new MemberVo("장은주", "eunju@gmail.com", "1111", "010-3399-3535");
		
		MemberDao.insert(vo); 
		
		MemberDao.findAll();
		
	}

}
