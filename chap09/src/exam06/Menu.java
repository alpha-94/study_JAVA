package exam06;

import java.util.Scanner;

class Menu {//화면 메뉴 특징 잡기위한 클래스
	//화면의 주 기능 : 사용자가 데이터를 입력받도록 유도 하기
	
	
	//필드
	FriendInfoController controller ;
	//생성자
	Menu(){
		controller = new FriendInfoController();
		
	}
	
	//메서드
	public void displayMenu() {
		while(true) {
		System.out.println("&&&&&&&메뉴선택&&&&&&&");
		System.out.println("0번 ~ 번 까지 있습니다. 다른 번호를 누르면 출력이 안돼요 ^^");
		System.out.println("0번 : 프로그램 종료");
		System.out.println("1번 : 고등학교 친구 정보 입력");
		System.out.println("2번 : 대학교 친구 정보 입력");
		System.out.println("3번 : 중학교 친구 정보 입력");
		System.out.println("4번 : 고등학교 친구 정보 출력");
		System.out.println("5번 : 대학교 친구 정보 출력");
		System.out.println("6번 : 중학교 친구 정보 출력");
		System.out.println("7번 : 전체 친구 정보 출력");
		
		System.out.print("원하는 항목 번호를 선택!!!!!!>>");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice){
		
		case 0 :
			System.out.println("프로그램을 종료합니다...ㅎ");
			return;
			//프로그램 종료
			
		case 1:	case 2: case 3:
			controller.addFriend(choice);
			break;	
			//고등학교(1)대학교(2) 정보 입력
		case 4:
			controller.displayHighInfo();
			break;
		case 5:
			controller.displayUnivInfo();
			break;
		case 6:
			controller.displayMidInfo();
			break;
		case 7:
			controller.displayFriendInfo();
			break;
		
		default:
			System.out.println("선택지좀 제대로 읽고 번호를 눌러주세요 ^^ ");
			break;
			//스위치 값이 없을경우 초기화
		}
		
		
		}
	}
	

}
