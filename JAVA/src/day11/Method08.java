package day11;

public class Method08 {

	public static void main(String[] args) {
		/* 메서드 오버로딩
		 * - 동일한 이름의 메서드를 여러개 만드는 케이스
		 * - 오버로딘의 조건
		 * 1. 매개변수의 개수가 다르면 가능.
		 * 2. 매개변수의 타입(종류)이 다르면 가능.
		 * - 리턴타입은 상관없음. 매개변수의 이름도 상관없음.
		 * 
		 */
		Method08 m8 =new Method08();
		int sum = m8.sum(10,20);
		System.out.println(sum);
		System.out.println(m8.sum(10, 20,30));
		System.out.println();
		System.out.println(m8.sum(10, 20.5));
	}
	
	public int sum(int num1, int num2, int num3) {
		 int hap = num1+num2+num3;
		 return hap;
	}
	public int sum(int num1, int num2) {
		int hap = num1+num2;
		
		return hap;
	}
	public double sum(double num1, double num2) {
		double hap = num1+num2;
		return hap;
	}

}
