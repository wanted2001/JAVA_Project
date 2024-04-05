package day13;

class Animal{
	private String name; //이름	
	private String category; //종
	
	public Animal() {
		
	}
	
	public Animal(String name, String category) {
		this.name= name;
		this.category = category;
	}
	
	public void printInfo() {
		System.out.println("이름 :"+name);
		System.out.println("종류 :"+category);
	}
	
	public void howl() {
		System.out.println("--"+name+"의 울음소리--");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

//Dog Cat Animal를 상속받아서 사용
//printInfo()
//howl() 오버라이딩 후 출력
class Dog extends Animal {

	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
	
	
}

class Cat extends Animal{
	
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
	}
	
	
}

class Tiger extends Animal{
	public Tiger(String name,String category) {
		//Tiger 생성자 호출
		super(name,category);
	}
	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥");
	}
}

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모 클래스에게서 물려받은 메서드를 재정의하는것
		 * - 부모 클래스의 메서드와 선언부가 일치 해야한다.
		 * - 접근제한자도 더 넓은 범위는 가능하지만 축소는 안됨.
		 * 
		 */
		Dog d = new Dog();
		d.printInfo();
		d.howl();
		System.out.println("-------------------------------");
		Cat c = new Cat("고양이","고양이과");
		c.printInfo();
		c.howl();
		System.out.println("-------------------------------");
		Tiger t = new Tiger("호랑이","고양이과");
		t.printInfo();
		t.howl();

	}
}


