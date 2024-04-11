package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BoardManage bm = new BoardManage();
		bm.printMenu(sc);
		sc.close();
		

	}

}
