package exam05;

import java.io.*;

public class DataBufferFilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//방법 1 
			OutputStream outputStream = new FileOutputStream("data.bin");
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
			DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
			
			dataOutputStream.writeInt(1000);
			dataOutputStream.writeDouble(3.14);
			
			dataOutputStream.close();
			
//			//방법 2 -error
//			OutputStream outputStream = new FileOutputStream("data.bin");
//			DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
//			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(dataOutputStream);
//			//데이터 재가공 불가능 data writeInt, writeDouble 등 
			
			InputStream inputStream = new FileInputStream("data.bin");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
			DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
			
			System.out.println(dataInputStream.readInt());
			System.out.println(dataInputStream.readDouble());
			
			dataInputStream.close();//데이터 초기화
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
