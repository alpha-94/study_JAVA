package exam03;
public class NoticeByteType {

	public static void main(String[] args) {

		
		byte data1 = 20, data2 = 30;
		int sum;
		
		sum  = data1 + data2; // ERROR
		// byte, short, int 경우 int 형으로 계산하게 되어있음 !!!!!!!!!!!!!!!!!!
		//결국 자료형 연산할때는 int 로 반환 후 계산하게 되어있음 자바 맘임 
		//영상 이미지 등 바이트로 계산하는 것은 byte 로 
		
		
		System.out.println(data1 + " + " + data2 + " = " + sum);

	}

}
