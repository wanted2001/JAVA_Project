package day06;

public class Array05 {

	public static void main(String[] args) {
		/* 문자열을 담는 배열을 생성
		 * 
		 * 
		 */
		
		String arr1[] = new String[5];
		arr1[0]="홍길동";
		arr1[1]="김영이";
		arr1[2]="박순이";
		arr1[3]="최영철";
		arr1[4]="박순철";
		
		for(int i=0; i<arr1.length; i++) { //일반 for 문 
			System.out.print(arr1[i]+" ");
		}
		
		
		//향상된 for 문 
		// 탐색만 가능. 많이 사용함 자바스크립트로 사용자들은 조회만 가능하게 만들수 있음
		System.out.println();
		System.out.println("향상된 for문");
		for(String s: arr1) {
			System.out.println(s);
		}
		

	}

}
