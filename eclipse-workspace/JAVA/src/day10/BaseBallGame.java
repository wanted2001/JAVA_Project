package day10;

import java.util.Scanner;

import day08.Method07_1;

public class BaseBallGame {
 
	public static void main(String[] args) {
		/* 야구게임을 메서드화
		 * 사용자 번호는 직접입력
		 * 번호는 랜덤 생성 (1~9,중복x)
		 * 중복안되게 하는 메서드 isContain
		 */
		Scanner sc = new Scanner(System.in);
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int cnt = 0;
		int s=0,b=0;
		createArray(comNum);
		
//		for(int a : comNum) {
//			System.out.println(a+"");
//		}
		
			//사용자 번호 입력
		while(s!=3) {
			System.out.println("숫자 입력>");
			String mystr = sc.next();
			String[]myNumstr = mystr.split("");
			for(int i=0; i<myNumstr.length; i++) {
			myNum[i]=Integer.parseInt(myNumstr[i]);
		}
		
		
			s=strike(comNum, myNum);
			b=ball(comNum, myNum);
					
		//결과출력
		if(s!=0) {
			System.out.println(s+"s");
		}
		if(b!=0) {
			System.out.println(b+"b");
		}
		if(s==0 && b==0) {
			System.out.println("OUT~~");
		}
		
		}
		System.out.println("정답 종료~~!");
		sc.close();
	}
	
	/* 랜덤으로 배열을 중복되지않게 사용
	 * 
	 */
	public static void createArray(int arr[]) {
		int cnt =0;
		while(cnt<arr.length) {
			int r =(int)(Math.random()*9)+1;
			if(!Method07_1.isContain(arr,r)) { 
				arr[cnt]=r;
				cnt++;
			}	
		}
	}
	
	//범위에 상관없이 랜덤수를 채우는 메서드
	//범위 매개변수로 받아오면 끝.
	//(int)(Math.random()*개수)+시작값;
	//start count를 매개변수로 받아 범위를 생성
	public static void createArrayRandom(int arr[],int start,int count) {
		int cnt =0;
		while(cnt<arr.length) {
			int r =(int)(Math.random()*count)+start;
			if(!Method07_1.isContain(arr,r)) { 
				arr[cnt]=r;
				cnt++;
			}	
		}
	}
	
	
	/* 스트라이크 개수를 카운트하는 메서드
	 * comNum ,myNum 주고 번호와 위치가 일차히면 count 하는 메서드
	 * 리턴타입 int count를 리턴
	 */
	public static int strike(int comNum[],int myNum[]) {
		int cnt = 0;
		for(int i=0; i<comNum.length; i++) {
			if(comNum[i]==myNum[i]) {
					cnt++;
				}
			}
		return cnt;
	}
	
	
	/* 볼 개수를 카운트하는 메서드
	 * 
	 */
	
	public static int ball(int comNum[],int myNum[]) {
		int cnt = 0;
		for(int i=0; i<comNum.length; i++) {
			if(Method07_1.isContain(myNum, comNum[i])) {
					cnt++; //ball+strike 같이 체크
			}
		}
		return cnt - strike(comNum, myNum); 
				
	}

}
