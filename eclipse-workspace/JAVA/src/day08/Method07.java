package day08;

public class Method07 {

	public static void main(String[] args) {
		/* 로또 번호 생성
		 * 
		 */
		int lotto[] = new int[7]; //당첨 번호
		int user[] = new int[6]; //사용자 로또 번호
		
		
		//System.out.println("당첨번호: ");
		printArray(random(lotto));
		System.out.printf("%n내 번호: %n");
		printArray(random(user));
		
		
	}//메인 메서드 끝
	
	/* 배열을 매개변수로 받아서 1~45까지 랜덤 수를 채워서 생성
	 * user 와 lotto 채우기
	 * 단, 같은 수가 나오면 안됨
	 */
	public static int[] random(int arr[]) {	
		for(int i=0; i<arr.length; i++) {
				arr[i]=(int)(Math.random()*10)+1;
				//System.out.println("뽑은값 : "+ arr[i]);
				for(int j=0; j<i; j++) {
					//System.out.println(arr[i]+ "==" + arr[j]);
					if(arr[i]==arr[j]) {
						System.out.println("중복!!!");
						i--;
						break;
					}
				}
		}
		return arr;
	}//랜덤 번호 메서드 끝
	
	/* 배열을 매개변수로 받아 배열을 출력하는 메서드
	 * 
	 * 
	 */
	public static void printArray(int arr[]) {
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}//번호 출력 메서드 끝
}
