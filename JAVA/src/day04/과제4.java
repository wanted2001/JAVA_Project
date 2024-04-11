package day04;

import java.util.Scanner;

public class 과제4 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6까지 생성)
		 * 주사위 : 3 
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 1 
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6 
		 * 6칸 전진 => 20칸 남았습니다.
		 * ...
		 * 도착! 총 이동횟수 10 => 주사위를 던진 횟수 
		 */
		Scanner scan = new Scanner(System.in);
		
		//for문 방식
		int count = 0;
		int Max = 30;

		System.out.printf("주사위 게임 시작하겠습니다.%n "
				+ "아무키나 눌러 게임을 시작하세요.");
		String str =scan.nextLine();
		for(int i = 1; ; ++i) {
		int ran = (int)(Math.random()*6)+1;
		System.out.printf("나온 수:" + ran + "칸 입니다.%n");
		count+=ran;
		System.out.println("주사위 "+ran + "칸 전진");
		if(count<30) {System.out.printf((Max-count)+"칸 남았습니다.%n아무키나 입력하세요");
		str =scan.nextLine();}
		else if(count>30 || count ==30) {System.out.printf("도착! => 총 이동횟수 %d번 입니다.%n",i);
		break;
	}
		}
		//while문 방식
		int random= 0 ;//주사위 값
		int sum = 0 ;//거리 누적값
		int cnt = 0 ; // 주사위 던진 횟수 누적
		int last = 30 ; //최종 목표 이동 수 
		
		System.out.println("게임 시작");
		
		while(sum<last) {// 거리 누적값이 최종목적지보다 작다면
			scan.nextLine(); // enter를 이용하여 주사위를 던진수 있게 해줌
			random =(int)(Math.random()*6)+1;//1부터 6까지 랜덤 수 저장
			//발생값 거리 합산
			sum+=random;
			cnt++;
			System.out.println("주사위 "+random +"칸");
			System.out.println(random+"칸 전진 =>"+(last-sum)+"칸 남았습니다.");
		}
		System.out.println("도착 ~!"+ "총 이동횟수:"+ cnt);
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		
		

	}
	

}
