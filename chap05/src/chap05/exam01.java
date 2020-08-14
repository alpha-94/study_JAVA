package chap05;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gugu2dan(4);
		
		multiple(7,8);
		
	}
	
	
	public static void multiple(int num1, int num2) {
		System.out.println();
		System.out.println("1~100  사이의 " + num1 +" 의 배수 이면서 " +  num2 +" 의 배수 출력");
		for(int i = 1;i <=100; i ++) {
			if((i % num1 == 0)&&(i % num2 == 0)) {
				
				System.out.println(i);	
			
			}
			
			
			
		}
		
		
		
	}
	
	
	
	public static void gugu2dan(int num) {
		System.out.println(num +" 단 ");
		
			for(int i = 1; i <10; i++) {
				System.out.println(num + " X " + i + " = " + (num*i));
		
				}
		
	

	}
	

}
