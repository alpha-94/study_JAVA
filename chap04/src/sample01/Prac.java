package sample01;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("예제1");
		
//		1~100 까지의 2의 배수이면서 5의배수인
//		숫자를 출력하고,
//		그 출력된 숫자들의 합을 구하는 프로그램을
//		for 문으로 사용하여 작성
		
		int result = 0 ;
		
		
		for(int i = 1 ; i <=100 ; i ++) {
			if((i % 2 == 0) && (i % 5 == 0)) {
				System.out.println("2 & 5 answer : " + i);
				result += i;
			}
			
			
		}
		
		System.out.println("Sig 2 & 5 ansewr : " + result);
			
		
		System.out.println("예제2");
		
		//예제 1을 while - do while 문으로 바꿔 작성
		System.out.println("/////////");
		System.out.println("/////////");
		System.out.println("while 문");
		
		int t =1;
		result = 0;// result reset
		
		while(t <=100) {
			t++;
			if((t % 2 == 0) && (t % 5 == 0)) {
				System.out.println("2 & 5 answer : " + t);
				result += t;
				
			}
		}
		System.out.println("Sig 2 & 5 ansewr : " + result);
		
		
		System.out.println("/////////");
		System.out.println("/////////");
		System.out.println("do-while 문");
		
		
		int p = 1;
		result = 0;
				
		do {
			if((p % 2 == 0) && (p % 5 == 0)) {
				System.out.println("2 & 5 answer : " + p);
				result += p;
				
			}
			p++;
		}while(p <=100);
		
		System.out.println("Sig 2 & 5 ansewr : " + result);
		
		
		
	}

}