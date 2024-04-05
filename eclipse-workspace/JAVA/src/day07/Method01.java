package day07;

public class Method01 {
	
	
		//메서드 선언 위치가 된다.
		
	public static void main(String[] args) {
		/*
		 * Method(메서드) : 기능(함수) ,function 메서드 선언 및 구현 
		 * 접근제한자(제어자) 리턴타입 메서드명(매개변수){ 구현; } 매개변수는 없으면 비워도 된다.
		 * 
		 * 
		 * -접근제한자(제어자) : 접근 할수있는 주제의 제한범위 
		 * -리턴타입 : 반환값의 타입(메서드 실행 한후 결과로 알려주는 값의자료형) 
		 * -메서드명 : 메서드의 이름(소문자로 시작하는것이 원칙)
		 * -매개변수 : 기능을 수행하기 위해 필요로 하는 값(외부에서 들어와야 하는 값)
		 * -void : 리턴 할 것이 없다는 것을 의미
		 * 
		 * -메서드의 위치 
		 * -클래스 안에 있지만, 다른 메서드 밖에 있어야한다.
		 * -메서드의 선언 순서는 아무 상관 없음.
		 * -메서드는 순서대로 실행되지않음
		 * -호출이 되어야 실행이 가능.
		 */
		int hap = sum(10,20);
		System.out.println(hap);
		sum1(1, 2);
		
		int cha = minus(5,10);
		System.out.printf("두수의 차는 %d입니다.",cha);
		
		int num1 = 0;
		int num2 = 0;
		

	}
	
		//메서드 선언 가능위치
		//두정수가 주어지면 두 정수의 합을 알려주는 메서드
		//리턴타입 : 합 => int 
		//메서드명 : sum
		//매개변수 : 두 정수 (정수 2개 ) => int num1 , int num2
		public static int sum(int num1, int num2) { //리턴을 받는 이유는 변수를 저장해서 다른곳에 쓰기 위해서 이다. ***
			return num1 + num2;
		}
		
		//두 정수가 주어지면 두정수의 합을 출력 하는 메서드
		//리턴타입 : void => 없음. (출력)
		//매개변수 : 두정수 (int num1, int num2)
		public static void sum1(int num1, int num2) { 
			System.out.println(num1+num2);
			
		}
		
		//두 정수가 주어지면 두 정수의 차를 알려주는(리턴하는) 메서드
		public static int minus(int num1 , int num2) {
			//num1 과 num2 중 큰수에서 작은 수를 뻇으면 좋겠다.
			if(num2>num1) {
				return num2-num1;
			}
				return num1-num2;
		}
		
	
}
