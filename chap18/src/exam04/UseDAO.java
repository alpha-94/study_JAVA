package exam04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

class UseDAO { //Data Access Object
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String userid = "scott";
	private String passwd = "tiger";
	
	UseDAO(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<UseDTO> select() {
		Connection conn = null;
		String sql = "select * from dept";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<UseDTO> list = new ArrayList<UseDTO>();
		
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				UseDTO dto = new UseDTO();
				
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
				list.add(dto); 	// select , insert update delete 기능 외 
									//추가적인 기능을 사용할 수 있는 최적화 된 기능!
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	public void insert() {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}

}
