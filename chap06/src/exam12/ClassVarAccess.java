package exam12;

class AccessWay{
	
	static int num; // 가시적) 0 초기화 명시 선언과 동시에 초기화
	
	AccessWay(){
		//this.num = num;//클래스 내부는 필드 사용 가능 ㅇ 
		incrementCnt();
	}
	public void incrementCnt() {
		num++;
		
	}
	
}

public class ClassVarAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AccessWay.num);//자체 메모리 할당
		
		AccessWay.num = 10; //자체 메모리 할당 이후 10으로 초기화
		// 클래스 변수,  static 동작 기본 원리
		System.out.println(AccessWay.num);
		
		AccessWay accessWay1 = new AccessWay(); // 생성자 호출 후 this 값 리턴
		
		System.out.println(accessWay1.num);
		
		accessWay1.num++;
		
		System.out.println(accessWay1.num);
		
		AccessWay accessWay2 = new AccessWay();

		System.out.println(AccessWay.num);
		System.out.println(accessWay1.num);
		System.out.println(accessWay2.num);
	}

}
