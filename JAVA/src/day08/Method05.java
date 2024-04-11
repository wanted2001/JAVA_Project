package day08;

public class Method05 {
		/* 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별(true/false);
		 * 
		 */
	public static boolean so(int num) {
		
		
		int cnt = 0 ;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;	
			}		
		}
			if(cnt==2) {
				return true;
			}
			else {
				return false;
			}
			 
	}

	public static void main(String[] args) {
		/* 
		 * 
		 */
		
		
		System.out.println(so(13));
		
		//2부터 100까지 소수를 출력하고 소수의 합계를 출력
		int sum=0;
		for(int i=2; i<=100; i++) {
			so(i);
			if(so(i)) { // 그냥 true 이다.
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("합계: "+sum);
	}

}
