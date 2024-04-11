package day15;

public class VIPCustomer extends Customer{
	private int agentID;
	
	public VIPCustomer() {
		super.setCustomerGrade("VIP");
		
	}
	
	public VIPCustomer(String name,int agentID) {
		super.setCustomerName(name);
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);
	}
	@Override
	public void calcPrice(int price) {
		super.calcPrice(price);
	}

	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("전담 상담사 번호는["+agentID+"]입니다.");
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

}
