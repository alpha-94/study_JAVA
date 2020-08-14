package exam10;

import java.util.NavigableSet;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class IntroTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();//데이터 중복 허용 X & 정렬(key 값 기준으로 정렬)
		
		
		map.put(6, "data6");	//map.put(new Integer(6), "data6");
		map.put(4, "data4");
		map.put(5, "data5");
		map.put(2, "data2");
		map.put(1, "data1");
		map.put(3, "data3");
		
		
		NavigableSet<Integer> navi = map.navigableKeySet();
		
		System.out.println("=== 오름차순 ===");
		navi.iterator(); // 데이터를 읽어오기 위한 자료형 객체
		java.util.Iterator<Integer> itr = navi.iterator();
		
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}
		
		System.out.println("=== 내림차순 ===");
		itr = navi.descendingIterator();
		
		while (itr.hasNext()) {
			System.out.println(map.get(itr.next()));
		}

	}

}
