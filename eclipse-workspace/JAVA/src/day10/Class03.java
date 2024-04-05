package day10;

public class Class03 {

	public static void main(String[] args) {
		Car1 c1 =new Car1();
		c1.setName("프라이드");
		c1.setColor("빨강색");
		c1.setYear("2000");
		c1.setDoor(4);
		c1.print();
		c1.power();
	}

}
//같은 패키지 안에서 같은이름의 패키지는 쓸수없다.
class Car1{
	//멤버변수 : name,year,color,door(문짝개수),power,speed
	private String name;
	private String year;
	private String color;
	private boolean power;
	private int door;
	private int speed;
	
	//내 차량의 정보를 출력하는 메서드 (name,year,color,door)
	public void print() {
		System.out.println("Mycar:"+name+"/"+color+"("+year+")"+"/도어:"+door+"개");
	}
	//power()
	//시동이 커졌습니다/시동이 꺼져습니다./속도가 0이여야 power를 끌수 있다. 
	public void power() {
		if(speed==0) {
		this.power=!power;
		System.out.println("Power:"+(isPower()?"ON" : "OFF"));
		}else {
			System.out.println("속도가 0이 아닙니다. 속도를 줄여주세요");
		}
	}
		
		
	//기본조건 파워가 켜있어야 가능 / 시동이 꺼져있습니다 시동을 켜주세요.
	//speedup
	//속도가 300이상 이면 (최고속도입니다.)
	//현재속도 얼마인지 출력
	public void speedup() {
		while(!power) {
			System.out.println("시동을 걸어주세요"); break;
		}
		if(power) {
		if(speed>=300) {
			speed=300;
			System.out.println("최고속도 입니다.");
		}
		else{
			speed+=10;
			System.out.println("현재 스피드는"+speed+"입니다.");
			}
		}
	}
	
	//speeddown
	//속도가 0이 되면 더이상 내려가지않음.(멈췄습니다.)
	//현재속도 얼마인지 출력
	public void speeddown() {
		if(power) {
		if(speed<=0) {
			speed=0;
			System.out.println("멈췄습니다.");
		}else {
			speed-=10;
			System.out.println("현재 스피드는"+speed+"입니다.");
			}
		}
	}
	//getter/setter
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
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}