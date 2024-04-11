package new02;

class Counter{
// 싱글톤으로 객체 만들기
	private int count;
	private static Counter instance;
	
	private Counter() {}
	
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
// countMethod() 생성
// 호출시 count 1씩 증가 리턴
	public int countMethod() {
		count++;
		return count;
	}
	
}
public class SingletonCount {
	

	public static void main(String[] args) {
		// Count 객체 2개 생성 각각 countMethod()를 호출하여 출력
		Counter c1 = Counter.getInstance();
		Counter c2 = Counter.getInstance();
		
		System.out.println(c1.countMethod());
		System.out.println(c1.countMethod());
		System.out.println(c1.countMethod());
		System.out.println(c1.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c2.countMethod());
		System.out.println(c2.countMethod());

	}

}
