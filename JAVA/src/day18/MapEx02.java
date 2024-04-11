package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어를 5개를 입력받아 콜솔에 출력하는 기능
		 * --단어장--
		 * hello : 안녕
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<String, String>();
		String a= "null";
		String b= "null";
		int cnt =0;
		while(!a.equals("0")) {
			System.out.println("종료시 0을 입력");
			System.out.println("단어를 입력>");
			a =sc.next();
			if(a.equals("0")) {
				break;
			}
			System.out.println("의미를 입력>");
			b =sc.next();
			
			map.put(a,b);
			cnt++;
			if(cnt>=5) {
				System.out.println("-----단어장-----");
				for(String s : map.keySet()) {
					System.out.println(s+":"+map.get(s));
				}
				cnt=0;
			}	
		}
		System.out.println("-----단어장-----");
		for(String s : map.keySet()) {
			System.out.println(s+":"+map.get(s));
		}
		
		
		
		
		
		
		
		sc.close();
		}
}
