package day11;


public class Class04 {

	public static void main(String[] args) {
		/* TV 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 메서드 :
		 * power()
		 * 켜지면 켜짐 꺼지면 꺼짐
		 * chUp() : 1씩 증가 ch는 20, 20이 넘어가면 다시 0번으로
		 * chDown() : 1씩 감소 ch 20, 0이 되면 다시 20번으로 
		 * 
		 * volUp()/volDown() : 1씩 증가/ 1씩 감소 
		 * vol은 10까지 10이 넘으면 계속 10 /0이면 음소거라고 출력
		 * 
		 */
		
		Tv t=new Tv();
		//t.setBrand("삼성전자");
		t.printinfo();
		t.power();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
	}

}

class Tv {
	private final String BRAND ="LG"; //null final은 변경할수없는 값을 지정
	private boolean power; //false
	private int ch; //0
	private int vol; //0
	public Tv() {
		vol=3;
	}
	
	
	public void printinfo() {
		System.out.println("TV명: "+ BRAND +",ch:"+ch+",vol: "+vol);
	}
	
	public void power() {
		this.power = !power;
		if(power) {
			System.out.println("TV전원이 켜졌습니다.");
			printinfo();
		}else if(!power) {
			System.out.println("TV전원을 꺼졌습니다.");
			ch=1;
			vol=3;
		}
	}
	public void chUp() {
		if(power) {
			ch+=1;
			System.out.println("현재 채널"+ch+"입니다.");
			if(ch>=20) {
				ch=0;
				
			}
		}else {
			System.out.println("TV 전원이 꺼져 있습니다 전원을 켜주세요.");
		}
	}
	public void chDown() {
		if(ch==2) {
			ch-=2;
		}
		System.out.println("현재 채널"+ch+"입니다.");
		if(power) {
			ch-=1;
			if(ch<0) {
				ch=20;
			}
		}else { 
			System.out.println("TV 전원이 꺼져 있습니다 전원을 켜주세요");
		}
	}
	public void volUp() {
		if(vol>10) {
			vol =10;
			System.out.println("최대치 입니다.");
		}
		if(power) {
			System.out.println("현재 소리"+vol+"입니다.");
			vol+=1;
			if(vol==0) {
				System.out.println("음소거입니다.");
			}
		}else {
			System.out.println("TV 전원이 꺼져 있습니다 전원을 켜주세요");
		}
		
	}
	public void volDown() {
		if(vol==11) {
			vol-=2;
		}
		System.out.println("현재 소리"+vol+"입니다.");
		if(power) {
			vol-=1;
		}else {
			System.out.println("TV 전원이 꺼져 있습니다 전원을 켜주세요");
		}
		if(vol<=0) {
			vol=0;
			System.out.println("음소거입니다.");
		}
	}
	
	
	public String getBrand() {
		return BRAND;
	}
//	public void setBrand(String brand) { //변경이 불가능하니까 setter는 불가능
//		this.brand = brand;
//	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
}
