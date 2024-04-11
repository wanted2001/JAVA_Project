package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	// 제네릭 클래스 처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>(); //메뉴추가용 arr
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>(); //주문용 arr
	
	public void add(Scanner sc) {
		System.out.println("제품입력>");
		String menuName = sc.next();
		System.out.println("가격입력>");
		Integer menuPrice = sc.nextInt();
		Sale<String, Integer> s = new Sale<>(menuName,menuPrice);
		this.menu.add(s);
		System.out.println("제품추가 완료~!!!!!!!");
	}

	public void menuPrint() {
		System.out.println("========상품목록=======");
		if(menu.isEmpty()) {
			System.out.println("상품목록이 없습니다.");
			return;
		}
		for(Sale<String, Integer> tmp : menu) {
			System.out.println(tmp);
			
		}
	}

	public void orderPick(Scanner sc) {
		//입력받은 값은 제품명, 수량
		//제품명 가격*수량 (지불금액)을 order 추가
		//햄버거 5 => 햄버거 25000
		System.out.println("제품선택>");
		String orderName = sc.next();
		System.out.println("수량입력>");
		int cnt = sc.nextInt();
		for(int i=0; i<menu.size(); i++) {
			int index = orderSearch(orderName);
			if(menu.get(i).getMenu().equals(orderName)) {
				if(index != -1) {
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price+(menu.get(i).getPrice()*cnt));
					return;
				}
				Sale p = new Sale(orderName,(menu.get(i).getPrice()*cnt));
				order.add(p);
			}
		}
	}

	public void orderPrint() {
		int sum =0;
		//주문내역 출력 
		System.out.println("=======주문내역=======");
		for(Sale<String, Integer> od : order) {
			System.out.println(od);
			sum+=(int)od.getPrice();
		}
		//총 지불금액 출력
		System.out.println("총 지불금액:"+sum+"원");
		
	}
	
	public int orderSearch(String name) {
		int index = -1;
		//name = 주문메뉴	
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
	}
}
