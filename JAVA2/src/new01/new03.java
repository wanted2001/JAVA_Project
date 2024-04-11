package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class new03 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크
		 * - list : 순서를 보장 중복 지정 가능
		 * - set : 순서 X, 중복 X
		 * - Map : 순서보정 X 데이터를 쌍으로 지정
		 *  key(중복불가능) : value(중복가능) 로 저장
		 */
		
		//리스트를 생성하고 1~10까지 등록한후 출력
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i<=10; i++) {
			list.add(i);
		}
		
		for(Integer a : list) {
			System.out.print(a+" ");
		}
		
		// map를 이요하여 이름 : 점수 형태로 3명만 이력
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("kim",89);
		map.put("yoon",89);
		map.put("choi",89);
		map.put("na",89);
		map.put("lee",89);
		System.out.println(map);
		
		
		for(String b : map.keySet()) {
			System.out.println(b + ":" + map.get(b));
		}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}

	}

}
