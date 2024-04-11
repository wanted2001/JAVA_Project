package day03;

import java.util.Scanner;

public class 과제3 {

	public static void main(String[] args) {
		/*up down 게임
		 * 
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 
		 * 입력>10
		 * up~!!
		 * 입력>20
		 * up~!!
		 * 입력>30
		 * down~!!
		 * 입력>23
		 * 정답 !! 하고 종료
		 */
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random()*50)+1;
		//System.out.println(ran); //테스트 하기 위해 num 값을 출력했다.
		int i = 0;
		int num = 0;
		
		while(i!=ran) {
			System.out.println("입력>");
			i= scan.nextInt();
			num++;
			if(num==5) { System.out.println("실패하셨습니다.정답: "+ran); break;}
			if(i>50) {System.out.println("50 아래로 입력해주세요!"+num+"회");}
			else if(i<ran) {
			System.out.println("UP~!"+ num +"회");}
			else if(i>ran) {System.out.println("Down~!"+ num + "회");}
			else { System.out.printf("정답!!!!!!%n%d번 만큼 시도하셨습니다.",num);
			}
	}
		scan.close();	

} }
