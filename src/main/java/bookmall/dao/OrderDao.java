package bookmall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.dto.OrderDto;
import bookmall.vo.OrderVo;

public class OrderDao {
	
	public static List<OrderDto> findAll() {
		List<OrderDto> result = new ArrayList<OrderDto>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConn.getConn();
			
			String sql = "select a.order_number, d.title, a.price, c.name, a.address"
					+ " from bookmall.order as a"
					+ " inner join order_book as b"
					+ " on a.no = b.order_no"
					+ " inner join member c"
					+ " on a.member_no = c.no"
					+ " inner join book d"
					+ " on b.book_no = d.no";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String orderNum = rs.getString(1);
				String title = rs.getString(2);
				int price = rs.getInt(3);
				String name = rs.getString(4);
				String address = rs.getString(5);
				
				OrderDto dto = new OrderDto();
				dto.setOrderNum(orderNum);
				dto.setTitle(title);
				dto.setPrice(price);
				dto.setName(name);
				dto.setAddress(address);

				result.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		
		System.out.println("====== orderlist ======");
		
		for(OrderDto dto : result) {
			System.out.println(dto);
		}
		

		
		return result;
	}
	
	public static void insert(OrderVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConn.getConn();
			String sql = "insert into bookmall.order values(null, ?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getOrderNum());
			pstmt.setInt(2, vo.getPrice());
			pstmt.setString(3, vo.getAddress());
			pstmt.setInt(4, vo.getMemberNo());
			
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
