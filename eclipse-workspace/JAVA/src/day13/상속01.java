package day13;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속: 부모의 것을 자식에게 물려주는것
		 * 상속: 멤버변수와 멤버메서드만 
		 * 클래스의 확장 개념 
		 * 상속을 사용하는 이유: 재사용을 해서 중복코드를 줄이고, 유지보수를 쉽게하기 위해서
		 * class A(부모),class B(자식)
		 * 
		 * class b extends a {
		 * 
		 * }
		 * 
		 * 상속 키워드 extends
		 * - 상속을 받으면 부모의 멤버변수와 메서드를 사용할수있다.
		 * - private이면 자식클래스에서 접근 불가능
		 * - protected를 사용해서 상속받는 자식에게 허용한다.
		 */
		A a = new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum(100);
		a.print();
		System.out.println("-------------------------");
		B b = new B();
		b.setA(100);
		b.setB(200);
		b.setC(300);
		b.num=1000; //접근 제어자가 protected 이기 때문에 직접접근이 가능
		b.print();
		b.setD(10);
		b.setE(20);
		b.setF(30);
		b.print();
	}

}

class A{ //부모클래스
	private int a,b,c;
	protected int num;
	
	public void print() {
		System.out.println("a "+a+"b "+b+"c "+c);
		System.out.println("num "+num);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}

class B extends A{ //자식클래스
	private int d,e,f;

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	//오버라이드 : 부모의 메서드를 재정의하여 사용하는 것.
	//super : 부모의 값을 가져올때 사용하는 키워드 
	@Override
	public void print() {
		//a b c num 이 부모클래스인 A한테 있으니까 재정의 할 필요없음
		super.print(); //부모의 print()를 호출하여 출력
		System.out.println("d "+d+"e "+e+"f "+f);
	}
	
	
}