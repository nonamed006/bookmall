package bookmall.main;

import bookmall.dao.BookDao;
import bookmall.dao.CartDao;
import bookmall.dao.CategoryDao;
import bookmall.dao.MemberDao;
import bookmall.dao.OrderBookDao;
import bookmall.dao.OrderDao;
import bookmall.vo.BookVo;
import bookmall.vo.CartVo;
import bookmall.vo.CategoryVo;
import bookmall.vo.MemberVo;
import bookmall.vo.OrderVo;
import bookmall.vo.OrderbookVo;

public class Bookmall {

	public static void main(String[] args) {
		
		// 회원 리스트 추가(insert)
		MemberVo mvo1 = new MemberVo("장은주", "eunju@gmail.com", "1111", "010-3399-3535");
		MemberVo mvo2 = new MemberVo("홍길동", "gildong@gmail.com", "0000", "010-2536-8199");
		
		MemberDao.insert(mvo1);
		MemberDao.insert(mvo2); 
		
		
		// 카테고리 리스트 추가(insert)
		CategoryVo cvo1 = new CategoryVo("소설");
		CategoryVo cvo2 = new CategoryVo("컴퓨터/IT");
		CategoryVo cvo3 = new CategoryVo("세계사");
		
		CategoryDao.insert(cvo1);
		CategoryDao.insert(cvo2);
		CategoryDao.insert(cvo3);
		
		
		// 상품 리스트 추가(insert)
		BookVo bvo1 = new BookVo("트와일라잇", 12000, 1L);
		BookVo bvo2 = new BookVo("러닝 리액트", 23000, 2L);
		BookVo bvo3 = new BookVo("거꾸로 읽는 세계사", 17500, 3L);
		
		BookDao.insert(bvo1);
		BookDao.insert(bvo2);
		BookDao.insert(bvo3);
		
		// 카트 리스트 추가(insert)
		CartVo ctvo1 = new CartVo(1L, 1L, 2);
		CartVo ctvo2 = new CartVo(2L, 2L, 1);
		
		CartDao.insert(ctvo1);
		CartDao.insert(ctvo2);
		
		// 주문 리스트 추가(insert)
		OrderVo orvo1 = new OrderVo("B-0001", 35000, "부산", 1);
		
		OrderDao.insert(orvo1);
		
		// 주문 도서 리스트 추가(insert)
		OrderbookVo obvo1 = new OrderbookVo(1, 1, 1, 12000);
		OrderbookVo obvo2 = new OrderbookVo(1, 2, 1, 23000);
		
		OrderBookDao.insert(obvo1);
		OrderBookDao.insert(obvo2);
		
		// 리스트 출력
		MemberDao.findAll();
		CategoryDao.findAll();
		BookDao.findAll();
		CartDao.findAll();
		OrderDao.findAll();
		OrderBookDao.findAll();
		
	}

}
