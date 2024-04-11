package board;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardManage implements BoardInterface{
	
	
	ArrayList<Board> list = new ArrayList<Board>();
	int count = 0;
	
	@Override
	public void addBoard(Scanner sc) {
		count ++;
		System.out.println("제목>");
		String title = sc.next();
		System.out.println("내용>");
		String content = sc.next();
		System.out.println("작성자>");
		String writer = sc.next();
		LocalDate now = LocalDate.now();
		list.add(new Board(count,title,content,writer,now));
		printMenu(sc);
	}

	@Override
	public void searchBoard(Scanner sc) {
	    System.out.println("찾고자 하는 게시물 번호을 입력하세요.");
	    int num = sc.nextInt();
	    boolean found = false;
	    for(int i = 0; i < list.size(); i++) {
	        if(list.get(i).getNum() == num) {
	            System.out.println(list.get(i));
	            found = true;
	        }
	    }
	    if(!found) {
	        System.out.println("검색된 게시물이 없습니다.");
	    }
	    printMenu(sc);
	}


	@Override
	public void modifyBoard(Scanner sc) {
		System.out.println("수정할 게시물에 번호를 입력하세요.");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("1부터 입력해주세요");
			return;
		}
		if(list.size()<num) {
			System.out.println("다시 선택해주세요.");
			printBoard(sc);
			return;
		}
		for(Board b : list) {
			if(b.getNum()==num) {
				System.out.printf("수정할 항목 %n 1.제목 2.내용 3.작성자");
				int modifyNum = sc.nextInt();
				switch(modifyNum) {
				case 1 : System.out.println("수정할 제목>");
				String title = sc.next();
				b.setTitle(title);
				break;
				case 2 : System.out.println("수정할 내용>");
				String content = sc.next();
				b.setContent(content);
				break;
				case 3 : System.out.println("수정할 작성자>");
				String writer = sc.next();
				b.setWriter(writer);
				break;
				default : System.out.println("잘못된 입력입니다.");
				break;
				}
			}
		}
		
		    printMenu(sc);	    
	}
	
	@Override
	public void removeBoard(Scanner sc) {
		System.out.println("삭제할 게시물 제목을 입력하세요.");
		int num = sc.nextInt();
		boolean found = false;
	    for(int i = 0; i < list.size(); i++) {
	        if(list.get(i).getNum()== num) {
	            list.remove(i);
	            for(int j = 0; j<list.size(); j++) {
	            	list.get(j).setNum(j+1);
	            	count = j+1;
	            }
	            found = true;
	        }
	    }
	    if(!found) {
	        System.out.println("검색된 게시물이 없습니다.");
	    }
	    printMenu(sc);	    
		
		
	}

	public void printBoard(Scanner sc) {
	    if (list.isEmpty()) {
	        System.out.println("게시물이 없습니다.");
	    } else {
	        for (Board b : list) {
	            System.out.println(b);
	        }
	    }
	    printMenu(sc);
	}


	public void printMenu(Scanner sc) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("메뉴 "
				+ "1.게시글 추가\r\n"
				+ "2.게시글 검색\r\n"
				+ "3.게시글 수정\r\n"
				+ "4.게시글 삭제\r\n"
				+ "5.게시글 출력\r\n"
				+ "6.종료\r\n"
				+ "");
		int menu = sc.nextInt();
		switch(menu) {
		case 1 : addBoard(sc);
			break;
		case 2 : searchBoard(sc);
			break;
		case 3 : modifyBoard(sc);
			break;
		case 4 : removeBoard(sc);
			break;
		case 5 : printBoard(sc);
			break;
		case 6 : System.out.println("종료");
			break;
		default : System.out.println("잘못된 입력입니다."); break;
		}
		
		
		
	}
	
}
