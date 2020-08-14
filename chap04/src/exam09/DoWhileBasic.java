package exam09;

public class DoWhileBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 1 , result = 0;
		
		do {
			System.out.println("count : " + num);
			result += num;
			num++;
			System.out.println("ADD :" + result);
		}while(num<=30);
		System.out.println("1~30 ADD ::" + result);
	}
	
	
}
