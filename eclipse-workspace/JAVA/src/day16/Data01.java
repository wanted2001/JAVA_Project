package day16;

import java.util.Calendar;
import java.util.Date;

public class Data01 {

	public static void main(String[] args) {
		/* 날짜/시간 클래스
		 * Date 클래스 => Deprecated(비권장 코드)/ Calender 클래스
		 * Calender 클래스는 추상 클래스이다. abstract는 객체를 생성할 수없다.
		 * 추상클래스를 구현한 객체를 이용하여 생성
		 * new로 객체생성불가능
		 * getinstance() 메서드를 이용하여 객체를 얻어옴.
		 * static 메서드 . 클래스명.메서드명();
		 * 
		 *  
		 */
		
		//Date d = new Date();
		Calendar c = Calendar.getInstance(); //오늘 날짜 계산
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//월 0~11까지  +1
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK); //일~토로 표현
		System.out.println(week);
		System.out.println(year+"-"+month+"-"+day);
		int z = c.get(Calendar.DAY_OF_WEEK_IN_MONTH); //이번달에 몇째 주인지 알려주는 문구
		System.out.println(z);
		int i = c.get(Calendar.DAY_OF_YEAR); // 365일 로 나타내는 문구
		System.out.println(i);
		//hour,minute,second,am_pm;
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = c.get(Calendar.SECOND);
		System.out.println(second);
		int dn = c.get(Calendar.AM_PM); //0은 am 1은 pm
		System.out.println(dn);
		
		String weekday = "null";
		//2024-1-26(금)
		//오후 4:16분 표현
		switch(week) {
		case 1: weekday = "(일)"; break;
		case 2: weekday = "(월)"; break;
		case 3: weekday = "(화)"; break;
		case 4: weekday = "(수)"; break;
		case 5: weekday = "(목)"; break;
		case 6: weekday = "(금)"; break;
		case 7: weekday = "(토)"; break;
		default : break;
		}
		
		System.out.println(year+"-"+month+"-"+day+"/"+weekday);
		System.out.println((dn==0)?"오전":"오후"+" "+hour+":"+minute+":"+second);
		
		
	
		
		

	}

}
