package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/*
		 * 5개의 파일명이 주어졌을때 , 검색어를 입력하면 해당 단어을 포함하는 파일을 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);

		String[] fileName = { "이것이자바다.java", "java의정석.java", "String.jpg", "String 메서드.txt", "array.txt" };

		// ex : java => 이것이자바다.java java의정석.java 출력
		// String => String.jpg String 메서드.txt
		// txt => String 메서드.txt array.txt
		// 스트링 => 검색결과가 없습니다.
		int count = 0;
		System.out.println("찾고자 하는 파일명을 검색하세요>");
		String s= scan.nextLine();
		//System.out.println(i);
		
		for(int i = 0; i<fileName.length; i++) {
		while(fileName[i].contains(s)) {
				System.out.print(">");
				System.out.println(fileName[i]);
				break;}	
		if(fileName[i].indexOf(s)==-1) {
			count++;	
		}
		}	
		if(count==fileName.length) {
			System.out.printf("%s 의 검색결과가 없습니다.",s);
		}
		
		
		
		
		
		System.out.println("검색하세요>");
		String c = scan.nextLine();
		int cnt = 0 ;
		System.out.println("--검색어:"+c+"--");
		for(String tmp : fileName) {
			if(tmp.contains(c)) {
				System.out.println(tmp);
				cnt++;
			}
			
		}
		if(cnt==0) {
			System.out.println("검색결과가 없습니다.");
		}

		scan.close();

	} 

}
