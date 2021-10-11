package bookmall.test;

import bookmall.dao.BookDao;
import bookmall.vo.BookVo;

public class BookTest {
	public static void main(String[] args) {
		//BookVo vo = new BookVo("트와일라잇", 12000, 1L);
		
		//BookDao.insert(vo);
		
		BookDao.findAll();
	}
}
