package board;

import java.util.Scanner;

public interface BoardInterface {
//	1.게시글 추가
//	2.게시글 검색
//	3.게시글 수정
//	4.게시글 삭제
//	5.게시글 출력
//	6.종료
	void addBoard(Scanner sc);
	void searchBoard(Scanner sc);
	void modifyBoard(Scanner sc);
	void removeBoard(Scanner sc);
	void printBoard(Scanner sc);
	void printMenu(Scanner sc);


}
