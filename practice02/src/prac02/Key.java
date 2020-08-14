package prac02;

class Infor{
	
	java.util.Scanner keyboard = new java.util.Scanner(System.in);
	String name;
	String hpnum;
	String addr;
	int age;
//	int chk;
	
	public  Infor(){
		name = null;
		hpnum = null;
		addr = null;
		age = 0;
//		chk = 0;
		
	}
	public void enterInfor() {
		System.out.print("Enter your Name?");
		
		name = keyboard.nextLine();
//		Inforname = name;
		System.out.println("Enter your Phone Number?");
		
		hpnum = keyboard.nextLine();
//		Inforhpnum = hpnum;
		System.out.print("Enter your Address?");
		
		addr = keyboard.nextLine();
//		Inforaddr = addr;
		System.out.print("Enter your Age?");
		age= keyboard.nextInt();
//		Inforage = age;
	}
	

	
	public void ShowInfor() {
		System.out.println("Show information");
		
		
		System.out.println(" your Name is " + this.name);
		System.out.println(" your Phone Number is " + this.hpnum);
		System.out.println(" your  Address is " + this.addr);
		System.out.println(" your Age is " + this.age);
		
	}

	public String getName() {
		return name;
		
}


}


public class Key {
	public static void alldisplay(Infor enter1, Infor enter2, Infor enter3, Infor enter4, Infor enter5) {
		//정보출력 메서드
		if(enter1.getName() !=null) {
			enter1.ShowInfor();
		}
		 if(enter2.getName() !=null) {
			enter2.ShowInfor();
		}
		 if(enter3.getName() !=null) {
			enter3.ShowInfor();
		}
		 if(enter4.getName() !=null) {
			enter4.ShowInfor();
		}
		 if(enter5.getName() !=null) {
			enter5.ShowInfor();
		
		}
		 
		 
		
	}
	
	public static void findInfor(Infor enter1, Infor enter2, Infor enter3, Infor enter4, Infor enter5) {
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		String chkname = null;
		System.out.println("Input your name");
		chkname = keyboard.nextLine();
		
		if(enter1.getName().compareTo(chkname)==0) {
			enter1.ShowInfor();
		}
		else if(enter2.getName().compareTo(chkname)==0) {
			enter2.ShowInfor();
		}
		else if(enter3.getName().compareTo(chkname)==0) {
			enter3.ShowInfor();
		}
		else if(enter4.getName().compareTo(chkname)==0) {
			enter4.ShowInfor();
		}
		else if(enter5.getName().compareTo(chkname)==0) {
			enter5.ShowInfor();
		}
		else {
			System.out.println("Not Found your name");
		}
		//https://lopicit.tistory.com/193
//		char arr[][] = new char[5][4];
//		
//		for(int i = 0;i < 5; i++) {
//			if(enter1 == null) {
//				enter1.enterInfor();
//			for(int j =0;j < 4; j++) {
//				
//			}
//			}
//		}
//		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로부터 5명의
		//친구이름 , 핸드폰번호, 주소, 나이,
		//를 입력받아 저장하고, 입력받은 데이터를 출력하는 주소록 관리 프로그램을 객체 지행적 관점으로 
		//작성
		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		
		Infor enter1 = new Infor();
		Infor enter2 = new Infor();
		Infor enter3 = new Infor();
		Infor enter4 = new Infor();
		Infor enter5 = new Infor();
		

				
		
		int chkIf = 0;
		
		do { 
			System.out.println("What do you want");
			System.out.println("1. Enter input the Information");
			System.out.println("2. Find Information ");
			System.out.println("3. View Information");
			System.out.println("4. Exit");
			chkIf = keyboard.nextInt();
		
		if(chkIf ==1) {
			//정보입력
			System.out.println("1. Enter input the Information");
			if(enter1.getName() ==null) {
				enter1.enterInfor();
			}
			else if(enter2.getName() ==null) {
				enter2.enterInfor();
			}
			else if(enter3.getName() ==null) {
				enter3.enterInfor();
			}
			else if(enter4.getName() ==null) {
				enter4.enterInfor();
			}
			else if(enter5.getName() ==null) {
				enter5.enterInfor();
			}
		}
			else {
				System.out.println("Full stack Information");
				System.out.println("Enter stage");
			}
		
		if(chkIf ==2) {
			//찾기
			System.out.println("2. Find Information ");
			findInfor(enter1, enter2, enter3, enter4, enter5);
			System.out.println("Enter Please");
			keyboard.nextLine();
			keyboard.nextLine();
			
		}
		if(chkIf ==3) {
		//출력
			System.out.println("3. View Information");
			alldisplay(enter1, enter2, enter3, enter4, enter5);
			System.out.println("Enter Please");
			keyboard.nextLine();
			keyboard.nextLine();
		}

		}while(chkIf !=4);
		System.out.println("SYSTEM OUT");
		
		
		
		
		
	}
	
	
}