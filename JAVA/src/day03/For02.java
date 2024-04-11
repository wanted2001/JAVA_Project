package day03;

public class For02 {

	public static void main(String[] args) {
		/*
		 * 1부터 10까지 콘솔에 출력
		 *
		 */
		for(int i = 1;  i<=10; i++) {System.out.print(i+" ");}
		System.out.println();
		
		/*
		 * 1부터 10까지 짝수 까지 출력
		 */
		for (int j = 2; j<=10; j+=2){
			System.out.print(j+" ");
			}
		System.out.println();
		for (int j = 1; j<=10;  j++) {
			if(j%2==0) {System.out.print(j+" ");}
			}
		System.out.println();
		
		/*
		 * 1부터 10까지 합계를 구해주세요
		 */
		int sum = 0; //지역변수는 반드시 초기화 해야함. 초기화 할때 숫자는 0 문자는 null이다.
		for(int i = 0; i<=10; i++) {
			sum+=i; //sum = sum + i같은 의미
		}
		System.out.println(sum);
		
		/*
		 * 1부터 10까지의 짝수합과 ,홀수합을 출력
		 */
		
		int odd =0, even =0;
		for (int i = 0; i<=10; i++) 
		{ if (i%2==0) {even = even+i;}
			else{odd = odd+i;}}
		System.out.println("짝수 합 : "+ even);
		System.out.println("훌수 합 : "+ odd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}
