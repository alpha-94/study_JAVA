package exam06;

import java.util.Scanner;


class AAA{
	AAA(){}
}


class BBB{
	public void method() {
		AAA aaa = new AAA();
		
		try {
			aaa.wait(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




class AgeInputException extends Exception{
	
	AgeInputException(){
		super("유효하지 않은 나이를 입력하였습니다.");
	}
}

public class ProgrammerDefineException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("나이를 입력하세요!");
		
		int age;
		try {
			age = readAge();
			System.out.println("당신의 나이는" + age + "살 입니다.");
		} catch (AgeInputException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		

	}
	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age<0) {
			AgeInputException except = new AgeInputException();
			throw except;
		}
		return age;
	}

}
