package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기자신만의 수를 가지는 소수라고 한다.
		 * 소수 : 3, 5, 7, 11, 13, 17, 19 ...
		 * 소수의 약수는 (1, 나자신)
		 * 
		 * 숫자 하나를 입력받아서 해당 수가 소수인지 아닌지 판별
		 * num = 13 
		 * 소수입니다.
		 * num = 12
		 * 소수가 아닙니다.
		 */

		Scanner scan = new Scanner(System.in);
		
		//System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		int count = 0;
		
		
		for(int i = 1; i<=num;  i++) {
			//약수의 개수를 세기 위함
			if(num%i==0){ //약수 공식
				count++;// 약수는 1과 나자신밖에 없기 때문에 나눠서 count가  2가 나오면 출력 하게끔 한다.
			}
		}
		if(count==2) {
			System.out.printf("%d 는 소수가 맞습니다.",num);
		}
		else {
			System.out.printf("%d 는 소수가 아닙니다.",num);
		}
		
		System.out.println();
		System.out.println("--------------------------------------------");
		/*2부터 100까지의 소수를 모두 출력하세요
		 * 
		 */
		int num1= 0;
		int cnt= 0;
		
		for(num1=2; num1<=100; num1++) {
			cnt=0;// 다시 num1이 올라가는 만큼 값을 새로 받아야 하기 때문에 초기화한다.
			for(int j = 1; j<=num1; j++) {
				if(num1%j==0) {
					cnt++;
				}
			}
			//System.out.println(cnt); cnt에 값이 얼마인지 확인한다.
				if(cnt==2) {
					System.out.print(num1+" ");
				}
		}
			
		
		scan.close();
	}

}
