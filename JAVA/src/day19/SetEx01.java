package day19;

import java.util.HashSet;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* Set 중복 저장X
		 * set에 로또번호 6개 생성후 출력
		 * 랜덤 번호 1~45
		 */
		//new Random().nextInt(45)+1; 랜덤값 만드는 또다른 방법
		
		HashSet<Integer> lotto = new HashSet<Integer>();
		
			while(lotto.size()!=6) {
				int ran = (int)(Math.random()*45)+1;
				lotto.add(ran);
			}
			
			System.out.println(lotto);
			System.out.println("------------------");
			
			//set 중에서 정렬이 되는 set Treeset
			//본인만 사용가능
		TreeSet<Integer> treeset =new TreeSet<Integer>(); 
		
		while(treeset.size()!=6) {
			int ran = (int)(Math.random()*45)+1;
			treeset.add(ran);
		}
		
		//first는 맨앞에 수 
		System.out.println(treeset.first());
		//last는 맨뒤에 수
		System.out.println(treeset.last());
		
		//headset : 지정한 값보다 작은값을 준다.
		System.out.println(treeset.headSet(20));
		//tailset : 지정한 값보다 큰 값을 준다.
		System.out.println(treeset.tailSet(20));
		
		System.out.println("------------------");
		
		//subset : 검색 범위 지정 뒤쪽 값을 미포함.
		System.out.println(treeset.subSet(15, 30)); //15이상 포함 30이하 미포함
	}
		
}
