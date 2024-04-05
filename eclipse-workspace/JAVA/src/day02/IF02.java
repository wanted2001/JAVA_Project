package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/* 국어,영어,수학 점수를 입력받아
		 * 합계,평균,평가를 출력
		 * 평가는
		 * 평균이 90이상이라면 A
		 * 평균이 80이상이라면 B
		 * 평균이 70이상이라면 C
		 * 나머지는 D
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값입니다.
		 */
		Scanner scan = new  Scanner(System.in);
		//입력 안내문자
		System.out.println("정수 입력(0~100) : 국어, 영어, 수학 순으로 입력 >");
		
		int kor = scan.nextInt(), eng = scan.nextInt(), math = scan.nextInt();
		
		if(kor > 100 || kor < 0) {System.out.println("국어점수 다시 입력해주세요.");
		}
		if(eng > 100 || eng < 0) {System.out.println("영어점수 다시 입력해주세요.");
		}
		if(math > 100 || math < 0) {System.out.println("수학점수 다시 입력해주세요.");
		}
		
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println("합계 :"+sum + " 평균 :"+avg);
		
		char result = 'D'; //char = ''
		
		if(avg > 100 || avg < 0) {System.out.println("잘못된 성적입니다.");
		}
		else if(avg>=90) {result = 'A';}
		else if(avg>=80) {result = 'B';}
		else if(avg>=70) {result = 'C';}
		else {result = 'D';}
		System.out.println("결과 : "+result);
		
		scan.close();
		}		
	}


