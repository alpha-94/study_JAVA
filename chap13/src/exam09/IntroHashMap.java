package exam09;

import java.util.HashMap;

public class IntroHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("이름", "홍길동");
		map.put("주소", "서울시 종로구");
		map.put("이메일", "abc@aaa.com");
		map.put("전화번호", "010-1111-1111");
//		map.put("주소", "서울시 중구");
		
		System.out.println(map.get("이름"));//key - value 형태로 관리!
		System.out.println(map.get("주소"));
		System.out.println(map.get("이메일"));
		System.out.println(map.get("전화번호"));
		
		//데이터 삭제
		map.remove("주소");
		
		System.out.println(map.get("주소"));
		
		
		

	}

}
