package sale;

public class Order extends Sale{
	
	private int cnt; // 수량
	private int total; // 합계
	public Order() {
	}
	
	public Order(String name ,int cnt,int total) {
		super.setMenu(name);
		this.cnt = cnt;
		this.total = total;
	}

	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "|상품명:" + getMenu()+" 개수:"+ getCnt();
	}

	

	
	
	

}
