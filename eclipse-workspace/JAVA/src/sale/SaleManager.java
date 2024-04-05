package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	private ArrayList<Sale> menu = new ArrayList<Sale>();
	private ArrayList<Order> order = new ArrayList<Order>();

	public int equalsName(String name) {
		int index = -1;
		for (int i = 0; i < menu.size(); i++) {
			if (menu.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public void addMenu(Scanner sc) {
		System.out.println("제품입력>");
		String menuName = sc.next();
		int index = equalsName(menuName);
		if (index != -1) {
			System.out.println("해당메뉴가 존재합니다.");
			return;
		}
		System.out.println("가격입력>");
		Integer menuPrice = sc.nextInt();
		Sale s = new Sale(menuName, menuPrice);
		this.menu.add(s);
		System.out.println("제품추가완료");
	}

	public void delMenu(Scanner sc) {
		System.out.println("삭제할 메뉴 입력");
		String delName = sc.next();
		int index = equalsName(delName);
		if (index == -1) {
			System.out.println("해당메뉴가 존재하지않습니다.");
			return;
		}
		menu.remove(index);
		System.out.println("삭제완료");
	}


	public void modMenu(Scanner sc) {
		System.out.println("수정할 메뉴 입력>");
		String modName = sc.next();
		int index = equalsName(modName);
		if (index == -1) {
			System.out.println("해당메뉴가 존재하지않습니다.");
			return;
		}
		System.out.println("수정할 가격입력>");
		int modprice = sc.nextInt();
		menu.get(index).setPrice(modprice);
		System.out.println("수정완료");

	}

	public void printMenu() {
		System.out.println("=====전체메뉴=======");
		for(Sale m : menu) {
			System.out.println(m);
		}
		System.out.println("----------------");

	}

	public void orderPick(Scanner sc) {
		System.out.println("주문할상품 입력>");
		String orderName = sc.next();
		int index = equalsName(orderName);
		if (index == -1) {
			System.out.println("해당메뉴가 존재하지않습니다.");
			return;
		}
		System.out.println("구입할 상품 수량 입력>");
		int cnt = sc.nextInt();
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(orderName)) {
				int count = order.get(i).getCnt();
				int price = order.get(i).getTotal();
				order.get(i).setTotal(price+(menu.get(index).getPrice()*cnt));
				order.get(i).setCnt(cnt+count);
				return;
			}
		}
		int total = menu.get(index).getPrice()*cnt;
		Order o = new Order(orderName,cnt,total);
		order.add(o);
	}

	public void printOrder() {
		int sum = 0;
		System.out.println("{========주문내역======}");
		for(Order tmp : order) {
			System.out.println(tmp);
				sum += tmp.getTotal();
		}
		System.out.println("Total: "+sum);
		System.out.println("----------------------");
	}

}
