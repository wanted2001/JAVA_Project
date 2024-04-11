package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		/*
		 * 약수 : 나누어서 떨어지는 수의 집합
		 * 6의 약수 : 6%1=0,6%2=0,6%3=0,6%4=2,6%5=1,6%6=0
		 * 6의 약수 : 1,2,3,6 
		 */
		
		for (int i = 6, j = 1; j<=i; j++){
			if(i%j==0) { System.out.print(j+" ");}
			
		}
		System.out.println();
		
		//num를 1~num까지 나눈 나머지가 0인 수를 출력
		int num =6;
		for (int i = 1 ; i<=num; i ++){
			if (num % i ==0) { System.out.print(i+" ");
		}}
		
		//num1 를 입력 받아서 입력받는 num1의 약수를 출력
		System.out.println();
		System.out.println("정수를 입력해주세요 >");
		int num1 = scan.nextInt();
		for(int i = 1; i<=num1; i++) { 
			if(num1%i==0) {System.out.print(i+" ");}
		}
		
		
		
		scan.close();
	}

}
