package new01;

import java.util.HashMap;
import java.util.Scanner;

public class new04 {
	/*
	 * 단어장 단어 : 의미 map 으로 생성 입력받을 단어의 갯수를 입력받아 개수만큼 map에 추가
	 */
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HashMap<String, String> map = new HashMap<String, String>();
	int i = 0;
//	int count = 0;
	String a = "";
	String b = "";

	
	
	do {
		System.out.println("입력하세요 1번 추가 2번 길이 3번 출력 4번 종료");
		i = sc.nextInt();
		
		switch(i) {
		case 1 : 
			System.out.println("단어입력");
			a = sc.next();
			System.out.println("의미입력");
			b = sc.next();
			map.put(a, b);
			break;
		case 2 : System.out.println("단어의 개수는 "+ map.size() +"개 입니다.");
			break;
		case 3 : for(String c : map.keySet()) {
			System.out.println(c + ":" + map.get(c));
		}
			break;
		case 4 : System.out.println("종료");
		break;
		default : System.out.println("잘못된 입력입니다.");
		break;
		}
	}while(i!=4);
	sc.close();
}
}
