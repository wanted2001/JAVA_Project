package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 구성
		 * 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만원으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1.비용 계산 => 출력, 2.고객명단 검색 => 출력
		 * 고객 클래스 생성하고, ArrayList로 고객 관리
		 * 
		 * 예시) 고객정보 -> 고객명단
		 * 이름 : 이순신 나이:40, 비용:100
		 * 총 여행 경비 : 100
		 * 
		 * 20대이상 고객명단 => 이름순으로 정렬
		 * 이름: 신사임당, 나이 34, 비용:100
		 * 
		 * 
		 */
		ArrayList<Customer> c = new ArrayList<Customer>();
		c.add(new Customer("짱구",5));
		c.add(new Customer("짱아",2));
		c.add(new Customer("철수",40));
		c.add(new Customer("코난",30));
		c.add(new Customer("진구",20));
		c.add(new Customer("맹구",25));
		c.add(new Customer("루피",15));
		c.add(new Customer("도라에몽",29));
		c.add(new Customer("나비",28));
		c.add(new Customer("기린",1));
		c.add(new Customer("하마",7));
		c.add(new Customer("사자",3));
		
		//고객명단
		c.stream().forEach(n->{
			if(n.getAge()>=15) {
				n.setTripmoney(100);
			}else {
				n.setTripmoney(50);
			}
			System.out.println(n+" ");
		});
		
		//고객 
		int sum =c.stream().mapToInt(n->n.getTripmoney()).sum();
		System.out.println("총 여행경비:"+sum);
		
		System.out.println("-------------------------------");
		
		//고객정렬
		c.stream()
		.filter(n->n.getAge()>=20)
		.sorted(new Comparator<Customer>() {			
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		}).forEach(n->System.out.println(n+" "));
		
		
	}

}
