package exam01;

import java.io.*;

public class ByteFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int copyByte =0;
			InputStream inputStream = new FileInputStream("Fonts.zip");
			OutputStream outputStream = new FileOutputStream("Copy.zip");//자동으로 파일 생성 ㅇ
			
			try {
				while(true) {
					
				int bData = inputStream.read();
				if(bData ==-1) {
					break;
				}
				outputStream.write(bData);
				copyByte++;
				}
				inputStream.close();
				outputStream.close();
				
				System.out.println("복사된 바이트 크기 : " + copyByte);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//1byte 로 읽어옴.
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
