package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_2_select {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn= null;
		Statement stmt =null;
		ResultSet rs = null;
		int no =0;
		String name =null;
		String email =null;
		String tel =null;
		
		
		
		
		try {
			Class.forName(driver); //java7 이후 생략 가능
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			
			stmt = conn.createStatement();//sql 명령어 실행문
			String sql = "select * from customer";
			
			rs = stmt.executeQuery(sql);//레코드데이터 불러오는 명령어
			
			System.out.println("번호\t이름\t\t\t이메일\t\t전화번호\t");
			System.out.println("--------------------------------------");
			
			while (rs.next()) {
				no = rs.getInt("no");
				name = rs.getString("name");
				email = rs.getString("email");
				tel = rs.getString("tel");
				
				System.out.printf("%d \t %s \t %s \t %s \n",no,name,email,tel);
			}
			
			
			
			System.out.println("데이터 베이스 연결 성공!");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("데이터 베이스 연결 실패!");
		}finally {
			
				try {//순서 기억하기
					if (rs != null) {
						rs.close();
					}
					if (stmt != null) {
						stmt.close();
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
		}//main	
}

