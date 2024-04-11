package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/*
		 * file에 저장 되어있는 문자를 파일명과 확장자로 분리하여 출력
		 * 
		 */

		// 나누기 방식
		String file = "이것이자바다.java";
		// "\\." , "[.]" 가 문자로 인식할수 있게 하는것이다. *
		String[] af = file.split("[.]");
		for (String f : af) {
			System.out.println(f);
		}

		// 추출방식
		String str1 = file.substring(0, file.indexOf("."));
		System.out.println(str1);
		// j 로 하거나 .+1를 해서 .다음에 있는 번지를 가져온다 *
		String str2 = file.substring(file.indexOf("j"));
		System.out.println(str2);
		
		//contains : 문자가 포함되어 있는지를 체크 boolean으로 리턴
		if(file.contains("java")) {
			System.out.println("자바파일입니다.");
		}

	}

}
