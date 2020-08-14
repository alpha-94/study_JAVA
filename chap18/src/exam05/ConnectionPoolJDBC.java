package exam05;

import java.util.ArrayList;
import java.util.Scanner;



public class ConnectionPoolJDBC {

	public static void main(String[] args) {
		ConnPoolDAO dao = new ConnPoolDAO();
		
		showDept01(dao); //data -show
		System.out.println("==========================");
		
		insertDept01(dao); //data -insert
		System.out.println("==========================");
		
		updateDept01(dao); //data -update
		System.out.println("==========================");
		
		deleteDept01(dao); //data -delete
		

	}
	
	public static void showDept01(ConnPoolDAO dao) {
		// TODO Auto-generated method stub
				
		//정보출력 메서드 호출
		ArrayList<ConnPoolDTO> list = dao.select();
		System.out.println("부서번호 \t 부서명 \t 위치");
		System.out.println("--------------------------");
				
				for (ConnPoolDTO e : list) {
//					int deptno = e.getDeptno();
//					String dname = e.getDname();
//					String loc= e.getLoc();
					
					System.out.printf("%d \t %s \t %s \n",e.getDeptno(), e.getDname(), e.getLoc());
				

				}
	}
	
	public static void insertDept01(ConnPoolDAO dao) {
		Scanner input = new Scanner(System.in);
		
		ConnPoolDTO dto = new ConnPoolDTO();
		
		System.out.println("부서 정보 추가 기능");
		
		System.out.print("INSERT -- 부서 번호 :: ");
		dto.setDeptno(input.nextInt());
		input.nextLine();//dummy
		
		System.out.print("INSERT -- 부서 이름 :: ");
		dto.setDname(input.nextLine());
		
		System.out.print("INSERT -- 부서 장소 :: ");
		dto.setLoc(input.nextLine());
		
		dao.insert(dto);
		showDept01(dao);
		
	}
	
	public static void updateDept01(ConnPoolDAO dao) {
		Scanner input = new Scanner(System.in);
		
		ConnPoolDTO dto = new ConnPoolDTO();
		
		System.out.println("부서 정보 수정 기능");
		System.out.println("부서번호를 입력하여 이름과 장소를 수정하십시오");
		System.out.print("EDIT -- 부서 번호 :: ");
		dto.setDeptno(input.nextInt());
		input.nextLine();//dummy
		
		System.out.print("EDIT -- 부서 이름 :: ");
		dto.setDname(input.nextLine());
		
		System.out.print("EDIT -- 부서 장소 :: ");
		dto.setLoc(input.nextLine());
		
		dao.update(dto);
		showDept01(dao);
		
	}
	
	public static void deleteDept01(ConnPoolDAO dao) {
		Scanner input = new Scanner(System.in);
		System.out.println("부서 정보 삭제");
		
		System.out.print("삭제 부서 번호 입력 :: ");
		int deptno = input.nextInt();
		
		dao.delete(deptno);
		
	}
	
}