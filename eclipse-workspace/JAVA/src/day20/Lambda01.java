package day20;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		/* lambda + Stream => 람다와 스트림
		 * lambda : 람다식 (식를 단순하게 표현하는 방법)
		 * 	외부 자료의 부수적인 영향(side effect)를 주지 않도록 구현하는 방식
		 * Stream : 자료의 대상과 관계없이 동일한 연산을 수행할수 있도록 해주는 반복자
		 * 
		 * lambda functions : 람다함수 => 익명클래스를 사용하여 쓰는 함수
		 * 람다의 장점 :코드의 간결화, 병렬처리 가능, 불필요한 연산 최소화
		 * 람다의 단점 :코드의 가독성이 떨어짐, 반복문 사용자 성능 차이
		 * - 람다의 표현식
		 * (매개변수) -> {구현};
		 * 매개변수가 하나면 () 생략가능.
		 * x -> {return x+1;};
		 * return이 없으면 {} 생략가능.
		 * x -> x+1;
		 * (x,y) -> x+y;
		 * (x,y) -> {return x+y};
		 * 
		 * - 오류식
		 * x -> return x+1; 리턴이 있을때 중괄호 생략하면 오류
		 * x,y -> {return x+y;} 매개변수가 2개일떄 괄호 생략하면 오류
		 */
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(100);
		list.add(70);
		list.add(80);
		list.add(90);
		
		for(Integer l : list) {
			System.out.print(l+" ");
		}
		System.out.println();
		System.out.println("------------람다식 처리------------");
		list.forEach(n->{
			System.out.print(n+" ");
		});
		System.out.println();
		
		Consumer<Integer> method =(n)->{
			System.out.print(n+" ");
		};
		System.out.println("---Consumer를 이용한 출력-----");
		list.forEach(method);
	}

}
