package exam06;

public class IntroGenericArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stArr = {"Hi","I'm so happy.", "Java Generic Programming"};
		
		showArrayData(stArr);

	}
	
	public static <T>void showArrayData(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
