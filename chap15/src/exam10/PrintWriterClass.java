package exam10;

import java.io.*;

public class PrintWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			PrintWriter out = new PrintWriter(new FileWriter("printf.txt"));
			
			out.printf("제 이름은 %s 입니다.", "홍길동");
			out.println("");
			out.print("우리는 자바 입출력을 배우고 있어요....하..");
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
