package prac02;

import java.util.Scanner;

//문제) 키보드로 부터 5명의 -친구이름(String), 핸드폰번호(String), 주소(String), 나이(int) 를 입력 받아 저장하고, 
//입력받은 데이터를 출력하는 주소록 관리 프로그램을 객체 지향적 관점으로 작성해 보세요.

class addressBook{
	private String name;
	private String phone;
	private String address;
	private int age;
	private int check;
	Scanner input = new Scanner(System.in);
	
	addressBook(){
		name = null;
		phone = null;
		address = null;
		age = 0;
		check = 0;
	}
	
	public void InputInfo() {
		check = 1;
		System.out.print("저장할 이름 : ");
		name = input.nextLine();
		System.out.print("저장할 휴대폰 번호 : ");
		phone = input.nextLine();
		System.out.print("저장할 주소 : ");
		address = input.nextLine();
		System.out.print("저장할 사람의 나이 : ");
		age = input.nextInt();
	}
	
	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("휴대폰번호 : " + phone);
		System.out.println("주소 : " + address);
		System.out.println("나이 : "+ age);
		System.out.println("--------------------");
	}
	
	public String getName() {
		return name;
	}
	
//	public int getCheck() {
//}
}

public class Junil {
	public static void main(String[] args) {
		addressBook human1 = new addressBook();
		addressBook human2 = new addressBook();
		addressBook human3 = new addressBook();
		addressBook human4 = new addressBook();
		addressBook human5 = new addressBook();
		
		int num = 0; //번호에 따라 들어가는 화면다름
		int maxCount = 0;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			System.out.println("전화번호부입니다 원하시는 기능을 선택해주세요");
			System.out.println("1. 전화번호등록(최대5명)");
			System.out.println("2. 전체보기");
			System.out.println("3. 친구찾기");
			System.out.println("4. 나가기");
			num = keyboard.nextInt();
			cleanConsole();
			
			if(num == 1) {
				if(human1.getName() == null) {
					human1.InputInfo();
				}else if(human2.getName() == null) {
					human2.InputInfo();
				}else if(human3.getName() == null) {
					human3.InputInfo();
				}else if(human4.getName() == null) {
					human4.InputInfo();
				}else if(human5.getName() == null) {
					human5.InputInfo();
				}else {
					System.out.println("이미 최대 저장인원수를 저장하셨습니다");
					System.out.println("다음으로 갈려면 엔터를 눌러주세요");
					keyboard.nextLine();
					keyboard.nextLine();
				}
				
			}
			
			if(num == 2) { //전체출력
				displayAll(human1, human2, human3, human4, human5);
				System.out.println("다음으로 갈려면 엔터를 눌러주세요");
				keyboard.nextLine();
				keyboard.nextLine(); //더미코드
			}
			
			if(num == 3) { //친구이름으로 찾기
				findBook(human1,human2,human3,human4,human5);
				System.out.println("다음으로 갈려면 엔터를 눌러주세요");
				keyboard.nextLine();	
				keyboard.nextLine();
			}
			
			
			cleanConsole();
		}while(num != 4);

	}
	
	public static void displayAll(addressBook human1, addressBook human2, addressBook human3
			,addressBook human4, addressBook human5) {
		//5명 출력
		if(human1.getName() != null) {
			human1.displayInfo();
		}
		if(human2.getName() != null) {
			human2.displayInfo();
		}
		if(human3.getName() != null) {
			human3.displayInfo();
		}
		if(human4.getName() != null) {
			human4.displayInfo();
		}
		if(human5.getName() != null) {
			human5.displayInfo();
		}
	}
	
	public static void findBook(addressBook human1, addressBook human2, addressBook human3
			,addressBook human4, addressBook human5) {
		String checkName = null;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("친구이름 전체를 정확하게 입력해주세요");
		checkName = keyboard.nextLine();
		
		cleanConsole();
		
		if(human1.getName().compareTo(checkName) == 0){
			human1.displayInfo();
		}else if(human2.getName().compareTo(checkName) == 0){
			human2.displayInfo();
		}else if(human3.getName().compareTo(checkName) == 0){
			human3.displayInfo();
		}else if(human4.getName().compareTo(checkName) == 0){
			human4.displayInfo();
		}else if(human5.getName().compareTo(checkName) == 0){
			human5.displayInfo();
		}else {
			System.out.println("주소록에 저장되어있지 않아요");
		}
	}
	
	public static void cleanConsole() {
		
		for(int a = 0; a<20;a++) {
			System.out.println();
		}
	}
}
