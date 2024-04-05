package day19;

import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		// 제네릭 (Generics) : 데이터의 타입을 나중에 확정하는 기법
		// 클래스나 메서드를 선언할 떄 어떤 데이터가 들어올지 확신이 없다면,
		// 제네릭 타입으로 구현 => 나중에 객체를 생성 할떄 타입을 확정하여 구현

		// 객체의 타입을 컴파일할떄 체크할수 있어서 타입이 안정성을 해치지않는
		// 선에서 적당히 형변환이 가능한 기법
		// 안정성 - 의도하지 않은 타입이 객체가 저장되는 것을 막는다.

		// List<E> list = new ArrayList<E>();
		// HashMap<String, String> map = new HashMap<K,V>();

		/*
		 * Sale 클래스 생성 main 1.제품추가 |2.제품리스트보기 |3.제품주문 |4.주문내역보기 |5.종료
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		SaleManager sm = new SaleManager();

		int menu = -1;
		do {
			System.out.println("1.제품추가 |2.제품리스트보기 |3.제품주문 |4.주문내역보기 |5.종료");
			System.out.println("선택>");
			menu = sc.nextInt();
			switch (menu) {
			case 1: sm.add(sc);
				break;
			case 2: sm.menuPrint();
				break;
			case 3: sm.orderPick(sc);
				break;
			case 4: sm.orderPrint();
				break;
			case 5: break;
			default:
				System.out.println("잘못된 메뉴");
				break;
			}
		} while (menu != 5);

		System.out.println("종료");

		sc.close();

	}

}
