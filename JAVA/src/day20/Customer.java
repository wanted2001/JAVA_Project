package day20;

public class Customer {
	
	private String name;
	private int age;
	private int tripmoney;
	
	public Customer() {}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTripmoney() {
		return tripmoney;
	}
	public void setTripmoney(int tripmoney) {
		this.tripmoney = tripmoney;
	}
	@Override
	public String toString() {
		return "이름:" + name + ",나이:" + age + ",비용:" + tripmoney;
	}
	
	
	
	
}
