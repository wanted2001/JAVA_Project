package day17;

import java.util.HashMap;
import java.util.Scanner;

public class Map02 {
	
	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 map에 저장후 출력
		 * 합계 평균 출력
		 * 종료 키워드가 나올떄 까지 반복 (1=계속 0=종료)
		 * 과목과 점수를 입력하세요.
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장후 출력
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> score = new HashMap<String, Integer>();
		String sub = "null";
		int grade = 0 , sum = 0;
		double avg = 0;
		
		do {
			System.out.println("과목과 점수를 입력하세요. 종료는 종료나 0을 입력하세요>");
			sub=sc.next();
			if(sub.equals("종료")&&sub.equals("0")) {
				break;
			}
			
			grade=sc.nextInt();
			if(grade>100) {
				System.out.println("점수는 100을 넘을수 없습니다.");
				System.out.println("다시 점수 입력>");
				grade =sc.nextInt();
			}
			score.put(sub, grade);
		}while(!sub.equals("종료"));{
		System.out.println("종료 되었습니다 환산중......");
		}
		
		for(String key : score.keySet()) {
			sum+=score.get(key);
			System.out.println(key+":"+score.get(key));
		}	
		avg=sum/(score.size()-1);
		
		System.out.println("과목 총점: "+sum+"과목 평균: "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
