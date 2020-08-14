package exam01;

import java.io.*;

import java.net.Socket;

public class socketClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Socket socket = new Socket("192.168.0.118",9001);
			
			ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
			
			outStream.writeUTF("김우현");
			outStream.flush();
			
			ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
			
			String msg = inStream.readUTF();
			
			System.out.println("서버로 부터 전송되어진 메세지 :: " + msg);
			
			inStream.close();
			outStream.close();
			socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
