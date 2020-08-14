package exam10;

class Person {

	private String name;
	private int milID;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	Person(String name, int mID, int birthYear, int birthMonth, int birthDay){
		this.name = name;
		this.milID = mID;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		//기본 할당은 가지고 있어야 함
		
	}
	
	
	Person(String name, int birthYear, int birthMonth, int birthDay){
//		this.name = name;
//		this.milID = 0;
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
		this(name,0,birthYear,birthMonth,birthDay);
		
	}
	
	Person(String name){
//		this.name = name;
//		this.milID = 0;
//		this.birthYear = 0;
//		this.birthMonth = 0;
//		this.birthDay = 0;
		this(name,0,0,0,0);
	}
	
	Person(String name, int mID){
//		this.name = name;
//		this.milID = mID;
//		this.birthYear = 0;
//		this.birthMonth = 0;
//		this.birthDay = 0;
		this(name,mID,0,0,0);
		
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("출생년도 : " + birthYear);
		System.out.println("출생 월 : " + birthMonth);
		System.out.println("출생 일 : " + birthDay);
		
		
		if(milID != 0) {
		System.out.println("군번 : " + milID);
		}
	}
}
