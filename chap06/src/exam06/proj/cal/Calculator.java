package exam06.proj.cal;

public class Calculator {
	Adder adder;
	Subtractor subtractor;//참조변수는 4 byte

	public Calculator(){//참조변수 이면서 지역변수
		adder = new Adder();
		subtractor = new Subtractor();
	}
	
	public int addNum(int n1, int n2) {
		//Adder adder = new Adder();
		return adder.addTwoNumber(n1,n2);
		
	}
	
	public int subNum(int n1, int n2) {
		//Subtractor subtractor = new Subtractor();
		return subtractor.subTwoNumber(n1,n2);
	}
	
//	public void printcal() {
//		System.out.println();
//		System.out.println(subtractor);
//	}
	public void showOperationTimes() {
		System.out.println("덧셈 횟수 : " + adder.getCntAdd());
		System.out.println("뺄셈 횟수 : " + subtractor.getCntSub());
	}
}


 class Adder {

	private int cntAdd;
	//private int cntAdd = 0;
	
	public Adder(){			//필드 초기화
		cntAdd = 0;
	}
	
	int addTwoNumber(int num1, int num2) {
		cntAdd++;
		return num1 + num2;
		
		
	}
	
	
	int getCntAdd() {
		return cntAdd;
	}
}

class Subtractor {
	private int cntSub;
	
	Subtractor(){
		cntSub = 0;
	}

	int subTwoNumber(int num1, int num2) {
		cntSub++;
		return num1 - num2;
	}
	
	int getCntSub() {
		return cntSub;
	}
}








