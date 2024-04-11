package day02;

import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + = 2 + 3 = 5
		 * ex) 5 1 - = 5 - 1 = 4
		 * 연산자는 + - * / % 가능
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요 >");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char ch = scan.next().charAt(0);
		
		
		// / ,%일 경우 num2가 0이 되면 안내문구 띄우기
		//if((ch =='/' ||  ch=='%') && num2==0) { System.out.println("0이 될수 없습니다.");
		
		if(ch =='+') { 
			System.out.println(num1 + "+" + num2 +"=" + (num1+num2)); }
		else if(ch =='-') { 
			System.out.println(num1 + "-" + num2 +"=" + (num1-num2)); }
		else if(ch =='*') { 
			System.out.println(num1 + "*" + num2 +"=" + (num1*num2)); }
		else if((ch =='/' ||  ch=='%') && num2==0) { System.out.println("0이 될수 없습니다.");}
			else if(ch =='/') {
				System.out.println(num1 + "/" + num2 +"=" + (num1/(double)num2)); }
			else if(ch =='%') { 
				System.out.println(num1 + "%" + num2 +"=" + (num1%num2)); }
			else {
				System.out.println("잘못된 연산자 입니다.");}
		
		
		
		switch(ch) {
		case'+': System.out.println((num1+num2)); break;
		case'-': System.out.println((num1-num2)); break;
		case'*': System.out.println((num1*num2)); break;
		case'/': 
			if(num2==0) {System.out.println("0이 될수 없습니다.");}
				System.out.println((num1/num2)); break;
		
		case'%':
			if(num2==0) {System.out.println("0이 될수 없습니다.");} 
				System.out.println((num1%num2)); break;
		default: System.out.println("잘못된 연산자 입니다."); break;
				
		}
		
		scan.close();
		
	}

}
