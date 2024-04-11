package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01{

	public static void main (String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스, 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할때 사용
		 * 주로 배열대신 사용
		 * 
		 * List(배열과 동일)
		 * - 갋을 하니씩 저장
		 * - 순서를 보장 (index)
		 * - 중복 허용
		 * - 배열 대신 가장 많이 사용하는 구조 
		 * 
		 * Set
		 * - 값을 하나씩 저장 
		 * - 순서를 보장하지 않음 (index X)
		 * - 중복 허용 하지 않음 (같은 자료가 입력되면 버려짐)
		 * 
		 * Map
		 * - 값을 두개씩 저장 key/value 쌍으로 저장
		 * - key 중복 불가능 / value 중복가능.
		 * - key가 중복되면 value는 덮어쓰게 됨.
		 * - 아이디/비밀번호와 같이 하나의 자료를 묶어서 저장할떄 사용
		 * 
		 * 배열은 기본자료형, 클래스자료형 구성이 가능
		 * int arr[] String arr[] Student arr[]
		 * 
		 * 컬렉션은 기본 자료형은 불가능, 클래스 자료형만 구성가능
		 * 기본 자료형에 맞는 클래스 자료형을 사용하면 됨.
		 * int = Integer,String
		 * 나머지는 기본자료형에 첫글자만 대문자로 변환하면 클래스가 됨.
		 * long => Long, byte => Byte, boolean => Boolean
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨.
		 * 
		 * List<클래스명> 객체명 => new 구현클래스<클래스명>();
		 * List => 구현 클래스 ArrayList, LinkedList
		 * 
		 * ArrayList : 검색시 유리
		 * - 미리 길이를 지정하지 않음 추가되면 늘어남, 삭제되면 줄어듬
		 * - 추가, 삭제가 쉽다. 검색이 쉬움.
		 * LinkedList : 추가 삭제가 많을 경우 유리
		 * - 값을 중간에 끼워넣거나, 빼는게 좋음. 
		 * - 검색 할때는 느리다.
		 */
		
		List<Integer> list = new ArrayList<Integer>(); // 부모 기준으로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //자식 기준으로 생성
		ArrayList list2 = new ArrayList(); // object로 생성
		ArrayList<Integer> list3 = new ArrayList<>(); // 앞에 있는 클래스를 따라간다.
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		// 내부에 toString이 존재한다.
		System.out.println(list); 
		
		// 내부 인덱스 번지를 가져올 수 도 있다.
		System.out.println(list.get(0)); 
		
		// 해당번지(index) , 값 세팅을 할 수도 있다.
		list.set(0,5); 
		System.out.println(list.get(0));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------");
		//size() : 총 개수를 확인
		System.out.println(list.size());
		System.out.println("----------------");
		// 문자열을 담을 수 있는 ArrayList를 생성
		// 문자열 5개를 저장한후 출력
		// 총 개수가 몇개 인지도 출력
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("사과");
		sList.add("바나나");
		sList.add("호두과자");
		sList.add("보름달");
		sList.add("유림기");
		
		for(int i = 0; i<sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		System.out.println("----------------");
		//향상된 for문
		for(String s : sList) {
			System.out.println(s);
		}
		
		System.out.println("----------------");
		System.out.println("리스트 개수:"+sList.size());
		
		
		//list1에 1부터 10까지 값을 지정한후 출력
		for(int j=0; j<10; j++) {
			list1.add(j+1);
		}
		System.out.println(list1);
		
		list1.set(0,7);
		System.out.println(list1);
		
		//remove(index) : Index 번지의 값을 삭제
		//remove(object) : object 요소를 삭제
		list1.remove(0);
		System.out.println(list1);
		Integer a = 9;
		list1.remove(a);
		System.out.println(list1);
		
		//contains(object) : list에 값이 있는지 검사 true / false로 리턴
		System.out.println(list1.contains(a));
		
		//clear() : 리스트를 비움 (요소 전부 삭제)
		list1.clear();
		System.out.println(list1);
		
		//isEmpty() : 리스트가 비어있는지 체크 비어있으면 true /false
		System.out.println(list1.isEmpty());
		
		//Arraylist로 number를 생성 숫자를 저장하는 리스트 
		//1부터 10까지 채운후 출력(향상된 포문으로 출력)
		
		List<Integer> num = new ArrayList<Integer>();
		
//		for(int i=0; i<10; i++) {
//			num.add(i+1);
//		}
//		for(int n : num) {
//			System.out.print(n+" ");
//		}
		
		/* Iterator : index가 없는 값을 출력하기 위해 사용
		 * list 에서는 순서를 보장하기 떄문에 get(i) 사용하여 원하는 번지에 접근가능
		 * set/ map은 순서를 보장하기 않기 떄문에 일반 for문을 사용할 수없음.
		 * 향상된 for , Iterator를 사용
		 * 순서와 상관없이 값을 가져올수 있는 구문을 사용해야함.
		 * map은 향상된 for, itrator 둘다 직접 사용불가능.
		 */
		System.out.println();
		System.out.println(">>Iterator 출력 ");
		Iterator<Integer> it = num.iterator();
		while(it.hasNext()) { //hasNext() 다음 요소가 있는 체크 true / false
			Integer tmp = it.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
			
		//indexOf(값) : 해당 값이 listdp index 반환 /없다면 -1를 반환
		System.out.println(num.indexOf(a));
		System.out.println(num.contains(a));
		
		//number 리스트를 비우고, 값을 무작위로 5개만 추가
		num.clear();
		num.add(78);
		num.add(58);
		num.add(28);
		num.add(90);
		num.add(45);
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);
		
		// sort(Comparator를 구현한 객체) : 정렬
		// Compatator 인터페이스를 구현한 구현체를 넣어야함.(익명클래스 사용)
		num.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 : 오름차순 / o2 - o1 : 내림차순 정렬
				// 결과가 -면 앞으로 보내고 +면 뒤로 보내는 역할
				return o2-o1;
			}	
		});
		System.out.println(num);
	}
}
