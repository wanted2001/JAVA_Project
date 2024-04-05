package day16;

public class Exception02 {

	public static void main(String[] args) {
		try {
			// 예외가 발생할수 있는 구문 작성
			System.out.println(plus(4, 0, '+'));
			System.out.println(plus(4, 0, '-'));
			System.out.println(plus(4, 0, '*'));
			//System.out.println(plus(4, 1, '$'));
			System.out.println(plus(4, 0, '/'));
			System.out.println(plus(4, 0, '%'));
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		 * 하단에서 만든 메서드를 실행 예외처리
		 */
	}
	// 예외 발생시키기 : throw new 로 발생시킬수 있음.
	// throw : 예외 떠넘기기
	//예외를 발생시키게 되면 매서드 선언부 끝 부분에 throws를 적고, 발생할수있는 예외를 반드시 적어줘야함.
	//throws는 

	// 기능 : 두 수를 입력받고 연산자를 입력받아 사칙연산을 결과를 리턴하는 메서드
	// int num1 , int num2 char op;
	public static double plus(int num1, int num2, char op) throws RuntimeException{
		double res = 0;
	//연산자가 / % num2가 0이면 예외 발생시키기
		if((op=='/'||op=='%')&&num2==0) {
			//예외 미리 발생 시키기
			throw new RuntimeException("두번째 연산자는 0이 될수없습니다.");
		}
		
		
		switch (op) {

		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			throw new RuntimeException(op + "는 산술연산자가 아닙니다."); // exception의 문구를 정하는 것이다.
		}
		return res;
	}
}
