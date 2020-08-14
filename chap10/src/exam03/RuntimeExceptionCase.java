package exam03;

public class RuntimeExceptionCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Object obj = new int[3];
			String str = (String) obj;
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
//			System.out.println("배열의 범위를 벗어났습니다.");
		}
		
		
		try {
			int[] arr = new int[-10];
			
		}catch(NegativeArraySizeException e) {
			
		}

		
		
		try {
			String name = null;
			int length = name.length();
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
