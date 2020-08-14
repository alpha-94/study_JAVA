package exam02;

import java.io.IOException;
import java.net.Socket;

public class ClientChatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김우현";
		
		try {
			Socket socket = new Socket("192.168.0.101",9002);
			
			Thread sender = new SenderThread(socket,name);		//송신 스텐바이(쓰레드) 
			Thread receiver = new ReceiverThread(socket);	//수신 스텐바이(쓰레드)
			
			sender.start();
			receiver.start();
			
		} catch (IOException e) {
			
			System.out.println("IOException Error");
		}
		

	}

}
