package day19;

public class Sale<K,V> {
	
	// 멤버변수 menu ,price
	private K menu;
	private V price;
	
	public Sale() {}
	public Sale(K menu , V price) {
		this.menu = menu;
		this.price = price;
	}
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[품명:" + menu +"/"+ price+"원]";
	}
	
}
