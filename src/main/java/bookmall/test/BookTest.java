package bookmall.test;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookTest {
	public static void main(String[] args) {
		//BookVo vo = new BookVo("Ʈ���϶���", 12000, 1L);
		
		//BookDao.insert(vo);
		
		BookDao.findAll();
	}
}
