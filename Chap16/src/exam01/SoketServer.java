package exam01;

import java.io.*;
import java.net.*;

public class SoketServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket serverSocket = new ServerSocket(9001);
			 
			while (true) {
				Socket socket = serverSocket.accept();
				//요청정보 대기 하다가 접근되면 주소값 리턴
				ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream()) ;
				
				String msg = inStream.readUTF();
				System.out.println("클라이언트가 전송해 온 메세지" + msg);
				
				if (msg.equals("exit")) {
					break; //while 문 빠져나가기 위한 (클라이언트 종료 선언을 하면 빠져나가기 위함) 조치
				}
				
				ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
				
				outStream.writeUTF("김우현이 전달한 메세지 : " + msg + "잘 받았어요!");
				outStream.flush();
				
				outStream.close();
				inStream.close();
				socket.close();
			}
			serverSocket.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
