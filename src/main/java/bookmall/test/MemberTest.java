package bookmall.test;

import bookmall.dao.MemberDao;
import bookmall.vo.MemberVo;

public class MemberTest {

	public static void main(String[] args) {
		MemberDao.findAll();
		
		//MemberVo vo = new MemberVo("¿Ã«œ¿±", "qwe", "123", "399-3535");
		
		//MemberDao.insert(vo);
		
		MemberDao.findAll();
		
	}

}
