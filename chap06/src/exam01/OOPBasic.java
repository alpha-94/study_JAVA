package exam01;

//참조 자료형
class Employee{
	
	// field / 멤버 변수
	int empno;
	String ename;
	String job;
	int mgr;
	int sal;
	int deptno;
	
	public void displayEmployee() {
		//참조자료형을 정의한 메소드 
		System.out.println("사원번호 : " +empno);
		System.out.println("사원이름 : " +ename);
		System.out.println("직업명 : " +job);
		System.out.println("사수번호 : " +mgr);
		System.out.println("급여 : " +sal);
		System.out.println("부서번호 : " +deptno);
		
		
	}
	
}

public class OOPBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num ;
		//num= 10;
		// 얘는 데이터값
		
		
		Employee king;
		king = new Employee();
		// 얘는 주소값
		//참조 변수
		// 메모리 할당
		
		
		king.empno = 1000;  // 인스턴스 변수 접근방법
		king.ename = "사장님";
		king.job = "관리";
		king.mgr = 0;
		king.sal = 5000;
		king.deptno = 10;
		
		king.displayEmployee();
		
		
		
		Employee scott;
		scott = new Employee(); // 인스턴스화 한다.
		
		scott.empno = 1001;
		scott.ename = "사원";
		
		
		
	}

}
