package exam11;

class InstCnt{
	static int instNum;//필드
	//필드에 static 붙였을 경우
	// 인스턴스 생성 시 1 , 2 , 3 출력
	//필드에 static 안붙일 경우
	//인스턴스 생성 시 1 , 1 , 1 출력
	// static 은 미리 메모리를 할당함 int 경우 0 으로 초기화
	// static 은 main 안에 new 할당 시 공유 되는 필드
	
	
	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성 : " + instNum);
	}
	
	
}

public class ClassVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstCnt instCnt1 ; // 참조변수 이면서 지역변수 main 안에서만 적용
		//이때는 초기화 안함
		//System.out.println(instCnt1); // 초기화가 안된 상태에서는 출력 불가
		//(값이 정해지지 않았기 때문에)
		instCnt1 = new InstCnt();// 메모리 할당 , new 일경우 자동 초기화
		InstCnt instCnt2 = new InstCnt();//사용자가 삭제하라고 하지 않는 한 삭제 안함
		InstCnt instCnt3 = new InstCnt();
		
		// ----------------------------------------------------
		//instNum (static 으로 할당) =0 의 값으로 세팅
		// 1 ) instCnt1 생성 시 instNum 에 접근 후 ++ 생성 -> sysout 에는 1 출력
		// 2)  instCnt2 생성 시 instNum 에 접근 후 ++ 생성 ->  sysout 에는 2 출력
		//
		System.out.println(instCnt1.instNum);
		System.out.println(instCnt2.instNum);
		System.out.println(instCnt3.instNum);
		//이미 instNum 에 공유된 것 
		
		

	}

}
