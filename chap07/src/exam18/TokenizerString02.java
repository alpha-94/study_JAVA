package exam18;

import java.util.StringTokenizer;

public class TokenizerString02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String phoneNum = "TEL 82-02-1234-5678";
		
		System.out.println("First result ==");
		StringTokenizer st1 = new StringTokenizer(phoneNum);//여백
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println("First result ==");
		StringTokenizer st2 = new StringTokenizer(phoneNum," -");//여백& - 
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		
		System.out.println("First result ==");
		StringTokenizer st3 = new StringTokenizer(phoneNum," -",true);//구분자 출력 구분
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		
	}

}
