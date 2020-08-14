package exam01;

public class Basicinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student 
		= new Student("홍길동","2000-05-04","서울시 종로구",
				"abc@email.com", "더조은", "경영학");
		
		
		student.displayStudentInfo();
		
		BusinessMan bman 
		= new BusinessMan("이순신","2002-05-04","서울시 중구", 
				"abcd@email.com", "컴퓨터아카데미", "영업부", "123456");
		
		bman.displayBusinessManInfo();
		
		
		
	}


	
}
