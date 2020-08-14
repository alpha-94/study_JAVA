package exam06.add;

public class Adder {


	private int cntAdd;
	//private int cntAdd = 0;
	
	public Adder(){			//필드 초기화
		cntAdd = 0;
	}
	
	public int addTwoNumber(int num1, int num2) {
		cntAdd++;
		return num1 + num2;
		
		
	}
	
	
	int getCntAdd() {
		return cntAdd;
	}

	

}
