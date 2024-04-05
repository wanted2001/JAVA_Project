package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택
		 * 가위는 0; 바위는 1; 보는 2;
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승/패/무 인지 결과를 출력
		 * ex) 컴 0 =가위
		 * ex) user = 가위
		 * 무승부
		 */
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("가위바위보 게임 시작 :");
		int comNum = (int)(Math.random()*3);
		System.out.println("컴퓨터 결정 완료");
		System.out.println("가위/바위/보 중 하나를 선택");
		String myChoice = scan.next(); // 가위 바위 보 중 하나 선택
		String comChoice = (comNum==0 ? "가위" : comNum==1 ?"바위":"보"); // 이거 몰라서 못했네 어떻게 보면
		System.out.println("comChoice> "+comChoice +"("+comNum+")");
		System.out.println("myChoice> "+myChoice);
		
		if(comChoice==myChoice) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")?"승":"패");
		}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")?"승":"패");
			
		}else if(comChoice.equals("보")) {
			System.out.println(myChoice.equals("가위")?"승":"패");
		}
			
		}
		scan.close();
	}

}
