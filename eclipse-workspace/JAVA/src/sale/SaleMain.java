package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/*
		 * 메뉴 구성 |1.메뉴추가 |2.메뉴삭제 |3.메뉴수정(가격수정) |4.메뉴보기 |5.주문 |6.주문내역 |7.종료
		 */

		Scanner sc = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		int menu = -1;

		do {
			System.out.println("=======menu=======");
			System.out.println("|1.메뉴추가 |2.메뉴삭제 |3.메뉴수정(가격수정)");
			System.out.println("|4.메뉴보기 |5.주문 |6.주문내역 |7.종료");
			System.out.print("선택>");
			menu = sc.nextInt();

			switch (menu) {
			case 1: sm.addMenu(sc);
				break;
			case 2: sm.delMenu(sc);
				break;
			case 3: sm.modMenu(sc);
				break;
			case 4: sm.printMenu();
				break;
			case 5: sm.orderPick(sc);
				break;
			case 6: sm.printOrder();
				break;
			case 7:
				break;
			default: System.out.println("잘못된 메뉴입니다.");
				break;
			}

		} while (menu != 7);

		sc.close();

	}

}
