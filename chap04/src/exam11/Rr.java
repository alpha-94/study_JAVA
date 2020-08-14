package exam11;

public class Rr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i <=100; i ++) {
			if((i%5!=0) || (i%7!=0)) {
				
				continue;
				
			}
			System.out.println("5 배수 그리고 7 배수" + i);
			
			
		}
		
		
	}

}
