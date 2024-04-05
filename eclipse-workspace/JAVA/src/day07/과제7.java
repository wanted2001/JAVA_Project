package day07;

import java.util.Scanner;

public class 과제7 {
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
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈|2.뺼셈|3.곱셉|4.나눗셈|5.나머지|6.종료
		 * 
		 * >>메뉴선택 1
		 * >>숫자1 5
		 * >>숫자2 20
		 * 결과 : 5 + 20 = 25;
		 * (더하기 메서드를 호출하여 연산결과를 출력)
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int num1 = 0;
		int num2 = 0;
		
		
		do {
			System.out.println("---menu---");
			System.out.println("1.덧셈|2.뺼셈|3.곱셉|4.나눗셈|5.나머지|6.종료");
			a = scan.nextInt();
			if(a<=5) { // 6보다 크면 이것을 띄우지 않음
				System.out.println("숫자1 입력>");
				num1 = scan.nextInt();
				System.out.println("숫자2 입력>");
				num2 = scan.nextInt();
				
			}
			switch(a) {
			case 1 : System.out.println(num1+ "+" + num2 + "="+ sum(num1, num2)); break;
			case 2 : System.out.println(num1+ "-" + num2 + "="+ sub(num1, num2)); break;
			case 3 : System.out.println(num1+ "*" + num2 + "="+ mul(num1, num2)); break;
			case 4 : System.out.println(num1+ "/" + num2 + "="+ div(num1, num2)); break;
			case 5 : System.out.println(num1+ "%" + num2 + "="+ mod(num1, num2)); break;
			case 6 : break;
			default : System.out.println("잘못 입력된 값입니다."); break;
			}
		}
		while(a!=6);{
			System.out.println("프로그램 종료");
		}
			
				scan.close();
				
	}

}
