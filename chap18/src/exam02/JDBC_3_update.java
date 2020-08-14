package exam02;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_3_update {

	public static void main(String[] args) {
		
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				Connection conn= null;
				Statement stmt =null;
				
				
				try {//try 문 안에서 작성
					Class.forName(driver); //java7 이후 생략 가능
					conn = DriverManager.getConnection(url, "scott", "tiger");
					
					Scanner input = new Scanner(System.in);
					
					
					System.out.println("custom 테이블 값 수정하기!");
					System.out.println("EDIT -- No :: ");
					int no =input.nextInt();
					input.nextLine();//dummy 이유 : int 값 엔터 칠때 밑에 name(string) 값으로 리턴 받아버려서 엔터 하나 받아야 하기 떄문에 더미코드 작성
					System.out.println("EDIT -- Name :: ");
					String name = input.nextLine();
					
					System.out.println("EDIT -- e-mail :: ");
					String email = input.nextLine();
					
					System.out.println("EDIT -- tel :: ");
					String tel = input.nextLine();
					
					stmt = conn.createStatement();
					
					// insert 쿼리문에 작성
					String sql = "update customer set "
							+ "name = " + "'" + name + "'"
							+ ", email = " + "'" + email + "'"
							+ ", tel = " + "'" + tel + "'"
							+ " where no = " + no;							
					
					int result = stmt.executeUpdate(sql);
					
					if (result ==1) {
						System.out.println("데이터 저장 성공");
					}else {
						System.out.println("데이터 저장 실패");
					}
					
					
					
					//System.out.println("데이터 베이스 연결 성공!");
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
					System.out.println("데이터 베이스 연결 실패!");
				}finally {
					
						try {
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

	}

}
