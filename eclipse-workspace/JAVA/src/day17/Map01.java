package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 묶어서 저장, key/value
		 * - key : 중복 불가, value : 중복가능
		 * - Hashmap을 가장 많이 사용
		 * 
		 * Hashmap<클래스,클래스> map = new Hashmap<클래스,클래스>();
		 * map은 값이 2개이기 때문에 향상된 for문 /iterator 사용 불가.
		 * map의 key => set으로 구성후 출력
		 * 
		 * list ,set => add() : 추가
		 * map => put() :추가
		 * getkey() , getvalue() // 추출가능 
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("사과", 1000);
		map.put("바나나", 2000);
		map.put("복숭아", 4000);
		map.put("오렌지", 6500);
		map.put("포도", 7000);
		
		System.out.println(map);
		System.out.println(map.keySet()); //key만 별도로 set 구성
		System.out.println(map.values()); //value만 별도 set 구성
		
		System.out.println(map.get("사과"));
		
		//remove() => key에 대한 값을 삭제하면서 value를 리턴
		System.out.println(map.remove("사과"));
		System.out.println(map);
		
		//null를 리턴
		System.out.println(map.remove("a")); 
		// key와 value를 둘다 주면 true/false로 리턴
		System.out.println(map.remove("바나나", 2000)); 
		
		int sum = 0;
		//향상된 for문
		for(String key : map.keySet()) {
			sum+=map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println(sum);
		
		int hap =0;
		//Iterator 출력
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
			hap+=map.get(key);
		}
		System.out.println(hap);
		
		
		
		
		
	}
	

}
