package exam02;

import java.io.*;

public class BufferFileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			byte[] buf = new byte[1024];
			int copyByte =0;
			InputStream inputStream = new FileInputStream("Fonts.zip");
			OutputStream outputStream = new FileOutputStream("CopyBuffer.zip");//자동으로 파일 생성 ㅇ
			
			try {
				while(true) {
					
				int readLen = inputStream.read(buf);
				if(readLen ==-1) {
					break;
				}
				outputStream.write(buf, 0, readLen);// buf , 0(0번째 인덱스부터), readLen을 읽기
				copyByte+=readLen;//1024개 만큼 적재 해야함
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
