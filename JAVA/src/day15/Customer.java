package day15;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerGrade = "Silver";
	private int bonusPoint;
	private double bonusRatio=0.01;
	
	public Customer() {
		
	}
	
	public Customer(String customerName) { //회원을 검색 할때 사용
		this.customerName  = customerName;
	}
	
	public Customer(String customerName,String customerGrade) {
		this.customerName = customerName;
		this.customerGrade = customerGrade;
	}
	
	public void calcPrice(int price) { //가격을 받아서 할인율과 포인트를 누적
			double saleprice = 0;
		switch(getCustomerGrade()) {
		case "Silver" : bonusPoint = (int)(price*bonusRatio);
			break;
		case "Gold" : saleprice = price-(price*0.1);  bonusPoint += (int)(price*bonusRatio); 
			break;
		case "VIP" : saleprice = price-(price*0.1);  bonusPoint += (int)(price*bonusRatio);
			break;
		}
		if(getCustomerGrade().equals("Silver")) {
			System.out.println("총 금액: "+price+"원 결제할 금액:"+price+"원, 적립포인트: "+bonusPoint);
			return;
		}
		System.out.println("총 금액: "+price+"원 결제할 금액:"+(int)saleprice+"원, 적립포인트: "+bonusPoint);
		
	}
	
	public void customerInfo() {
		System.out.println(customerName+"님 등급은 "+customerGrade+"이며,보너스 포인트는 "
	+bonusPoint+"점 입니다.");
	}

	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
	
}

