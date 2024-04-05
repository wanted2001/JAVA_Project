package day20;

import java.util.HashMap;
import java.util.function.Consumer;

public class Lambda02 {

	public static void main(String[] args) {
		// map을 구성하여 foreach를 사용하며 출력
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("길동", 89);
		map.put("홍이", 70);
		map.put("영이", 40);
		map.put("장군", 58);
		map.put("철이", 61);
		map.put("영철", 63);

		map.forEach((k, v) -> {
			System.out.println(k + ":" + v);
		});
		System.out.println("---함수형 인터페이스---");

		Number sum = (a, b) -> { //함수 구현
			return a + b;
		};
		
		int hap=sum.add(50, 60);
		System.out.println(hap);
		System.out.println(sum.add(100, 200));
		
		Number max = (a,b)->(a>=b)?a:b;
		System.out.println(max.add(50, 20));

	}

}

//함수형 인터페이스 생성
//메서드가 반드시 1개여야만 함.
@FunctionalInterface
interface Number {
	int add(int a, int b);
	//int max(int a, int b); 메서드 2개면 에러남
}
