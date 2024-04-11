package new01;

import java.util.Scanner;

public class new02 {
	
	public static void main(String[] args) {
			
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		
		/* 숫자를 입력받아 1부터 내가 입력한 숫자까지 5의 배수를 출력*/
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i = 1; i<=a; i++) {
			if(i%5==0) {
				System.out.print(i +" ");
			}
		}
		
		sc.close();

		
		
		
		
	}
}
