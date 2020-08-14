package exam02;

import java.util.*;
import java.io.*;
import java.net.*;


class PerClientThread extends Thread{
	static List<PrintWriter> list = 
//			new ArrayList<PrintWriter>();
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	Socket socket ;
	PrintWriter writer;
	
	PerClientThread(Socket socket){
		this.socket = socket;
		try {
			writer = new PrintWriter(socket.getOutputStream());
			list.add(writer);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException Error");
		}
	}
	@Override
	public void run() {
		String nameString = null;
			try {
				BufferedReader reader 
				= new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				nameString = reader.readLine();//클라이언트 요청값 받는 메서드
				sendAll(" ## " + nameString + "님이 입장 하셨습니다.");
				
				while (true) {
					String msg = reader.readLine();
					if (msg !=null) {
						sendAll(nameString + ">>" + msg);
					}
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("IOException ERROR");
			}
			
			
		}
		private void sendAll(String msg) {
			for (PrintWriter e : list) {
				e.println(msg);
				e.flush();
			}
		}
	
	
	}
	

	
	

