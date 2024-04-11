package word;

import java.util.Scanner;

public class WordMain {
	public static void main(String[] args) {
		/* 단어장 프로그램 작성
		 * Word 클래스 생성
		 * 단어, 의미
		 * 
		 * 메뉴 1.단어등록 2.단어검색 3.단어수정 4.단어출력 5.파일로 내보내기 6.종료
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		WordManager wm = new WordManager();
		int i = 0;
		do {
			System.out.println("menu");
			System.out.println("1번 등록 2번 검색 3번 수정 4번 출력 5번 파일 6번 종료 ");
			i = sc.nextInt();
			
			switch(i) {
			case 1: wm.addWord(sc);
				break;
			case 2: wm.searchWord(sc);
				break;
			case 3: wm.modifyWord(sc);
				break;
			case 4: wm.printWord();
				break;
			case 5: 
				break;
			case 6: 
				break;
			default : System.out.println("잘못된 입력입니다.");
				break;
			}
		}while(i!=6);
		
		sc.close();
		
	}
}


