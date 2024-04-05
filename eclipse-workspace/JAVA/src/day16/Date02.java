package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		String t =today.toString(); // 스트링으로 객체를 반환
		
		
		//날짜 /시간
		System.out.println(t.substring(0,t.indexOf("T"))+"/"); // subString 추출 index 번지를 표시
		System.out.println(t.substring(t.indexOf("T")+1,t.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.
				ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9,30,8,30);
		System.out.println(sDate.format(dtf));
	}

}