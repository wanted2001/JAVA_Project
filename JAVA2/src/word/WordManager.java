package word;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class WordManager {

	String name;
	String word;
	private HashMap<String, String> map = new HashMap<String, String>();

	WordManager() {
	}

	public void addWord(Scanner sc) {
		System.out.println("단어를 입력하세요");
		name = sc.next();
		System.out.println("의미를 입력하세요");
		word = sc.next();
		map.put(name, word);
	}

	public void searchWord(Scanner sc) {
		System.out.println("찾는 단어를 입력");
		name = sc.next();
		for (int i = 0; i < map.size(); i++) {
			if (map.keySet().contains(name)) {
				System.out.println(map.get(name));
				return;
			}
		}
		System.out.println("찾고자 하는 단어가 없습니다.");
	}

	public void modifyWord(Scanner sc) {
		System.out.println("수정할 단어 입력");
		name = sc.next();
		for (int i = 0; i < map.size(); i++) {
			if (map.keySet().contains(name)) {
				addWord(sc);
				return;
			}
		}
		System.out.println("찾고자 하는 단어가 없습니다.");
	}
	
	public void printWord() {
		for(String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp));
		}
	}
	
	public void pushFlie() throws IOException {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("Output.txt"));
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}


}
