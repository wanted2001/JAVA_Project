package day08;

public class Method04 {
		/* 두정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드
		 * 
		 */
	public static int max(int num1,int num2) {
		int sum=0;
		for(int i=num1;; i--) {
			if(num1%i==0 && num2%i==0) { 
				sum=i;
				break;
			}
		}
		return sum;
	}
	
		/* 두정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
		 * 
		 */
	public static int min(int num1,int num2) {
		for(int i = num1; ; i+=num1) {
			if(i%num1 == 0 && i% num2 ==0) {
				return i;// 메서드에서 바로 리턴받아서 사용
			}
		}
		
	}
	//최소공배수 규칙 : 두 수를 곱한후 최대공약수로 나누면 최소공배수
	//10 15 150/5=30
	//메서드 안에서 메서드를 호출하고 리턴값을 사용
	public static int lcm2(int num1,int num2) {
		return num1*num2/max(num1,num2); //최대 공약수
	}

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수를 리턴 하는 
		 * 
		 */
		int a = max(6,12);
		int b = min(10,15);
		int c = lcm2(10,15);
		System.out.println("최대 공약수: "+a);
		System.out.println("최소 공배수: "+b);
		System.out.println("최소 공배수2: "+c);
		
		
	}

}
