package exam07;

import java.util.Scanner;


public class ThrowsFromUpperMethod {
	
	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age<0) {
			AgeInputException except = new AgeInputException();
			throw except;
		}
		return age;
	}
	
	public static int callAge() throws AgeInputException {
		int age = readAge();
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		return age;
	}

	public static void main(String[] args) {
		
		System.out.println("입력");
		// TODO Auto-generated method stub
		
		try {
			int age = callAge();
			
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}
}


class AgeInputException extends Exception{
	
	AgeInputException(){
		super("유효하지 않은 나이를 입력하였습니다.");
	}
}
