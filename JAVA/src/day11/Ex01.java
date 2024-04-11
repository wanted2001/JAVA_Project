package day11;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardPack cp = new CardPack(); //52장의 카드가 모두 생성됨
		int cnt=0;
		for(int i = 0; i<4; i++) {
			for(int j=0; j<13; j++) {
				cp.getPack()[cnt].print();
				//CardPack 클래스안에 있는 pack[];
				//pack[0]번지 => Card(멤버변수,메서드)
				cnt++;
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------");
		cp.shuffle(); //셔플은 됐고
		cnt=0;
		for(int i = 0; i<4; i++) {
			for(int j=0; j<13; j++) {
				cp.getPack()[cnt].print();
				//CardPack 클래스안에 있는 pack[];
				//pack[0]번지 => Card(멤버변수,메서드)
				cnt++;
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		System.out.println("Player1 card open");
		player1.print();
		System.out.println("");
		System.out.println("Player2 card open");
		player2.print();
		
	}

}
