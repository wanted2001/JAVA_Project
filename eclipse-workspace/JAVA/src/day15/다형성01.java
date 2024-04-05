package day15;

/* 객체 지향 프로그래밍에서는 4가지의 특징
 * - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임.
 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리.
 * - 추상화, 캡슐화(정보은닉), 상속, 다형성
 * 
 * - 추상화 Abstraction) - 핵심적인 코드만 보여주기
 * - 구현된 부분과 구현되지 않은 부분으로 분리한다.
 * - 불필요한 부분은 숨긴다.
 * 
 * - 캡술화 - 데이터 보호
 * - 멤버변수는 숨기고, 메서드로 접근
 * - 멤버변수와 메서드를 하나로 묶어서 처리
 * - 은닉화 : 객체의 내부의 정보는 숨겨 외부 드러나지 ㅇ낳게 하는 것 외부에서 데이터에 직접 접근하는 것을 방지
 * 
 * - 상속 - 코드 재사용(확장)
 * - 클래스를 상소받아 수정하여 사용하면 중복 코드를 줄일수 있음.
 * - 유지 보수가 편함.
 * 
 * - 다형성(Polymorphism) - 객체의 형변환이 용이함.
 * - 하나의 코드가 여러 자료(객체) 형으로 구현되어 실행되는 것.
 * - 다형성을 잘 활용하면 유연하고, 확장성이 있는, 유지보수가 편한 프로그램을 만들수 있음.
 * 
 */
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}

	public void readBook() {
		System.out.println("사람은 책을 읽을 수 있습니다.");
	}

}

class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이는 네 발로 어슬렁거립니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아다닙니다.");

	}

	public void flying() {
		System.out.println("독수리가 멋지게 비행합니다.");
	}

}

class Dog {
	public void move() {
		System.out.println("강아지가 아장아장 걷습니다.");
	}
}

public class 다형성01 {

	public static void main(String[] args) {

		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();

//		a.move();
//		h.move();
//		t.move();
//		e.move();

		// Human h1 = new Animal(); 자식의 객체로 조상을 생성하는것은 불가능

		// 조상 클래스로 자식 클래스 사용 가능
		// 조상의 클래스에서 상속 받은 것만 사용가능 move메서드가 조상에 있으니 사용가능
		Animal hAnimal = new Human();
		hAnimal.move();
		Animal tAnimal = new Tiger();
		tAnimal.move();
		Animal eAnimal = new Eagle();
		eAnimal.move();

		System.out.println();

		다형성01 ex1 = new 다형성01();
//		ex1.movaAnimal1(h);
//		ex1.moveAnimal2(t);
//		ex1.moveAnimal3(e);
		ex1.moveAnimal(hAnimal);
		ex1.moveAnimal(tAnimal);
		ex1.moveAnimal(eAnimal);
		// 객체의 형변환이 이루어져 출력가능
		ex1.moveAnimal(t);
		ex1.moveAnimal(e);
		ex1.moveAnimal(h);

		System.out.println();

		Dog d = new Dog();
		d.move();
		// ex1.moveAnimal(d); animal의 상속을 받지 않으면 쓸수 없다 불가능.
		System.out.println();
		System.out.println("-----Animal 배열 생성해서---------");

		Animal[] aniList = new Animal[5];
		int cnt = 0;
		aniList[cnt] = hAnimal;
		cnt++;
		aniList[cnt] = tAnimal;
		cnt++;
		aniList[cnt] = eAnimal;
		cnt++;

		for (int i = 0; i < cnt; i++) {
			aniList[i].move();
		}

		System.out.println();
		System.out.println("---------다운 캐스팅-------------");

		// hanimal는 Animal 객체로 Human 생성자를 만든것이기 떄문에 안되니 명시적 표현으로 형변환을 해준다.
		Human human = (Human) hAnimal;
		//Human human = (Human) tAnimal; 클래스가 맞지 않아 에러가 난다.
		human.readBook();

		// 같은 조상이라 프로그래밍은 에러가 없지만 실행시키면 casting에러가 난다.
		//Human human1 = (Human) tAnimal;
		//human1.readBook();
		
		//instanceof : 객체가 해당 클래스의 형에 맞는 체크하는 연산자. boolean 리턴
		System.out.println(tAnimal instanceof Human);
		System.out.println(tAnimal instanceof Tiger);
		System.out.println(tAnimal instanceof Eagle);
		
		Animal downCastingTest = eAnimal;
		if(downCastingTest instanceof Human) {
			Human testHuman = (Human)downCastingTest;
			testHuman.readBook();
		}else if(downCastingTest instanceof Tiger) {
			Tiger testTiger =(Tiger)downCastingTest;
			testTiger.hunting();
		}else if(downCastingTest instanceof Eagle) {
			Eagle testEagle = (Eagle)downCastingTest;
			testEagle.flying();
					
		}
	}

	// 각 객체의 무브를 실행해주는 메서드
//	public void movaAnimal1(Human human) {
//		human.move();
//	}
//	
//	public void moveAnimal2(Tiger tiger) {
//		tiger.move();
//	}
//	
//	public void moveAnimal3(Eagle eagle) {
//		eagle.move();
//	}

	// 다형성의 예시 (업캐스팅 : 자동 형변환 가능) Animal 상속을 받고 있으면 객체가 가능
	public void moveAnimal(Animal animal) {

		animal.move();

	}
}
