package day18;

import java.util.HashMap;
import java.util.Scanner;


public class WordManager {

	//1.단어등록 | 2.단어검색 | 3.단어수정 | 4.단어출력 | 5.단어삭제 |6.종료
	
	private HashMap<String,String> Word = new HashMap<String,String>(); 
	
	public WordManager() {
		Word.put("apple","사과");
		Word.put("banana","바나나");
		Word.put("peach","복숭아");
		Word.put("grape","포도");
		Word.put("orange","사과");
	}
	
	public void addWord(Scanner sc) {
		System.out.println("단어를 입력>");
		String a = sc.next();
		System.out.println("의미를 입력>");
		String b = sc.next();
		Word.put(a,b);
		System.out.println("입력완료!!!");
	}
	
	public void searchWord(Scanner sc) {
		System.out.println("검색할 단어입력>");
		String a = sc.next();
		if(Word.containsKey(a)) {
			System.out.println(a+":"+Word.get(a));
			return;
		}
			System.out.println("찾은 단어가 없습니다.");	
	}
	
	public void modifyWord(Scanner sc) {
		//key 중복 불가능 put으로 그냥 넣으면 덮어쓰기가 됨.
		//map은 set이 없음 
		System.out.println("수정할 단어입력>");
		String a = sc.next();
		if(Word.containsKey(a)) {
			System.out.println("의미를 입력>");
			String b =sc.next();
			Word.put(a, b);
			return;
			}
		System.out.println("수정할 단어가 없습니다.");
	}
	
	public void wordList() {
		int cnt = 0;
		System.out.println("-------단어목록-------");
		for(String s : Word.keySet()) {
			cnt++;
			System.out.println(cnt+"번 단어:"+s+" / 의미:"+Word.get(s));
		}
	}
	
	public void removeWord(Scanner sc) {
		System.out.println("삭제할 단어입력>");
		String a = sc.next();
		if(Word.containsKey(a)) {
			Word.remove(a);
			System.out.println("삭제완료!!!");
		}else {
			System.out.println("삭제할 단어가 없습니다.");
		}
	}
	
	
	
}
