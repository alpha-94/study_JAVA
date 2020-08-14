package exam07;

import java.util.Scanner;

/*
 * - 1. 2. 3번의 저장 기능은 중복 데이터 체크를 하지 않고 있다.
   폰번호의 중복 여부를 데이터 저장전 체크해서 중복 저장되지 않도록 기능을 구현하세요.
- 8번의 폰번호를 입력 받아 데이터 삭제 기능도 추가해 보세요.
   
 *** 메뉴 선택 ***
	0. 프로그램 종료.
	1. 중학교 친구 정보 입력.
	2. 고교 친구 정보 입력.
	3. 대학교 친구 정보 입력.
	
	4. 중학교 친구 정보 출력.
	5. 고교 친구 정보 출력.
	6. 대학교 친구 정보 출력.
	7. 중학교/고등학교/대학교 친구 정보 출력.
	
	8. 데이터 삭제 기능.
	9 업뎃 ㅇ 
	
	>> 기능을 프레임 워크를 이용하여 작성
	
 * */

//이름 중복 검사 예외클래스
class LengthException extends Exception{
	LengthException(){
	super("한글자의 이름은 입력하실 수 없습니다. ");
	}
}



//화면 대 데이터 처리 클래스
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
		 try {
			name = nameException();
		} catch (LengthException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return;
		}
		 
		 
		 
		 
		System.out.print("입력 - 전화번호 :   ");
		 phone = input.nextLine();
		 for(int i = 0; i <index;i++) {
			 if(phone.compareTo(friend[i].getPhoneNum())==0) {
				 System.out.println("중복된 전화번호 입니다.");
				 return;
			 }
		 }
		
		 
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
	
	//중학교 데이터 출력 메서드
	public void displayMidInfo(){
//			for(int i = 0; i <indexuniv;i++) {
//				univFriend[i].displayUnivFriendInfo();
			for(int i = 0; i <index;i++) {
			if(friend[i] instanceof MidFriend) {
				friend[i].displayFriendInfo();
				displayClean();
				}
			}
		}//displayMidInfo 끝
	
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
	
	//대학교 데이터 출력 메서드
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
	
	//친구 전체 데이터 출력 메서드
	public void displayFriendInfo() {
		for(int i =0; i<index;i++) {
			friend[i].displayFriendInfo();
			displayClean();
		}
	}//displayFriendInfo 끝
	
	
	//삭제 메서드
	public void deleteInfo() {
		Scanner input=new Scanner(System.in);
		int saveIndex = 0;
		String checkPhone = null;
		System.out.println("삭제하실 분의 휴대폰번호를 정확하게 입력해주세요");
		checkPhone = input.nextLine();
		
		for(int i = 0; i < index; i++) {
			if(checkPhone.equals(friend[i].getPhoneNum())) {
//			if(friend[i].getPhoneNum().compareTo(checkPhone) == 0) {
				saveIndex = i;
				break;
			}else {
				return; //없다면 그냥 리턴.
			}
		}
		//삭제기능은 삭제할 데이터를 앞의 인덱스에 덮어 씌우는 것이다.
		for(int i = saveIndex; i < index - 1; i++) {
			if(friend[i + 1] instanceof MidFriend) {
				friend[i] = new MidFriend(	friend[i + 1].getName(), 
																	friend[i + 1].getPhoneNum(), 
																	friend[i + 1].getAddress(),
																	friend[i + 1].getFriendInfo());
				
				
			}else if(friend[i + 1] instanceof HighFriend) {
				friend[i] = new HighFriend(friend[i + 1].getName(), 
																	friend[i + 1].getPhoneNum(), 
																	friend[i + 1].getAddress(),
																	friend[i + 1].getFriendInfo());
				
				
			}else if(friend[i + 1] instanceof UnivFriend) {
				friend[i] = new UnivFriend(friend[i + 1].getName(), 
																	friend[i + 1].getPhoneNum(), 
																	friend[i + 1].getAddress(),
																	friend[i + 1].getFriendInfo());
				
				
			}
		}
		--index;
		System.out.println(index);
	}
	
	//공백기능
	public void displayClean() {
		System.out.println("~~~~공백~~~~~");
		System.out.println("~~~~공백~~~~~");
	}
	
	//이름 한자릿값 예외 오버라이딩
	public static String nameException() throws LengthException {
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int namelength = name.length();
		
		if(namelength==1) {
			LengthException except = new LengthException();
			throw except;
		}
		return name;
	}
	
	//검색 기능
		public void serchFriendInfo() {
			Scanner input=new Scanner(System.in);
			String find;
			System.out.println("검색하실 분의 휴대폰번호를 정확하게 입력해주세요");
			find = input.nextLine();
			
			for(int i = 0; i < index; i ++) {
				if(find.equals(friend[i].getPhoneNum())) {
					friend[i].displayFriendInfo();
			
				}
				else {
					System.out.printf("검색결과 일치되는 것이 없습니다. 전화번호 :: %s\n ",find);
				}
			}
		
		}
}

//상속에서만 유용한 기능 2가지
//다형성 : 자료형을 다양하게 바라볼 수 있는 기능 
//메서드 오버라이딩 : 

