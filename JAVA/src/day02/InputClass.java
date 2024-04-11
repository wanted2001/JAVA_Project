package day02;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		/* 콘솔 입력 : 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		/*
		 * System.out.println("숫자(정수)를 입력해주세요.");
		int num = scan.nextInt();// int형으로 리턴해서 값을 준다.
		System.out.println("내가 입력한 수: " +num);
		
		if(num%2==0 ) {System.out.println("짝수");}
		else {System.out.println("홀수");}
		
		System.out.println("------------------------");
		System.out.println("실수 입력 >");
		double num2 = scan.nextDouble();
				System.out.println("내가 입력한 실수:" +num2);
				
		System.out.println("------------------------");
		System.out.println("한글자 입력 >");
		//문자열 입력 : next() / charAt(index) : 문자열중 index 번지의 한글자를 추출
		//index번지는 0부터 시작
		char ch = scan.next().charAt(2);
		System.out.println("내가 입력한 글자:" +ch);*/
		
		System.out.println("-----------------------");
		System.out.println("한단어 입력 >");
		String s = scan.next();//공백을 포함하지않는 단어
		System.out.println("내가 입력한 단어 :"+s);
				
		//여러 단어 출력 : nextLine() : 공백포함
		System.out.println("------------------------");
		scan.nextLine();//위에서 입력한 enter 처리용 (공백을 먹어준다)
		System.out.println("여러단어 >");
		String str = scan.nextLine();//공백을 포함하는 단어
		System.out.println("내가 입력한 단어:" +str);
		scan.close(); //입력을 받는것을 닫는 명령어
	}
}
