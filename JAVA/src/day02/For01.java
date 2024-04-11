package day02;

public class For01 {

	public static void main(String[] args) {
		/*
		 * 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while  
		 * - for, while 동작방식이 같음
		 *  => 조건에 맞지 않으면 한번도 실행되지 않을 수 있음
		 *  do~while => 조건에 맞지 않아도 무조건 1번은 실행
		 *  
		 *  for(1초기화; 2조건식; 4증감식){
		 *  3실행문; 
		 * }
		 * 	-초기화 : 조건식이나 ,실행문에서 사용할 변수를 초기화 : 생략가능 
		 * 			여러변수 초기화 가능 처음 1번만 실행
		 * 	-조건식 : 반복의 반복을 결정하는 식( true => 반복) :생략가능
		 *  -증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복횟수를 조절 : 생략가능
		 */
		//1부터 10까지 출력하는 예제
		for(int i =1; i <=10; i++) {
			System.out.print(i+" ");
		}
		// 현상태의 i 의 값은 11
		//System.out.println(i);
		System.out.println();
		//10 부터 1 까지 출력하는 예제
		for(int i = 10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//2부터 10까지 짝수만 출력
		for(int i = 2; i<=10; i++)
		{
			if(i%2==0) {
			System.out.print(i+" ");}
		}
		System.out.println();
		// 1부터 10까지 합계를 출력
		int sum = 0;
		int i;
		for (i = 1; i<=10; i++) {
			sum+=i;
			System.out.println(i + "->" + sum);
		}
			System.out.print(sum+" ");
			
			
		
	}

}
