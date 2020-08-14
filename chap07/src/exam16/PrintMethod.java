package exam16;

public class PrintMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age = 20;
		
		double tall = 175.7;
		
		String name = "홍길동" ; 
		
		System.out.println("제 이름은" + name + "입니다.");
		System.out.printf("제이름은 %s 입니다.",name);
		System.out.printf("나이는 %d살이고, 키는 %.2f입니다.", age, tall);
		System.out.printf("\n %d, 0x%x, 0%o" ,77,77,77);
		
		
		System.out.printf("\n %g, %g", 0.00014,0.000014);
	}

}
