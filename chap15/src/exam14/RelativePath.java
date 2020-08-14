package exam14;

import java.io.File;

public class RelativePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("c:" + File.separator+ "MyJava"+File.separator+"my.bin");
		
		//if (myFile.exists()==false) {//존재하면 true 존재하지 않으면 false
		if (!myFile.exists()) {//if 자체가 true를 체크하는데 그 반대로 false를 체크하고 싶으면 ! 를 붙이면 된다.
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		//"c:" + File.separator+  삭제 => 절대경로
		
		//상대경로!
		File reDir = new File("YourJava" + File.separator+ "Java");
		reDir.mkdirs();

		File reFile = new File(reDir,"your.bin");
		myFile.renameTo(reFile);//이름 변경 + 파일 옮기기 기능
		
		if (reFile.exists()) {
			System.out.println("파일 이동 성공!");
		}else {
			System.out.println("파일 이동 실패!");
		}
		
		
		System.out.println("프로그램 종료");

	}

}
