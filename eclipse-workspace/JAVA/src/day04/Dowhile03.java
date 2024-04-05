package day04;

import java.util.Scanner;

public class Dowhile03 {

	public static void main(String[] args) {
		/*숫자 2개를 입력받고 
		 * menu 
		 * 1 : + 2 : - 3 : * 4 : / 5 : % 6 : 종료
		 * menu에 따라서 두수의 연산 결과를 출력
		 */

		Scanner scan = new Scanner(System.in);
		int num1 = 0 ; 
		int num2 = 0 ; 
		int menu = 0 ;
		
		System.out.println("두 수를 입력 >");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		do {
			System.out.println("-menu-");
			System.out.println("1.+ | 2.- | 3.*| 4./ | 5.% | 6.종료");
			menu = scan.nextInt();
			
			
			switch(menu){
				case 1 : System.out.println(num1+"+"+num2 + "=" + (num1+num2));
					break;
				case 2 : System.out.println(num1+"-"+num2 + "=" + (num1-num2));
					break;
				case 3 : System.out.println(num1+"*"+num2 + "=" + (num1*num2));
					break;
				case 4 : 
					if(num2==0) {System.out.println("num2의 입력이 잘못되었습니다.");
					System.out.println("num2를 입력 >");
					num2 = scan.nextInt();}
					System.out.println(num1+"/"+num2 + "=" + (num1/num2));
					break;
				case 5 : 
					if(num2==0) {System.out.println("num2의 입력이 잘못되었습니다.");
					System.out.println("num2를 입력 >");
					num2 = scan.nextInt();}System.out.println(num1+"%"+num2 + "=" + (num1%num2));
					break;
				case 6 : System.out.println("종료 되었습니다."); 
					break;
				default : System.out.println("잘못된 입력입니다."); 
				break;
			}
			}while(menu!=6);
		
		
		
		
		
		scan.close();
	}

}
