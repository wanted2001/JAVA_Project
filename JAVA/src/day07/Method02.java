package day07;

public class Method02 {
	//메서드 선언 위치
	//두정수의 합을 알려주는 메서드 sum
	//두정수의 차를 알려주는 메서드 sub
	//두정수의 곱을 알려주는 메서드 mul
	//두정수의 몫을 알려주는 메서드 div
	//두정수의 나머지를 알려주는 메서드 mod
	
	public static int sum(int num1 ,int num2) {
		return num1+num2;
	}
	public static int sub(int num1 ,int num2) {
		return num1-num2;
	}
	public static int mul(int num1 ,int num2) {
		return num1*num2;
	}
	public static double div(int num1 ,int num2) {
		return num1/(double)num2;
	}
	public static int mod(int num1 ,int num2) {
		return num1%num2;
	}
	public static void main(String[] args) {
		// + - */ % 
		//main에서 호출하여 확인
		 
		
		
		System.out.println(sum(10, 20));
		System.out.println(sub(10, 20));
		System.out.println(mul(10, 20));
		System.out.println(div(10, 20));
		System.out.println(mod(10, 20));
		
		

	}
}
