package exam08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
			
			out.write("더조은 컴퓨터 아카데미");
			out.newLine();
			out.write("서울시 종로구");
			out.newLine();
			out.write("데이터 입력 완료");
			out.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
