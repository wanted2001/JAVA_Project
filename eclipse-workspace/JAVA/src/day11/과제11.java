package day11;

public class 과제11 {

	public static void main(String[] args) {
		/* 메서드를 이용해서 작업.
		 * 두 정수의 값이 주어졌을떄 두 정수사이의 모든 정수의 합을 리턴하는 메서드
		 * ex)a,b a=3 ,b=5 라면 3+4+5를 리턴
		 * ex)c,d c=5 ,d=1 라면 5+4+3+2+1을 리턴
		 * ex)e,f e=1 ,f=1 라면 1를 리턴 
		 * 
		 * 
		 */
		
		과제11 h = new 과제11();
		System.out.println(h.sum(1,5));
		System.out.println(h.sum2(1, 5));
				
	}
	
	//들어가는 값(매개변수) : int a,b
	//나오는 값 (리턴타입) : int hap
	
	public int sum(int num1, int num2) {
		int hap = 0;
		for(int i=num1; i<=num2; i++) {
				hap+=i;
		}
		if(num1>num2) {
			for(int i=num1; i>=num2; i--) {
				hap+=i;
			}
		}
		return hap;
	}
	
	public int sum2(int num1,int num2) {
		int sum =0;
		int max= Math.max(num1, num2);
		int min= Math.min(num1, num2);
		
		for(int i=min; i<=max; i++){
			sum+=i;		
		}
		return sum;
	}
}
