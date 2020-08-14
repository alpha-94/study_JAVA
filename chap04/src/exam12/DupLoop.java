package exam12;

public class DupLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		for(int j = 2;j<10;j++) {
			
			System.out.println("-----  "+j + "  단  -----");
				for(int i = 1;i <10; i++) {
				System.out.println( j+" X " + i +" = "+ (j*i));
				
				}
		}
		
		for(int i =1; i<=5; i++) {
			for(int j =4; j>=i; j--) {
			System.out.print(" .");
			}
			for(int k = 1; k <=i ;k++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("qweqwe");
		
		
		
		
		
	}

}
