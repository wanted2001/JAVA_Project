package day18;


import java.util.HashMap;
import java.util.Iterator;

public class MapEx01 {

	public static void main(String[] args) {
		/* Map을 이용하여 상품과 가격을 추가하여 합계를 구하시오
		 * 상품을 map에 추가하는 작업은 메서드를 활용
		 * 1. map를 main에 만들고 매개변수로 받아 map에 데이터를 채우는 메서드
		 * 2. map를 메서드내부에서 생성하여, main으로 리턴하는 메서드
		 * 
		 * 가위 2500
		 * 크레파스 4000
		 * 물감 5000
		 * 합계 ?
		 */
		//map를 매개변수로 받는 케이스
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int sum =0;
		MapEx01 m = new MapEx01();
		System.out.println("--map를 매개변수로 받는 메서드 실행--");
		m.makemap(map);
		for(String s : map.keySet()) {
			sum+=map.get(s);
			System.out.println(s+":"+map.get(s));
		}
		System.out.println("총합: "+sum);
		
		sum=0; //sum을 초기화
		//map를 리턴받는 케이스
		System.out.println("--map를 리턴으로 받는 메서드 실행--");
		HashMap<String, Integer> map1  = m.makeMap2();
		for(String s : map1.keySet()) {
			sum+=map1.get(s);
			System.out.println(s+":"+map1.get(s));
		}
		System.out.println("총합: "+sum);
		
		System.out.println("--map를 받아서 출력하는 메서드 실행--");
		m.printmap(m.makeMap2());
		
		
	}
	
	//map를 매개변수로 받는 케이스
	public void makemap(HashMap<String, Integer> map) {
		map.put("가위", 2000);
		map.put("물감", 5000);
		map.put("크레파스", 4000);
	}
	
	//map를 내부에서 생성하여 리턴하는 케이스
	public HashMap<String, Integer> makeMap2(){
		HashMap<String , Integer> map = new HashMap<String, Integer>();
		map.put("가위", 2000);
		map.put("물감", 5000);
		map.put("크레파스", 4000);
		
		return map;
	}
	
	//map을 받아서 출력하는 메서드
	public void printmap(HashMap<String, Integer>map) {
		Iterator<String> it = map.keySet().iterator();
		int sum =0;
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp+":"+map.get(tmp));
			sum+=map.get(tmp);
		}
		System.out.println("총합: "+sum);
	}
	

}
