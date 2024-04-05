package day04;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/* 메뉴구성
		 * do~while() 문은 
		 *
		 */
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.저장하기 | 2.새로만들기 | 3. 종료하기");
			System.out.println(">> menu >");
			menu = scan.nextInt();
			
			//실제 기능을 구현하는 처리문
			switch(menu) {
			case 1 : System.out.println("저장되었습니다.");
				break;
			case 2 : System.out.println("새로 만들었습니다.");
				break;
			case 3 : System.out.println("종료 하였습니다.");
				break;
			default : System.out.println("잘못 입력하셨습니다."); 
			break;
			}
		}while(menu!=3);
		
		
		
		
		scan.close();

	}

}