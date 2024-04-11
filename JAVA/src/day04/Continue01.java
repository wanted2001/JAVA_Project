package day04;

public class Continue01 {

	public static void main(String[] args) {
		/*
		 * continue : 계속 pass m skip 개념
		 * 1~10까지 출력
		 * 5는 빼고 출력
		 */
		
		for(int i = 1 ; i<=10; i++) {
			if(i==5) {
				continue;//해당 조건은 pass 같은 의미 이다.
			}
			System.out.print(i+" ");
		}
		System.out.println();
		/*1부터 10까지 짝수만 출력
		 * 홀수를 continue로 pass
		 */
	
		for(int j = 1; j<=10; j++) {
			if(j%2!=0) {continue;}
			System.out.print(j+"   ");
			
		}

	}

}
