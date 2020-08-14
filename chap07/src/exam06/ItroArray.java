package exam06;
import java.util.Scanner;

public class ItroArray {

	Scanner keyboard = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int youngheeKorea = 90;
		int youngheeEnglish = 90;
		int youngheeMath = 90;
		int youngheeSocial = 90;
		int youngheeScience = 90;
		
		System.out.println(youngheeKorea);
		System.out.println(youngheeEnglish);
		System.out.println(youngheeMath);
		System.out.println(youngheeSocial);
		System.out.println(youngheeScience);
		System.out.println("~~~~~~~~~~~~~");
		int[] younghee = new int[5];// 참조변수 선언
		
		younghee[0] = 90;
		younghee[1] = 95;
		younghee[2] = 85;
		younghee[3] = 95;
		younghee[4] = 90;
		
		for(int i = 0; i <5 ; i++) {
			System.out.println(younghee[i]);
			
		}
		
		
		
	}

}
