package prac01;

import java.util.Scanner;

//import prac01.MotherClass;
//
//import prac01.High;
//
//import prac01.Middle;



//중학교 친구 정보 - 이름 / 폰번호 / 주소 / 반
//고등학교 친구 정보 - 이름 / 폰번호 / 주소 / 직업
//
//위 데이터를 관리 할 주소록 작성 프로그램을  , 상속의 관계로 자료형을 정의하고,
//키보드를 통해 데이터를 입력받아 보관하고, 출력하는 기능을 구현해보세요.


public class quiz01 {
	
	
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//if 고등학교 1
		//for고등학교에서 스캔으로 받기
		
		//if 중학교 2 
		//for 중학교에서 스캔으로 받기

		
		//if 고딩 3 만 불러오기
		
		//if 중딩 4 만 불러오기
		
		
		//각 친구는 10명 저장만 가능하도록 구현 하겠음.
		
		int check = 0;
		MotherClass [] moth = new MotherClass[20];
		Middle [] mid = new Middle [10];
		High [] hig = new High [10];
		
		for(int i = 0; i <mid.length; i++) {
			moth[i]  = new MotherClass();
			mid[i] = new Middle();
		}
		
		for(int i = 0; i <hig.length; i++) {
			moth[i]  = new MotherClass();
			hig[i] = new High();
		}
		
		
		do{
		
		System.out.println("What do you want");
		System.out.println("1. Enter Highshool member");
		System.out.println("2. Enter Middelshool member ");
		System.out.println("3. View Highshool member");
		System.out.println("4. View Middelshool member");
		System.out.println("5. View All member");
		System.out.println("6. Exit");
		check = keyboard.nextInt();
		
		
		if(check ==1) {
			for(int i = 0; i < hig.length; i++) {
				if(hig[i].getname() ==null) {
					hig[i].HighenterInfo();
					break;
				}
			}
		}
		else if(check ==2) {
			for(int i = 0; i < mid.length; i++) {
				if(mid[i].getname() ==null) {
					mid[i].MiddleenterInfo();
					break;
				}
			}
		}
		else if(check ==3) {
			
			MotherDisplay(moth);
			
		}
		else if(check ==4) {
			HighDisplay(hig);
			
		}
		else if(check==5) {
			MiddleDisplay(mid);
		}
		else if(check ==6) {
			break;
		}
		else {
			System.out.println("Exit");
		}
	}
		while(check!=6);
	}
	
	public static void MotherDisplay(MotherClass [] m) {
		for(int i = 0 ; i <m.length ; i ++) {
			if(m[i].getname() !=null) {
				m[i].MoInfo();
			}
		}
		
	}
	
	
	public static void HighDisplay(High[] m) {
		for(int i = 0 ; i <m.length ; i ++) {
			if(m[i].getname() !=null) {
				m[i].HighInfo();
			}
		}
		
	}
	
	public static void MiddleDisplay(Middle[] m) {
		for(int i = 0 ; i <m.length ; i ++) {
			if(m[i].getname() !=null) {
				m[i].MiddleInfo();
			}
		}
		
	}
	
	
}
