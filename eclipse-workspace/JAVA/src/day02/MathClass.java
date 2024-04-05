package day02;

public class MathClass {

	public static void main(String[] args) {
		/*
		 * Math.method 
		 * Math.round(반올림) : 소수자릿수는 무조건 0
		 * Math.ceil(올림) /Math.floor(버림)
		 * 
		 */

		double num = 3.1;
		//반올림 3 / 올림 4 / 버림 3
		
		int roundNum = (int)Math.round(num); // return long 으로 나오는데 필요한값이 int라면  형변환을 하면 된다.
		System.out.println(roundNum);
		int ceilNum = (int)Math.ceil(num); // return double
		System.out.println(ceilNum);
		int floorNum = (int)Math.floor(num);
		System.out.println(floorNum);
		
		//Math.max(최대값) , Math.min(최소값)
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		//Math.random : 0  과 1 사이에 아무값을 출력
		// 0 <= Math.random() < 1
		//(int)(Math.random()*count)+start 
		// start 부터 count 까지의 랜덤수를 얻는 공식
		System.out.println("----------------------------");
		System.out.println((int)(Math.random()*10)+1); 
		//return double; 0은 포함 1은 미포함
		
		
		  
		
	}

}
