package day01;

public class 과제 {

	public static void main(String[] args) {
		// 카페에 제출 
		/*
		 * 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 평균은 소수점을 살려서 출력
		 * 조건선택연산자를 이용하여 평균이 80 이상이면 합격 아니면 불합격
		 * 
		 */
		int kor = 90, eng = 73, math = 85;
		int sum = kor + eng + math ; 
		double avg = sum/3.0;
		
		
		System.out.println("합계 :"+ sum + "점 입니다.");
		System.out.printf("평균 :"+ "%.3f" + "점 입니다.\n",avg); // 소수점 3자리 까지 표현하는 방법
		System.out.println("평균 :"+ avg + "점 입니다.");// 소수점 끝까지 표현 하는 방법
		System.out.println((avg>=80) ? "합격" : "불합격");
		
		/* 조건 선택 연사자 => if 문으로 변경
		if(조건식) {
			처리문;
		}else { 처리문;
	}*/	
	if( avg >=80) {System.out.println("결과: 합격");
	System.out.println("결과 두줄");
	}else { System.out.println("결과: 불합격");
	} 
	
	
	} }

	
