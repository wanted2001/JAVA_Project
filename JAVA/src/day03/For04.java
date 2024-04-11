package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/* 단을 입력받아 입력받은 단을 출력 (구구단)
		 * 2=>2*1=2
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("구하고자 하는 구구단의 수를 입력해주세요");
		int i = scan.nextInt();
		
		for(int j= 1; j<=100; j++) {
			long sum = 0;
			sum = i * j;
					System.out.println(i + " * " + j + " = " +(sum));}
		
		
		
		scan.close();

	}

}
