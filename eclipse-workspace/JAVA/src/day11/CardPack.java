package day11;

/* CardPack 클래스
 * - ♥1~♥K / ◆1~◆K / ♠1~♠K / ♣1~♣K
 * - 총 카드수 : 52장
 * - 52장 카드 한묶음
 * 
 * - 카드 출력기능 - Card class print() 사용
 * - 카드 초기화 기능 (CardPack 생성자)
 * - 카드 한장을 빼내는 기능 => 출력 print() 사용
 * - 카드를 섞는 기능
 * 
 */
public class CardPack {
	// int arr[]= new int[52]; //int 배열안에 들어가는 자료의 형태
	// 카드가 들어가는 배열을 생성
	private Card[] pack = new Card[52];
	private int cnt = 0; // 카드배열의 index 위치를 체크하기 위한 변수

	public CardPack() {
		// CardPack 클래스를 생성하면 52장의 카드가 완성 되어 있어야함.
		// ♥,◆,♠,♣ / 1~13
		char shape = '♥';
		for (int i = 1; i <= 4; i++) { // 4가지 모양
			switch (i) {
			case 1:
				shape = '♥';
				break;
			case 2:
				shape = '◆';
				break;
			case 3:
				shape = '♠';
				break;
			case 4:
				shape = '♣';
				break;
			}
			for (int j = 1; j <= 13; j++) { // 1~13까지 숫자
				Card c = new Card(); // 새 카드 1장을 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++; // 다 돌고나면 52이다.
			}
		}
	}

	// 카드를 섞는 기능
	// shuffle()
	// 리턴타입 없음(void) 매개변수 없음
	public void shuffle() {
		int max = pack.length;
		for (int i = 0; i < pack.length; i++) {
			int ran = (int) (Math.random() * max);
			Card tmp = pack[i];
			pack[i] = pack[ran];
			pack[ran] = tmp;
		}

	}

	// 카드 한장 뺴내는 기능
	// pick() : 카드가 리턴되야함
	public Card pick() {
		if (cnt == 0) {
			return null;
		}
		cnt--;
		return pack[cnt]; // 메인에서 쓸값을 리턴하는것이다.(주는것이다.)
	}

	// 초기화 하는 기능
	public void init() {
		cnt = 52;
	}

	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

}
