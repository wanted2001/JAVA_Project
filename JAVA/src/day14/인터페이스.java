package day14;

public class 인터페이스 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것
		 * 추상메서드 : 메서드의 선언부만 있고 구현이 없는 것
		 * 추상클래스 / 인터페이스 => 반드시 구현을 해야 객체를 생성 할 수 있음.
		 * 
		 * 인터페이스 키워드 : interface 
		 * - 기능요약서 : 메뉴얼화
		 * - 자체적으로 사용할수없고 , 인터페이스를 구현한 클래스가 있어야함
		 * - 구현 키워드 : implements
		 * - 인터페이스는 멤버변수가 없음. 이 부분을 염두해 두고 메서드 정리가 필요
		 * 
		 * - 상속 : 다중상속 불가능 
		 * - 구현 : 다중구현 가능
		 * - 상속 + 구현은 동시에 가능
		 * 
		 */
		Tv t = new Tv();
		t.turnOn();
		t.chUp();
		t.chUp();
		t.chUp();
		t.turnOff();
		t.turnOn();
		t.volUp();
		t.volUp();
		t.volUp();

	}

}


interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon{
	void volUp();
	void volDown();
}

//class Tv extends A implements B {} // 보통 잘 쓰지는 않음 //상속과 구현을 이용한 케이스
//인터페이스 구현
class Tv implements Power,Remocon{ //인터페이스를 구현한 클래스 //다중 구현 
	private boolean power;
	private int ch;
	private int vol;

	@Override
	public void turnOn() { //켜기
		power = true;
		System.out.println("전원이 켜짐");
		
	}

	@Override
	public void turnOff() { //끄기
		power = false;
		System.out.println("전원이 꺼짐");
		
	}
	
	public void chUp() {
		if(power) {
			ch++;
			System.out.println("ch: "+ch);
		}
	}
	
	public void chDown() {
		if(power) {
			ch--;
			System.out.println("ch: "+ch);
		}
	}

	@Override
	public void volUp() {
		if(power) {
			vol++;
			System.out.println("vol: "+vol);
		}
		
	}

	@Override
	public void volDown() {
		if(power) {
			vol--;
			System.out.println("vol: "+vol);
		}
	}

}
