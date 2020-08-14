package exam06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1 = 'A';
		char ch2 = 'B';
		
		try {
			Writer out = new FileWriter("hyper.txt");//각 운영체제에 맞는 문자을 인코딩
			out.write(ch1);//문자 저장
			out.write(ch2);//문자 저장
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
