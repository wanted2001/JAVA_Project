package day15;

public class GoldCustomer extends Customer{
	
	public GoldCustomer() {
		super.setCustomerGrade("Gold");
		
		
	}
	
	public GoldCustomer(String name) {
		super.setCustomerName(name);
		super.setCustomerGrade("Gold");
		super.setBonusRatio(0.02);
	}
	
	@Override
	public void calcPrice(int price) {
		super.calcPrice(price);
	}


	@Override
	public void customerInfo() {
		super.customerInfo();
		
	}
	
	
	
	
}
