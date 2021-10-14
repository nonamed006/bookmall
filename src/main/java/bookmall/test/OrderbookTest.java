package bookmall.test;

import bookmall.dao.OrderBookDao;
import bookmall.vo.OrderbookVo;

public class OrderbookTest {

	public static void main(String[] args) {
		OrderbookVo vo = new OrderbookVo(1, 1, 2, 1200);
		
		OrderBookDao.insert(vo);
		
		OrderBookDao.findAll();
	}

}
