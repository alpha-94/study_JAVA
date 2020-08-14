package exam04;

import java.io.*;

public class ByteBufferFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int copyByte =0;
			InputStream inputStream = new FileInputStream("Fonts.zip");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			//퍼포먼스 이슈 최소화
			
			OutputStream outputStream = new FileOutputStream("Copy.zip");//자동으로 파일 생성 ㅇ
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
			//퍼포먼스 이슈 최소화
			
			try {
				while(true) {
					
				int bData = bufferedInputStream.read();
				if(bData ==-1) {
					break;
				}
				bufferedOutputStream.write(bData);
				copyByte++;
				}
				bufferedInputStream.close();
				bufferedOutputStream.close();
				
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
