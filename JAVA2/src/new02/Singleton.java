package new02;

public class Singleton {

	/* 싱글턴 패턴 : 다지안 패턴중 하나
	 * 단 1개만 존재해야하는 객체를 생성하여 -< 공유하고자 할떄 사용
	 * 
	 */
	
	// 단 1개만 존재하는 객체의 인스턴스
	private static Singleton instance;
	
	// 생성자를 통해 객체 생성을 막기위해 생성자를 private 생성한다.
	private Singleton() {}
	
	// Getter getInstance메서들 사용하여 instance 생성
	// instance 가 있으면 기존의 instance를 리턴
	// instance 가 없으면 새로 생성하여 리턴
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
