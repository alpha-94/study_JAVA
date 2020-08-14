package exam02;

import java.io.*;
import java.net.*;

public class SeverChatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket serverSocket = new ServerSocket(9002);
			
			while (true) {
				Socket socket = serverSocket.accept();
				Thread client = new PerClientThread(socket);//accept로 허용된 클라이언트 소켓 추출
				client.start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
