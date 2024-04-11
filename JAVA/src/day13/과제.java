package day13;

import java.util.Arrays;
import java.util.Scanner;

public class 과제 {

	/* Product 클래스 생성 : 상품을 등록하는 클래스
	 * 상품명과 가격을 멤버변수로 
	 * 추가하는 메서드
	 * 추가한 상품을 출력하는 메서드 
	 */
	public static void main(String[] args) {
		//상품을 10개 등록 배열 생성
		//스캐너를 이용하여 상품 등록받기
		//등록한 상품 출력
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		System.out.println("상품을 등록하시겠습니까? (Y/N)");
		char answer = sc.next().charAt(0);
		while(answer=='y') {
		for(int i = 0; i<p.getName().length; i++) {
			if(answer=='n') {
				p.printInfo();
				System.out.println(p);
			}
			System.out.println("상품 입력>");
			String z=sc.next();
			System.out.println("가격 입력>");
			String r=sc.next();
			p.insert(z,r);
		}
		
		
		sc.close();
		
	}
}
	

}

class Product{
	private String name[]=new String[10];
	private String price[] =new String[10];
	private int cnt =0;
	
	
	@Override
	public String toString() {
		return "상품명: " + Arrays.toString(getName()) + 
				"가격: " + Arrays.toString(getPrice());
	}

	public void printInfo() {
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<price.length; j++) {
				System.out.println("상품명:"+name[i]+"("+price[j]+")");	
			}
		}
	}
	
	public void insert(String name, String price) {
		
		if(cnt>=10) {
			System.out.println("더이상 등록할수없습니다.");
		}
		this.name[cnt]=name;
		this.price[cnt]=price;
		cnt++;
	}
	
	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getPrice() {
		return price;
	}

	public void setPrice(String[] price) {
		this.price = price;
	}

	
	
}
