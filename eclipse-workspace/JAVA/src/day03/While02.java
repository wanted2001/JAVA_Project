package day03;

public class While02 {

	public static void main(String[] args) {
		/* 1부터 50까지의 짝수
		 * 
		 */
		
		int i = 0;
		while(i<50) {
			i++;
			if(i % 2 ==0) {
				System.out.printf("%3d",i);}
					if(i % 10 == 0){
					System.out.println();}}
					
					
		/* System.out.println(); : 줄바꿈이 있는 출력
		 * System.out.print(); : 줄바꿈이 없는 출력 출력 값이 없으면 error 
		 * System.out.printf : 지시자를 이용한 출력
		 * 
		 * 지시자 %d(정수형) %f(실수형) %c(문자) %s(문자열) %n(줄바꿈)
		 * 소수점 설정 가능 공백 포함 가능 
		 */
		
		System.out.println( ); //줄바꿈
		System.out.printf("%.2f%n",1.66666666);
		
		
		int num1 =5;
		int num2 =3;
		//5+3=8
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
		System.out.printf("%d + %d = %d%n",num1,num2,num1+num2);
		
		double num3 = 1.2;
		double num4 = 5;
		//1.2/5= 값
		System.out.printf("%.1f / %.1f = %.1f%n",num3,num4,num3/num4);
		
		
		
		
			
		}
}
