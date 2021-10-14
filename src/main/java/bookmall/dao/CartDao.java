package bookmall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bookmall.dto.CartDto;
import bookmall.vo.CartVo;

public class CartDao {
	public static List<CartDto> findAll() {
		List<CartDto> result = new ArrayList<CartDto>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConn.getConn();
			
			String sql = "select b.title, b.price, d.name, c.name, a.count " + 
					"     from cart as a " + 
					"     inner join book as b on a.book_no = b.no" + 
					"     inner join member c on a.member_no = c.no" + 
					"     inner join category d on b.category_no = d.no";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String title = rs.getString(1);
				int price = rs.getInt(2);
				String categoryName = rs.getString(3);
				String memberName = rs.getString(4);
				int count = rs.getInt(5);
				
				CartDto dto = new CartDto();
				dto.setTitle(title);
				dto.setPrice(price);
				dto.setCategoryName(categoryName);
				dto.setMemberName(memberName);
				dto.setCount(count);

				result.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("error:" + e);
		} finally {
			DBConn.close(conn, pstmt, rs);
		}
		
		System.out.println("====== cartlist ======");
		
		for(CartDto dto : result) {
			System.out.println(dto);
		}
		
		
		return result;
	}
	
	public static void insert(CartVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBConn.getConn();
			String sql = "insert into cart values(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setLong(1, vo.getBookNo());
			pstmt.setLong(2, vo.getMemberNo());
			pstmt.setInt(3, vo.getCount());
			
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
