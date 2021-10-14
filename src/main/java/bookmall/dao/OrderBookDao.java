package bookmall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.dto.OrderbookDto;
import bookmall.vo.OrderbookVo;

public class OrderBookDao {
	public static List<OrderbookDto> findAll() {
		List<OrderbookDto> result = new ArrayList<OrderbookDto>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConn.getConn();
			
			String sql = "select a.order_no, b.title, a.count, a.price from order_book as a inner join book as b on a.book_no = b.no";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int orderNo = rs.getInt(1);
				String title = rs.getString(2);
				int count = rs.getInt(3);
				int price = rs.getInt(4);
				
				OrderbookDto dto = new OrderbookDto();
				dto.setOrderNo(orderNo);
				dto.setTitle(title);
				dto.setCount(count);
				dto.setPrice(price);

				result.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		
		System.out.println("====== orderbooklist ======");
		
		for(OrderbookDto dto : result) {
			System.out.println(dto);
		}
		
		
		return result;
	}
	
	public static void insert(OrderbookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConn.getConn();
			String sql = "insert into order_book values(?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, vo.getOrderNo());
			pstmt.setInt(2, vo.getBook_no());
			pstmt.setInt(3, vo.getCount());
			pstmt.setInt(4, vo.getPrice());
			
			int count = pstmt.executeUpdate();
			
			if(count == 1) {
				System.out.println("insert O");
			}
			else {
				System.out.println("insert X");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
