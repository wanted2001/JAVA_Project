package day08;

public class Method03 {
	
	public static void goo(int num) { // main 에서 goo의 값을 필요로 다른 것을 하려면 return이 필요하다.
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d*%d = %d %n",num,i,num*i);
		}
	}

	public static void main(String[] args) {
		// 정수 (2~9 중 하나)에 해당하는 구구단 출력 메서드
		//매개 변수
		//리턴타입이 없다
		goo(2);
		
		
	}

}
