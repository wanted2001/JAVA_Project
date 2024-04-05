package day17;

interface Power {
	void turnOn();
	void turnOff();
}

//class TV implements Power{
//
//	@Override
//	public void turnOn() {
//		System.out.println("TV 전원을 킵니다.");
//		
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("TV 전원을 끕니다.");
//		
//	}
//	
//}

public class 익명클래스 {

	public static void main(String[] args) {
		/* 익명클래스 : 이름이 없는 클래스
		 * 인터페이스를 이용하여 객체를 만들 떄 클래스 구현없이 바로 (매개변수로)구현 
		 * 익명클래스를 사용하는 이유
		 * - 인터페이스 기능이 적고, 해당 객체가 하나만 필요한 경우
		 * 메서드의 매개변수로 주로 사용
		 */
		
		익명클래스 ex = new 익명클래스();
//		TV t = new TV();
//		ex.Product(t);
		
		//익명클래스로 작업하는 경우,
		ex.Product(new Power() {

			public void turnOn() {
				System.out.println("전원을 켭니다.");
			}

			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}
			
		});{
			
		}
		

	}
	
	public void Product(Power p) {
		p.turnOn();
		System.out.println("정상 작동중....");
		p.turnOff();
	}

}
