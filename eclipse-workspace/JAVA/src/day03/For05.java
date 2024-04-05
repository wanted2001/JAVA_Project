package day03;

public class For05 {

	public static void main(String[] args) {
		/*약수 : 1부터 자기자신까지 떨어지는 수의 집합
		 * 
		 * 공약수 : 두수의 공통된 약수
		 * 최대 공약수는 공약수중 제일 큰수
		 * 최소 공약수는 공약수중 제일 작은수
		 * 6과 12의 공약수를 구하시오
		 */
		
		int num1 = 6;
		int num2 = 12;
		int sum = 0 ;
		for(int i =1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0){
				sum = i;}}
		System.out.println(sum);
		
		// break;
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * 
		 */	
		for(int i=num1;; i--) { 
			if(num1 % i ==0 && num2 % i == 0) { 
			System.out.println(i);
			break;}
		}
		
		//중첩 for문 일경우 break 는 나를 감싸고 있는 for문을 벗어남.
		int i = 0 ;	
		a: for(;;) {
			for(;;) {
				for(;;) {
					for(;;) {
						i++;
						if(i==10) {
							System.out.println(i);
							break a;
						}
					}
				}
			}
		}
		
		
		
		
		
	}

}
