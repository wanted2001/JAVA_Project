package day12;

public class Class04 {
	/*
	 * static static이 붙은 메서드/ 멤버변수 클래스 멥버변수/메서드 라고 한다. - 객체의 생성없이 클래스가 만들어지면 생성 -
	 * 객체없이 클래스만으로 사용이 가능함 - 클래스명.메서드/클래스.멤버변수 - 객체를 생성해서 호출도 가능하지만 그렇게 사용하지 않음 (
	 * 노란밑줄 :의미없음) - 클래스의 멤버변수/메서드는 하나의 멤버변수가 모든 객체에 공유(사용)
	 * 
	 * static이 안붙은 메서드/멤버변수는 객체(인스턴스)의 멤버변수/메서드 라고 한다. - 객체의 멤버변수/메서드는 객체를 통해서 사용되고
	 * 생성됨 (객체를 만들지 않으면 생성이 안됨) - 각 객체마다 독립적인 객체 => 각 개체마다 독립적인 멤버변수 메서드를 생성하게 된다.
	 * 
	 * - 클래스/객체는 생성시점이 달라서 메서드를 사용할수있는 환경이 다르다. - 객체의 멤버는 클래스가 생성되고난 후 객체를 생성할수 있음.
	 * - 클래스 멤버는 클래스의 멤버(변수/메서드) / 객체의 멤버(변수/메서드) 모두 사용가능. - 객체의 멤버(변수/메서드)는 객체에서만
	 * 가능 하다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현시점에서 BRAND는 이미 생성되어있다.(객체 없어도 가능 이유는 static 이기 떄문)
		System.out.println(Tv.BRAND);//private 접근권한이 없음
		// Tv.printBrand();//클래스명.메서드명() 호출

		Tv t = new Tv();
		t.printPower();// 객체 메서드 사용 객체명.메서드명() 호출
		t.printBrand();//객체를 통해 클래스 멤버에 접근할수있지만 그렇게 사용하지 않음
	}
}
	class Tv {
		private boolean power;
		public static final String BRAND = "LG";

		// power를 출력하는 메서드

		public void printPower() {
			if (power) {
				System.out.println("TV가 켜졌습니다.");
			} else {
				System.out.println("TV가 꺼졌습니다.");
			}
			// 객체 메서드에서 클래스변수를 사용할수있음
			// 클래스의 멤버는 어디서든 사용가능
			System.out.println("brand: " + BRAND);
		}

		public void printBrand() {
			System.out.println("BRAND: " + BRAND);
			// 클래스 메서드에서 객체변수를 사용
			System.out.println("power상태: " + power);// 불가능
		}
		
		{
			//원하는 멤버 변수의값을 초기화()[
			//color = "빨강색";
					
			
		}

	}

