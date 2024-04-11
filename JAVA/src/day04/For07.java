package day04;

public class For07 {

	public static void main(String[] args) {
		/* 이중 For 문
		 * 
		 * 별찍기
		 * ***** 첫째줄 i ,별이 찍히는 j
		 * ***** 둘쨰줄 i ,별이 찍히는 j 
		 * ***** 이 밑에도 마찬가지
		 * *****
		 * *****
		 * for(int i = 0; i<=5; i++){ i = 1
		 * for (int j = 0; j<=5; j++){ j = 1~5 
		 *		실행문; }}
		 */
		int i,j;
		
		for(i = 1; i<=5; i++) { 
			for(j = 1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println(); //한 줄 끝나면 줄 바꿈
			
		}
		
		System.out.println("--------------------------------");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for( i = 1; i<=5; i++) {
			for( j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("---------------------------------");
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		
		for(i= 1; i<=5; i++) {
			for(j=1; j<=6-i; j++) {
				System.out.print("*");	
		}
		System.out.println();
		
		}
		
		System.out.println("------------------------------------");
		
		
		/*
		 *     *
		 *    **
		 *   *** 
		 *  ****
		 * *****
		 */
		
		for(i =1; i<=5; i++) {
			for(j = 1; j<=5-i; j++) {
			System.out.print(" ");
			}//공백
			for(int k= 1; k<=i; k++) {
				System.out.print("*");//별
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------");
		
		/*
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********    
		 */
		
		for (i = 1; i<=5; i++) {
			for(j = 1; j<=5-i; j++) {
				System.out.print(" ");
			}//j 공백
				for (int k = 1; k<=(i*2)-1; k++) {
					System.out.print("*");
				}//k 별
			System.out.println();
		}//i 줄
		
		System.out.println("----------------------------------");
		
		/* 123
		 * 456
		 * 789
		 * 
		 * 3줄 씩 3개 출력 
		 */
		
		int count = 0;
		for(i=1; i<=3; i++) {
			for(j=1; j<=3; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		
} 	
}

