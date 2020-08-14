package exam07;

import java.io.*;

public class FileReaderStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] cbuf = new char[10];
		
		try {
			Reader in = new FileReader("hyper.txt");
			int readCnt = in.read(cbuf,0,cbuf.length);
			
			for (int i = 0; i < readCnt; i++) {
				System.out.println(cbuf[i]);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
