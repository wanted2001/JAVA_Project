package CardpackTest;

public class CardPack2 {
	public Card2[] pack = new Card2[52];
	public int cnt = 0;
	
	public CardPack2() {
		char shape = '♥';
		for (int i = 1; i <= 4; i++) { 
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
			for (int j = 1; j <= 13; j++) { 
				Card2 c = new Card2();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	public void getPack() {
		for(Card2 a : pack){
			a.print();
			System.out.println();
		}
	}
	public void setPack(Card2[] pack) {
		this.pack = pack;
	}

}
