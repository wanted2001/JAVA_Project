package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * 출력 for/ 향상된 for /iterator 출력
		 * import 단축키 ctrl+shift+o
		 */
		
		
		List<String> day = new ArrayList<String>();
		
		day.add("걷기");
		day.add("뛰기");
		day.add("날기");
		day.add("땅파기");
		day.add("높이뛰기");
		
		for(int i=0; i<day.size(); i++) {
			System.out.print(day.get(i)+" / ");
		}
		System.out.println();
		
		for (String s : day) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		Iterator<String> is = day.iterator();
		while(is.hasNext()) {
			String tmp = is.next();
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		Collections.sort(day);
		System.out.println(day);
		System.out.println("------------------------------------");
		day.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 (크다/작다를 이용) -/+의 값이 출력
				// 문자는 compareTo 메서드를 활용하여 출력
				// o1.compareTo (o2); : 오름차순
				return o2.compareTo(o1); // 내림차순
			}
		});
		System.out.println(day);
	
		

	}

}
