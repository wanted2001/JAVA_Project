package day08;

public class Method07_1 {
	
	

	public static void main(String[] args) {
		/* 
		 * 로또번호 생성
		 */
		int lotto[] = new int[7]; //당첨번호
		int user[] =new int [6]; //내 번호 
		
		randomArray(lotto);
		randomArray(user);
		System.out.println("---당첨번호---");
		printArray(lotto);
		System.out.println("---내 번호---");
		printArray(user);
		
		int rank =lottoRank(lotto,user);
		if(rank==-1) {
			System.out.println("꽝입니다.");
			
		}else {
			System.out.println(rank +"등 입니다.");
		}
		
	}
	
	/*배열을 매개변수로 받아 1~45 까지 랜덤수를 채워서 생성.(중복 불가능)
	 * 매개변수 : 배열 => int arr[]
	 * random == arr[i] false면 추가
	 */
	public static void randomArray(int arr[]) {
		//배열의 받아서 배열에 랜덤 값 중복없이 채우기
		int cnt = 0;//while에서 i 역할을 할 변수
		while(cnt<arr.length) {
			int r =(int)(Math.random()*45)+1;
			if(!isContain(arr,r)) { //결과값이 f면 넣는다 즉 arr에 랜덤뽑은 값이 없으면 넣는다
				arr[cnt]=r;
				cnt++;
			}
			
		}
	}
	
	/*
	 * 배열을 매개변수로 받아 배열을 출력하는 메서드
	 */
	public static void printArray(int arr[]) {
		if(arr.length==7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]+" ");
				}
			System.out.println("["+arr[arr.length-1]+"]");
		}
		if(arr.length==6) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	}
	
	/* 중복 확인 메서드
	 * 매개변수 ; 베열 ,값
	 * 있으면 t 없으면 f
	 * 리턴 타입 : boolean
	 * 매서드명 : isContain
	 */
	public static boolean isContain(int arr[],int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}
		return false;
	}
	/* 등수 확인 메서드
	 * 매개변수 lotto[]/user[]
	 * 리턴타입 : int[]
	 * 메서드명 : lottoRank
	 * --당첨기준
	 * user번호 기준으로
	 * 6개 : 1등
	 * 5개+보너스 :2등
	 * 5개 : 3등
	 * 4개 : 4등
	 * 3개 : 5등
	 * 나머지 꽝 
	 */
	
	public static int lottoRank(int lotto[],int user[]) { 
		int cnt = 0;
		if(lotto.length<=user.length) {
			return -1;
		}
		for(int i=0; i<user.length; i++) {
			if(isContain(user,lotto[i])) { 
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6: return 1;
		case 5: 
			if(isContain(user,lotto[lotto.length-1])){
				return 2;
			}else {
				return 3;
			}
		case 4: return 4;
		case 3: return 5;
		default : return -1;
		}
	} // lottoRank 메서드 끝
	
	
		
}
