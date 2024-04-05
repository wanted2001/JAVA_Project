package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		/* break 문: 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문을 동반하여 조건에 맞을 때 반복문을 벗어나게 하는 역할
		 */
		
		/* 1~10 까지 출력
		 * 초기값, 증감식, 그대로 두고, 조건식을 생략하여 무한 루프를 생성
		 * break를 이용하여 빠져나오게 사용.
		 */

		
		for (int i = 0; ; i++) {
			System.out.println(i+ " ");
			if (i==10) {break;}
		}
		
		System.out.println();
		System.out.println("--------------------------");
		
		/*
		 * 한글자를 입력받아 글자를 출력(반복해서 출력_)
		 * y를 입력받으면 종료 
		 */
		
		Scanner scan = new Scanner(System.in);
		char ch = 0;
		
		while(ch != 'y') {
			System.out.println("입력 >");
			ch = scan.next().charAt(0);
			if(ch=='y') {
			System.out.printf("출력성공%n"+ ch +" ");break;}
			
		}
		
		for(;;) {//무한루프
			System.out.printf("%n한글자 입력>");
			char a = scan.next().charAt(0);
			System.out.println(a);
			if(a=='y') {
				System.out.println("종료!");
				break;
			}
		}
		
		
		scan.close();
	}

}
