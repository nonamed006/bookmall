package bookmall.test;

import bookmall.dao.CartDao;
import bookmall.vo.CartVo;

public class CartTest {
	public static void main(String[] args) {
		CartVo vo = new CartVo(1L, 1L, 2);
		
		CartDao.insert(vo);
		
		CartDao.findAll();
	}
}
