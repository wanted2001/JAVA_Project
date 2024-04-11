package day06;

import java.util.Scanner;

public class 과제6 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	/* 숫자를 입력받아서 받은 숫자를 거꾸로 출력. 각자리의 합계 출력
	 * ex) 11456=> 65411 => 6+5+4+1+1 =>결과값 출력
	 * /, % 연산자 이용
	 */

        
        System.out.println("숫자를 입력해주세요~!");
        int num = scan.nextInt();
        System.out.println(num);
        int sum = 0;
        
        //num / 10 = 몫   (int)다시 나누는 값으로 사용
        //num % 10 = 나머지 값을 저장 => 마지막 자리 (출력)
        while(num > 0 ) {
        	int b = num % 10; //마지막 자리를 추출
        	System.out.print(b+" ");
        	
        	sum +=b;
        	num = num / 10; //정수/정수 => 정수 소수점 버림
        	
        }
        System.out.println();
        System.out.print("합계: "+sum);
        
        
        
        
        

        scan.close();
    }
}
