package exam10;


//인터페이스 다중상속시 
//class interface A {}
//class interface B {}
//class C implement A,B{
//public void A(){}
//public void B(){}
//}
//인터페이스 클래스가 2개 있을 경우 자식 클래스를 다중상속 시킬 땐 implement 사용!

// 인터페이스 클래스 간 상속시
//class interface SuperA
//class interface SubA extends SuperA
//인터페이스 클래스 간 상속 시에는 extends 로 사용!




//class PersonalStorgeImplement extends PersonalStorge
class PersonalStorgeImplement implements PersonalStorge{
//다중상속은 extends 로 A,B 이런식으로 사용이 불가능하다!
//예를들어 class A extends B,C {} 이런식으로는 불가능하다.

	public void addPersonalInfo(String perNum, String name) {
		// TODO Auto-generated method stub
		
	}

	public String searchName(String perNum) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
