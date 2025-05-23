package day11;

/* 1장의 카드를 생성하기 위한 클래스
 * - 숫자 : 1~10, J, Q, K
 * - 모양 :♥,◆,♠,♣
 * - 한장의 카드를 출력하는 기능 print() => ♥1
 * - ex)◆12 => ◆Q, ♠13 => ♠K, %2 => ♥2, &15 => ♥1
 */
/* 클래스의 구성
 * - 멤버변수 : 모양(shape), 숫자(num) =>private => getter/setter
 * - 메서드 : print();
 * - 생성자 : 기본 생성자만 생성 => ♥1
 * 
 */


public class Card {
	
	public static void main(String[] args) {
		
		Card c = new Card();
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
				c.setShape(shape);
				c.setNum(j);
				c.print();
			}
			System.out.println();
		}	
		
	}
	
private int num;
private char shape;
public Card() {
	this.num = 1;
	this.shape = '♥';
}

public void print() {
	switch(num) {
		case 1 : System.out.print(" "+shape+"A");
		case 11 :System.out.print(" "+shape+"J");
		break;
		case 12 :System.out.print(" "+shape+"Q");
		break;
		case 13 :System.out.print(" "+shape+"K");
		break;
		default :if(num>13 || num<1) { 
			num = 1;
		}
		System.out.print(" "+shape+num);
	}
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
	if(num>13||num<1) {
		num=1;
	}
}

public char getShape() {
	return shape;
}

public void setShape(char shape) {
	if(shape=='♥'||shape=='◆'||shape=='♠'||shape=='♣') {
		this.shape = shape;
	}else {
		shape='♥';
	}
	
	}
		
}

