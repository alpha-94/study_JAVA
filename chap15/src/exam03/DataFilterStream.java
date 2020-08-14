package exam03;

import java.io.*;

public class DataFilterStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			OutputStream outputStream = new FileOutputStream("data.bin");
			DataOutputStream filterDataOutputStream = new DataOutputStream(outputStream);
			
//			outputStream.write(365);
//			outputStream.close();
			
			filterDataOutputStream.writeInt(365);
			filterDataOutputStream.writeDouble(3.14);
			
			filterDataOutputStream.close();
			
			InputStream inputStream = new FileInputStream("data.bin");
			DataInputStream filterDataInputStream = new DataInputStream(inputStream);
			
//			System.out.println(inputStream.read());
//			inputStream.close(); 
			
			System.out.println(filterDataInputStream.readInt());
			System.out.println(filterDataInputStream.readDouble());
			
			filterDataInputStream.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
