package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		
		
		try {
			Class.forName(driver); //java7 이후 생략 가능
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			
			System.out.println("데이터 베이스 연결 성공!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("데이터 베이스 연결 실패!");
		}finally {
			
				try {
					if (conn!=null) {
					conn.close();
					} 
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}	
			}
		}//main
		
		

	}


