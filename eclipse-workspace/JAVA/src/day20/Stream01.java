package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림)
		 * - 실제 입력/출력이 표현된 데이터의 이상화된 흐름
		 * - 스트림은 자료에 대한 스트림을 생성하여 연산
		 * - 그 연산을 다 수행하면 스트림은 소모됨.
		 * - 스트림 연산은 기존 자료에 변경을 유발하지 않음.
		 * - 스트림은 기본자료를 복사하여 복사본은 연산에 사용.
		 * - 중간연산과 최종연산으로 구분됨.
		 * 
		 * - 중간연산: 메서드를 이어서 사용할 수 있음.
		 * - distinct():중복제거,filter():조건에 맞는값만 다음 스트림으로 넘김,limit():스트림의 일부를 잘라냄,
		 * - skip():스트림의 일부를 건너뒴,peak():스트림의 요소를 작업수행,sorted():정렬...
		 * 
		 * - 최종연산: 마지막에만 가능.
		 * - forEach(),count(),sum(),allMatch():스트림의 요소가 전부 일치하는지,anyMatch():하나라도 일치하는지,
		 * - toArray():배열로 변환,collect():스트림 자료 수집...
		 */
		
		int[] arr={1,2,3,4,5,6,7,8};
		int sum = 0;
		
		for(int i: arr) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("---스트림을 이용한 합계");
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		
		System.out.println("---스트림 count()");
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		System.out.println("---스트림 avg()");
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		//arr 값을 5이상의 값만 출력
		int s5 = Arrays.stream(arr).filter(n-> n>=5).sum();
		System.out.println(s5);
		
		//점수 배열을 생성한 후 70점 이상(filter)만 합계(sum)와 평균(avg)
		System.out.println("---70점 이상 합계 평균");
		int[] score = {10,20,30,40,50,60,70,80,90,100};
		int scosum =Arrays.stream(score).filter(n->(n>=70)).sum(); //70점 이상 합계
		OptionalDouble scoavg =Arrays.stream(score).filter(n->(n>=70)).average(); //70점 이상 평균
		OptionalInt max = Arrays.stream(score).max();
		System.out.println(scosum);
		System.out.println(scoavg);
		System.out.println(max);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(78);
		list.add(9);
		list.add(9);
		list.add(7);
		list.add(7);
		list.add(13);
		list.add(6);
		list.add(6);
		list.add(6);
		System.out.println("-----list 스트림 구성------");
		list.stream()
		.forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println("---distinct 중복제거------");
		list.stream()
		.distinct().forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println("--------sorted 정렬------");
		list.stream()
		.sorted().distinct().forEach(n->System.out.print(n+" "));
		System.out.println();
		
		System.out.println("---스트림 객체 생성");
		Stream<Integer> s1 = Stream.of(10,20,30,40,50,60,80,90,110);
		System.out.println("--- Integet 스트림 합계----");
		//map : 스트림 변환에 사용하는 중간연산
		int s = s1.mapToInt(n-> n.intValue()).sum();
		System.out.println(s);
		s1.forEach(n->System.out.println(n+" ")); //한번 스트림(복사본으로 사용했기 때문에 다시 못씀)
		
		
		
	
			
		
		
		
		
		
		
		
		
		
		
		
	}

}
