package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		// Student 클래스를 리스트 구성
		// add로 5명 추가

		ArrayList<Student> s = new ArrayList<Student>();
		Student stu = new Student("짱구", 48);
		Student stu1 = new Student("철수", 72);
		Student stu2 = new Student("맹구", 99);
		Student stu3 = new Student("훈이", 18);
		Student stu4 = new Student("유리", 78);
		s.add(stu);
		s.add(stu1);
		s.add(stu2);
		s.add(stu3);
		s.add(stu4);
		System.out.println(s);
		
		System.out.println("---스트림 작성---");
		
		//스트림을 이용하여 콘솔에 출력 ex) 홍길동 : 98
		s.stream()
		.forEach(n->System.out.println(n+" "));
		
		System.out.println();
		
		s.stream()
		.forEach(
				n->{
					String name = n.getName();
					int score = n.getScore();
					System.out.println(name+":"+score);
				});
		
		//list의 점수 합계 / 전체 인원수 출력
		int sum = s.stream()
				.mapToInt(n->n.getScore()).sum();
		System.out.println("합계:"+sum+"점");
		
		long cnt =s.stream()
		.count();
		System.out.println("인원:"+cnt+"명");
		
		
		
	
		
		
		
		
		
		
		

	}

}
