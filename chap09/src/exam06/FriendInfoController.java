package exam06;

import java.util.Scanner;



//화면 대 데이터 처리
class FriendInfoController {
	HighFriend[] highFriend;
	UnivFriend[] univFriend;
	MidFriend[] midFriend;
//	= new HighFriend[100];
	int indexhigh,indexuniv,indexmid;
	
	FriendInfoController(){
		highFriend = new HighFriend[100];
		indexhigh=0;
		univFriend = new UnivFriend[100];
		indexuniv=0;
		midFriend = new MidFriend[100];
		indexmid = 0;
	}
	
	//주소록 저장용 메서드
	public void addFriend(int choice) {
		//변수는 미리 만들어 지정하는게 직관적임
		if(indexhigh >=100 || indexuniv>=100) {
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
		if(choice ==1) {
		System.out.print("입력 - 직업 :   ");
		 job= input.nextLine();
		 
//		 System.out.printf("%s , %s , %s , %s \n", 
//				 name,phone,address,job);//디버깅용
		 highFriend[indexhigh]
					= new HighFriend(name,phone,address,job);
		 indexhigh++;
		}
		else if(choice ==2) {
			System.out.print("입력 - 전공 :   ");
			 major= input.nextLine();
//			 System.out.printf("%s , %s , %s , %s \n", 
//					 name,phone,address,major);//디버깅용
			 univFriend[indexuniv]
					 =new UnivFriend(name,phone,address,major);
			 indexuniv++;
		}
		else if(choice==3) {
			System.out.print("입력 - 반이름 :   ");
			cls= input.nextLine();
//			 System.out.printf("%s , %s , %s , %s \n", 
//					 name,phone,address,major);//디버깅용
			midFriend[indexmid]
					 =new MidFriend(name,phone,address,cls);
			indexmid++;
		}
		
	}//addFriend 매서드 끝
	//고등학교 데이터 출력 메서드
	public void displayHighInfo(){
		for(int i = 0; i <indexhigh;i++) {
			highFriend[i].displayHighFriendInfo();
			displayClean();
		}
	}//displayHighInfo 끝
	
	public void displayUnivInfo(){
		for(int i = 0; i <indexuniv;i++) {
			univFriend[i].displayUnivFriendInfo();
			displayClean();
		}
	}//displayUnivInfo 끝
	
	public void displayMidInfo(){
		for(int i = 0; i <indexmid;i++) {
			midFriend[i].displayMidFriendInfo();
			displayClean();
		}
	}//displayUnivInfo 끝
	
	public void displayFriendInfo() {
		displayUnivInfo();
		displayHighInfo();
		displayMidInfo();
	}
	
	public void displayClean() {
		System.out.println("~~~~공백~~~~~");
		System.out.println("~~~~공백~~~~~");
	}
	
}
