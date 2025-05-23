package std;

import java.util.Scanner;

//2번
public class StdMain {

	public static void main(String[] args) {

		// 메뉴
		StdManager sm = new StdManager();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("======MENU======");
			System.out.println("1.학생추가 |2.학생목록 |3.학생검색 |4.학생수정 |5.학생삭제");
			System.out.println("6.점수추가 |7.점수수정 |8.점수삭제 |9.종료");
			System.out.print("입력>");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				sm.addStd(sc);
				break;
			case 2:
				sm.printStd();
				break;
			case 3:
				sm.searchStd(sc);
				break;
			case 4:
				sm.modStd(sc);
				break;
			case 5:
				sm.delStd(sc);
				break;
			case 6:
				sm.addSub(sc);
				break;
			case 7:
				sm.modSub(sc);
				break;
			case 8:
				sm.delSub(sc);
				break;
			case 9:
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		} while (menu != 9);
		
		System.out.println("종료!!!~~");
		sc.close();
	}
}
