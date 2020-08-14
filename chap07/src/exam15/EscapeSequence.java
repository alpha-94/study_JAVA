package exam15;

public class EscapeSequence {
	public static void main(String[] args) {
		
		
		System.out.print("프로그램");
		
		System.out.println("시작.");
		
		
		System.out.println("친구가 어제 \"잘 다녀왔어?\" 라고 물어서...");
		//어제 잘 다녀왔어? 이 부분을 큰따옴표 해주고 싶을때
		// escape sequence - 「  \" 」  : 「 " 」 출력
		
		System.out.println("친구가 '어제 잘 다녀왔어?' 라고 물어서...");
		// 작은 따옴표는 escape seq. 쓸 필요 X 
		
		
		System.out.println("친구가 \t'어제 잘 다녀왔어?' 라고 물어서...");
		// escape sequence -「  \t 」 : 띄어써주기
		
		System.out.println("친구가 \n'어제 잘 다녀왔어?' 라고 물어서...");
		// escape sequence -「  \n 」 : 줄바꿈
		
		System.out.println("C:\\workspaces\\JAVA");
		// escape sequence -「  \\ 」 : 「 \ 」 출력
		
	}
}
