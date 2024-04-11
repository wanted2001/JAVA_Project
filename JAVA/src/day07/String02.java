package day07;

public class String02 {

	public static void main(String[] args) {
		// Sting method

		String str = "홍길동";
		String str1 = "";

		// trim : 불필요한 공백을 제거
		System.out.println("--trim--");
		System.out.println("    hello     ".trim());

		// toLowerCase(); , toUpperCase(); : 대소문자 변환
		System.out.println("--toLowerCase--");
		System.out.println("TOLOWERCASE".toLowerCase());
		System.out.println("TOUPPERCAse".toUpperCase());
		// jpg JPG

		// isEmpty() : 객체가 비어있는지 체크 비어있으면 true
		System.out.println("---isEmpty---");
		System.out.println(str.isEmpty()); // false
		System.out.println(str1.isEmpty()); // true

		// replace : 글자를 치환(변환)
		System.out.println("---replace---");
		String str2 = "banana,apple,kiwi";
		System.out.println(str2.replace(",", "/"));

		// split : 특정값을 기준으로 나누기 => 배열로 리턴
		// 공백으로 나누고 split 하면 하나하나 나뉜다.
		System.out.println("---split---");
		String[] arr = str2.split("");

		for (String s : arr) {
			System.out.print(s + " ");
		}

		System.out.printf("%n---Integer---%n");
		// Integer.parseInt() : 문자를 숫자로 변환
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1 + num2); // 연결연산자로 붙인거다.

		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3 + num4);// 문자를 숫자로 바꿔준다.

		// String.valueOf() : 숫자를 문자로 변환
		// instanceof : 객체의 형이 일치하는 체크
		int a = 12345;
		String as = String.valueOf(a);
		System.out.println(as);
		System.out.println(as instanceof String); // true

		// contains : 해당문자를 포함하는지 체크 boolean 리턴
		System.out.println("---Contains---");
		String file = "이것이자바다.java";
		System.out.println(file.contains("java")); // true

	}

}
