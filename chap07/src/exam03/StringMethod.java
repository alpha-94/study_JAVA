package exam03;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "Smart ";
		String str2 = "and ";
		String str3 = "simple";
		
		String result = str1.concat(str2); // 얘 자료형 스트링
		System.out.println(result);
		System.out.println(str1 + str2);
		
		//System.out.println(str1.compareTo(str3));
		if(str1.compareTo(str3)==0) {
		//result > 0 == str1 이 큼
		//result < 0 == str3 이 큼
		//result = 0 == 내용이 같음
			System.out.println("내용 같음");
		}else {
			System.out.println("내용 다름");
		}
		
		result = str1.concat(str2).concat(str3);
		
		
	}

}
