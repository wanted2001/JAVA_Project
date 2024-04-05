package sale;


public class Sale{
	
	// 멤버변수 menu ,price
	private String menu;
	private int price;
	
	public Sale() {}
	public Sale(String menu , int price) {
		this.menu = menu;
		this.price = price;
	}
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[품명:" + menu +"/"+ price+"원]";
	}
	
}

