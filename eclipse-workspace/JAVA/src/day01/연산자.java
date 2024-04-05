package day01;



public class 연산자 {

	public static void main(String[] args) {
		//연산자 정리
		/*대입연산자 : =, +=, -= ...
		 * =를 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장
		 * 왼쪽의 값은 반드시 변수여야함.
		 * a = b;
		 * 1=a; 성립될수 없다.
		 * a+=1 => a=a+1 // 기존 값과 1를 더해서 a에 저장
		 */
		int a = 10;
		int b = 5;
		a = b;
		System.out.println(a);
		a+=10;
		System.out.println(a);
		
		//증감 연산자 : ++(1증가)  / --(1감소) 
		a++;
		System.out.println(a);
		System.out.println(a++);// 출력후 1증가
		System.out.println(++a);// 출력전 1증가
		
		//산술 연산자 : + - * / %(나머지)
		/* 나누기(/)
		 * 정수 / 정수 = 정수 (10/3=3) 소수점을 버림
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 정수
		 * 실수 / 실수 = 실수
		 * 
		 * 값 / 0 => 예외 발생(Exception)
		 * 자료형 double / 0 => infinity 발생
		 */
		System.out.println("3+2="+(3+2));
		System.out.println("3+2="+(3-2));
		System.out.println("3+2="+(3*2));
		System.out.println("3+2="+(3/2.0));
		System.out.println("3+2="+(3%2));
	
		/*비교 연산자 : 비교연산의 결과는 true or false 이다.
		 * >=(이상), <=(이하), >(초과), <(미만), ==(같다), !=(같지 않다)
		 * 3 >=5 => false
		 * 
		 * 논리 연산자 : && || !
		 * a && b : (and) 둘다 true여야 true 를 리턴
		 * a || b : (or) 둘중 하나만 true 여도 true 를 리턴
		 * !a : (not) a 상태를 반대로
		 */
		
		System.out.println("3>2 ?"+ (3>2));
		System.out.println("3<2 ?"+ (3<2));
		System.out.println("3==2 ?"+ (3==2));
		System.out.println("3!=2 ?"+ (3!=2));
		
		System.out.println("&& 연산자 : "+(3>2 && 4<3));
		System.out.println("|| 연산자 : "+(3>2 || 4<3));
		
		/*조건 선택 연산자 : 3항 연산자
		 *(조건식) ? true : false;
		 */
		System.out.println((3<2) ? "참입니다." : "거짓입니다.");
		/*문제 : num의 변수를 선언하여 값을 입력하고,
		 * num가 짝수 인지 홀수인지 판별
		 * 조건 선택 연산자 사용하여 출력
		 */
		
		
		int num = 5;
		System.out.println((num%2==0) ? "짝" : "홀");
		
		String result = (num % 2 ==0) ? "짝수" : "홀수";
		System.out.println(num+"는"+ result +"입니다.");
		
		
		if(num%2==0) { System.out.println("짝수입니다.");
		}
		else { System.out.println("홀수입니다.");
		}
		
	}
		

}
