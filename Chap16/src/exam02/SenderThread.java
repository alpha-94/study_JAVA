package exam02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class SenderThread extends Thread{

	Socket socket;
	String name;
	
	public SenderThread(Socket socket, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.socket = socket;
	}

	@Override
	public void run() {
		PrintWriter writer;
		Scanner input = new Scanner(System.in);
		try {
			writer = new PrintWriter(socket.getOutputStream());
			writer.println(name);
			writer.flush();
			while (true) {
				String msg = input.nextLine();
				
				writer.println(msg);
				writer.flush();
				if (msg.equals("exit")) {
					break;
				}
			}
			
		} catch (IOException e) {
			System.out.println("IOException Error");
		}
		
	}

	
}
