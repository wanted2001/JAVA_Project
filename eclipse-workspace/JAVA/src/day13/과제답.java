package day13;

import java.util.Scanner;

public class 과제답 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product1[] menu = new Product1[10];
		
		//상품을 등록하시겠습니까. y/n 
		//n를 누르면 등록한 상품 출력
		int cnt = 0;
		while(true) {
		System.out.println("상품을 등록하시겠습니까? (Y/N)");
		char an = scan.next().charAt(0);
		if(an=='y') {
		System.out.println("상품명>");
		String s = scan.next();
		System.out.println("가격>");
		int r = scan.nextInt();
		Product1 p1 = new Product1(s,r);
		menu[cnt]=p1;
		cnt++;
		}
		if(an=='n') {
			for(int i =0; i<cnt; i++) {
				System.out.println(menu[i]);
			}
			break;
		}//if문 괄호
		
		
		}//while 괄호
		scan.close();

	}//메인 괄호
}//클래스 괄호

class Product1{
	private String name;
	private int price;
	
	
	public Product1() {}
	public Product1(String name, int price) {
		this.name = name;
		this.price= price;
	}
	
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ":" + price;
	}
	
	}
