package CardpackTest;

public class Card2 {
	
	public static void main(String[] args) {
		CardPack2 c2 = new CardPack2();
		c2.getPack();
	}	
private int num;
private char shape;
public Card2() {
	this.num = 1;
	this.shape = '♥';
}
public void print() {
	switch(num) {
		case 1 : System.out.print(" "+shape+"A");
		break;
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



