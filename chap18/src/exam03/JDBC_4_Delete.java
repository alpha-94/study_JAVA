package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_4_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
//		Statement stmt = null;
		PreparedStatement pstmt =null;
		int result =0;
		
		
		try {
			Class.forName(driver); //java7 이후 생략 가능
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("custom 테이블 값 삭제하기!");
			System.out.println("DELETE -- No :: ");
			int no =input.nextInt();
			
			String sql = "delete from customer where no = ?" ;
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, no);
			
			result = pstmt.executeUpdate();
			
			if (result ==1) {
				System.out.println("complete DELETE");
			}else {
				System.out.println("NOT complete DELETE");
			}
			
			
			System.out.println("데이터 베이스 연결 성공!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("데이터 베이스 연결 실패!");
		}finally {
			
				try {
					
					if (pstmt!=null) {
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
