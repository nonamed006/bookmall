package bookmall.test;

import bookmall.dao.CategoryDao;
import bookmall.vo.CategoryVo;

public class CategoryTest {
	public static void main(String[] args) {
		
		CategoryVo vo = new CategoryVo("�Ҽ�");
		
		CategoryDao.insert(vo);
		
		CategoryDao.findAll();
	}
}
