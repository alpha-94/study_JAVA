package exam05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.dbcp2.BasicDataSource;


class ConnPoolDAO {
	BasicDataSource ds;
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userid = "scott";
	private String passwd = "tiger";
	
	ConnPoolDAO(){
		ds = new BasicDataSource(); //connection pool 기능과 thread-safe 기능을 갖춤.
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(userid);
		ds.setPassword(passwd);
		
		ds.setInitialSize(5); //5개의 connection 을 공유하면서 사용할 수 있음.
		//(미리 할당 해놓은거지 5개만 (제한적으로) 사용한다의 개념은 아님)
		
	}
	
	public ArrayList<ConnPoolDTO> select() {
		Connection conn = null;
		String sql = "select * from dept01";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ConnPoolDTO> list = new ArrayList<ConnPoolDTO>();
		
		try {
//			conn = DriverManager.getConnection(url, userid, passwd);
			conn = ds.getConnection();
			
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				ConnPoolDTO dto = new ConnPoolDTO();
				
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
				list.add(dto); 	// select , insert update delete 기능 외 
									//추가적인 기능을 사용할 수 있는 최적화 된 기능!
			}
			return list;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void insert(ConnPoolDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		String sql = "insert into dept01 values(?,?,?)";
		
		try {
			conn = ds.getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println("데이터 저장 완료!");
			}else {
				System.out.println("데이터 저장 실패!");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (conn!=null) {
				conn.close();
				} 
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}
	
	public void update(ConnPoolDTO dto) {
		Connection conn = null;
		PreparedStatement pstmt =null;
		String sql = "update dept01 set dname =?, loc=? where deptno =?";
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.setInt(3, dto.getDeptno());
			
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println("데이터 수정 완료!");
			}else {
				System.out.println("데이터 수정 실패!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (conn!=null) {
				conn.close();
				} 
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		
		
	}
	
	public void delete(int deptno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from dept01 where deptno =?";
//		ConnPoolDTO dto = new ConnPoolDTO();
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			
			if (result ==1) {
				System.out.println("Complete DELETE");
			}else {
				System.out.println("Not Complete DELETE");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				
				if (conn!=null) {
				conn.close();
				} 
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}
