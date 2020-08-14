package exam11;

import java.io.*;

public class ObjectSerializable {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(1, 1, 2.4);
		Circle c2 = new Circle(2, 2, 4.8);
		
		
		try {
			//인스턴스 저장
			 ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			 
			 out.writeObject(c1);
			 out.writeObject(c2);
			 out.writeObject("String implements Serializable");
			 out.close();
			 
			 //인스턴스 복원
			 ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
			 Circle c10 = (Circle)in.readObject();
			 Circle c20 = (Circle)in.readObject();
			 String messageString = (String)in.readObject();			 
			 
			 //정보 출력
			 c10.showCircleInfo();
			 c20.showCircleInfo();
			 System.out.println(messageString);
			 
			 in.close();
			 
			 
			 
			 
			 
			 
			 
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
