package exam02;

import java.io.*;
import java.net.Socket;

class ReceiverThread extends Thread{

	Socket socket;
	
	
	public ReceiverThread(Socket socket) {
		// TODO Auto-generated constructor stub
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(socket.getInputStream()));
		while (true) {
			String msg = reader.readLine();
			
			if (msg!=null) {
				System.out.println(msg);
			}
		}
			
		
		} catch (IOException e) {
		
		
		}
		
		
	}
	
}
