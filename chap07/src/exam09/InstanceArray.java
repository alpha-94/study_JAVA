package exam09;

public class InstanceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = new String[3];
		
		strArr[0] = "홍길동";
		strArr[1] = "이순신";
		strArr[2] = "세종대왕";
		
//		System.out.println(strArr[0]);
		for(int i = 0 ;i< strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for(int i = 0 ;i <args.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}

}
