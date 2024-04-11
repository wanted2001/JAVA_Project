package day10;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car2 클래스를 통해 mycar객체를 생성 new 키워드를 통해 생성 Car2() 생성자에 의해 초기화된다.
		Car2 mycar = new Car2(); 
		mycar.setName("카니발");
		mycar.setYear("2022");
		mycar.setDoor(4);
		mycar.setColor("흰색");
		mycar.printinfo();
		mycar.power();
		mycar.speedup();
		mycar.speedup();
		mycar.speedup();
		mycar.speedup();
		mycar.speedup();
		mycar.speedup();
		mycar.speedup();
		mycar.power();
		Car2 c2 = new Car2("소나타","2021");
		c2.printinfo();
		
		Car2 c3= new Car2("산타페", "2024", "흰색", 4);
		c3.printinfo();
	}

}
class Car2{
	private String name;
	private String year;
	private String color;
	private int door;
	private boolean power;
	private int speed;
	
	//생성자 위치
	public Car2() {
	//기본 생성자
	}
	//생성자는 여러개를 만들수있고 이것을 생성자 오버로딩이라고 한다.
	//오버로딩의 조건: 매개변수의 개수가 달라야함.타입이 달라야함
	public Car2(String name, String year, String color,int door) { 
		this(name,year); //내 생성자중에 두개만 받는 게 있으면 가져와 이것이 생성자 호출이다.
		this.color=color;
		this.door = door;
		
	}
	public Car2(String name, String year) {
		this.name = name;
		this.year = year;
		
	}
	
	public void printinfo(){
		System.out.println(name+"("+year+")");
		System.out.println("("+door+")");
	}
	
	public void power() {
		this.power = !power;
		if(this.power && speed<=0) {
			System.out.println("시동이 커졌습니다.");
		}
		else if(this.power && speed>0) {
			System.out.println("주행중입니다.");
		}else if(!power && speed>0) {
			System.out.println("주행중에 시동을 끌수 없습니다.");
		}else {
			System.out.println("시동을 끕니다.");
			this.power = false;
		}
		
	}
	
	
	public void speedup(){
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		}else {
			speed+=10;
		if(speed>=300) {
			speed=300;
			System.out.println("최고속도입니다.");
		}else {
			System.out.println("현재속도:"+speed);
			}
		}
		
	}
	
	public void speeddown() {
		if(power) {
			if(speed<=0) {
				System.out.println("멈춰있습니다.");
				speed=0;
			}else {
				System.out.println("현재속도:"+speed);
				speed-=10;
			}
		}else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
