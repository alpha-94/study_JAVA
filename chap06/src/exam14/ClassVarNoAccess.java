package exam14;

class NoAccessWay{
	static int num = 0;
	int memVari = 0;
	
	NoAccessWay(){
		incrementCnt();
		noAccessWay();
	}
	
	public void incrementCnt() {
		memVari++;
		num++;
		noAccessWay();
	}
	
	public static void noAccessWay() {
		num++;
		//memVari++; 메모리 할당 X 
		//incrementCnt(); 위 상동
		
	}
}

public class ClassVarNoAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		NoAccessWay.num = 5;
		
		NoAccessWay accessWay = null;
		accessWay = new NoAccessWay();
		
		System.out.println(accessWay.num);
		
		
		
	}

}
