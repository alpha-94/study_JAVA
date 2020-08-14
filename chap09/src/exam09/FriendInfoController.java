package exam09;

import java.util.Scanner;

//화면 대 데이터 처리
class FriendInfoController {

	Friend[] friend;
//	HighFriend[] highFriend;
//	UnivFriend[] univFriend;
//	= new HighFriend[100];
	int index;
//	int indexhigh,indexuniv;
	
	FriendInfoController(){
//		highFriend = new HighFriend[100];
//		indexhigh=0;

//		univFriend = new UnivFriend[100];
//		indexuniv=0;

		friend = new Friend[200];
		
		index = 0;
		

	}
	
	//주소록 저장용 메서드
	public void addFriend(int choice) {
		//변수는 미리 만들어 지정하는게 직관적임
//		if(indexhigh >=100 || indexuniv>=100) {
		if(index >=200) {
			System.out.println("더이상 만들 수 없네요 ㅎ");
			return;
		}//if
		String 	name=null, 
						phone=null, 
						address=null, 
						job=null,
						major = null,
						cls = null;
		//System.out.println("정상 호출 확인용 출력");
		Scanner input=new Scanner(System.in);
		
		System.out.print("입력 - 이름 :   ");
		 name = input.nextLine();
		
		System.out.print("입력 - 전화번호 :   ");
		 phone = input.nextLine();
		
		System.out.print("입력 - 주소 :   ");
		 address = input.nextLine();
		
		 if(choice ==3) {
		System.out.print("입력 - 직업 :   ");
		 job= input.nextLine();
		 
//		 System.out.printf("%s , %s , %s , %s \n", 
//				 name,phone,address,job);//디버깅용
//		 highFriend[indexhigh]
//					= new HighFriend(name,phone,address,job);
//		 indexhigh++;
		 friend[index]
					= new HighFriend(name,phone,address,job);
		 index++;
		 
		 //new Friend(name,phone,address);
		 // abstract 명령어 사용 경우 new 사용 불가!!!!!!!!
		}
		else if(choice ==2) {
			System.out.print("입력 - 전공 :   ");
			 major= input.nextLine();
//			 System.out.printf("%s , %s , %s , %s \n", 
//					 name,phone,address,major);//디버깅용
			 friend[index]
					 =new UnivFriend(name,phone,address,major);
			 index++;
		}
		else if(choice==1) {
			System.out.print("입력 - 반이름 :   ");
			cls= input.nextLine();
//			 System.out.printf("%s , %s , %s , %s \n", 
//					 name,phone,address,major);//디버깅용
			 friend[index]
					 =new MidFriend(name,phone,address,cls);
			 index++;
		}
		
	}//addFriend 매서드 끝
	//고등학교 데이터 출력 메서드
	public void displayHighInfo(){
//		
//		for(int i = 0; i <index;i++) {
//			
//			friend[i].displayHighFriendInfo();
//			displayClean();
//		}
		for(int i = 0; i <index;i++) {
			if(friend[i] instanceof HighFriend) {
			friend[i].displayFriendInfo();
			displayClean();
			}
		}
		
	}//displayHighInfo 끝
	
	public void displayUnivInfo(){
//		for(int i = 0; i <indexuniv;i++) {
//			univFriend[i].displayUnivFriendInfo();
		for(int i = 0; i <index;i++) {
		if(friend[i] instanceof UnivFriend) {
			friend[i].displayFriendInfo();
			displayClean();
			}
		}
	}//displayUnivInfo 끝
	
	public void displayFriendInfo() {
		for(int i =0; i<index;i++) {
			friend[i].displayFriendInfo();
			displayClean();
		}
	}//displayFriendInfo 끝
	
	public void displayMidInfo(){
//		for(int i = 0; i <indexuniv;i++) {
//			univFriend[i].displayUnivFriendInfo();
		for(int i = 0; i <index;i++) {
		if(friend[i] instanceof MidFriend) {
			friend[i].displayFriendInfo();
			displayClean();
			}
		}
	}//displayUnivInfo 끝
	
	public void displayBasicFriendInfo() {
		for(int i = 0; i <index;i++) {
			friend[i].displayBasicFriendInfo();
			displayClean();
			}
	}
	
	
	public void displayClean() {
		System.out.println("~~~~공백~~~~~");
		System.out.println("~~~~공백~~~~~");
	}
	
}

//상속에서만 유용한 기능 2가지
//다형성 : 자료형을 다양하게 바라볼 수 있는 기능 
//메서드 오버라이딩 : 

