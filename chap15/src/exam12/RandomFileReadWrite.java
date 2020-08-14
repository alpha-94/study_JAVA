package exam12;

import java.io.*;

public class RandomFileReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			RandomAccessFile raf = new RandomAccessFile("data.bin", "rw");
			
			System.out.println("Write.............................");
			System.out.printf("현재 입출력 위치 ::%d 바이트 \n",raf.getFilePointer());
			
			raf.writeInt(200);
			raf.writeInt(500);
			System.out.printf("현재 입출력 위치 ::%d 바이트 \n",raf.getFilePointer());//위치 정보 제공
			
			raf.writeDouble(3.14);
			System.out.printf("현재 입출력 위치 ::%d 바이트 \n",raf.getFilePointer());//위치 정보 제공
			
			raf.seek(0);
			System.out.printf("현재 입출력 위치 ::%d 바이트 \n",raf.getFilePointer());//위치 정보 제공
			
			System.out.println(raf.readInt());
			
			System.out.println(raf.readInt());
			
			System.out.println(raf.readDouble());
			
			raf.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
