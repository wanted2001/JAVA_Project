package day05;

public class Array01 {

	public static void main(String[] args) {
		/* 배열 : 같은 타입 , 같은 의미를 가지는 변수들의 집합 (참조 변수)
		 * 객체를생성하는 키워드 => new 
		 * 
		 * -배열을 선언하는 방법
		 * 1. 타입[] 배열이름;
		 * 2. 타입 배열이름[];
		 * 
		 * index 번호 : 0번지 부터 시작
		 * -선언하고 초기화를 하는 방법 : 객체는 생성하면 자동으로 초기화 해줌.
		 * 타입[] 배열이름 = new 타입[길이]; 가장 많이 사용하는 방식
		 * 타입[] 배열이름 = new 타입{값, 값, 값, 값,};
		 * 
		 * 연습할때 사용한다 자주 사용하지는 않는다.
		 * 타입[] 배열이름 = {값, 값, 값, 값};
		 * 
		 * -배열의 길이는 0 이상이여야 한다.
		 * -배열의 시작번지는 0부터 시작한다.
		 * -배열[5] =>0, 1, 2, 3, 4
		 * -배열의 길이는 length로 구한다. 총길이를 이용하면 배열의 길이를 알수있다.
		 */
		
		int arr1[]; // 선언만 경우
		arr1 = new int [5]; // 객체를 생성한 경우 초기화했다.
		int arr2[] = new int [5]; // 일반적으로 가장 많은 쓰는 케이스
		int arr3[] = new int[] {1,2,3,4,5}; // 이것도 마찬가지
		int arr4[] = {1,2,3,4,5,6,7};// 연습할때 쓴다.
		
		/* 배열을 사용하는 이유
		 * - 관리가 편함.
		 * - 반복문을 사용할 수있기 때문에 많은 양의 데이터 쉽게 관리(사용)할수있음.
		 * 배열의 길이는 배열이름.length
		 * 배열의 index는 0부터 시작
		 * 길이가 5라면, 0 1 2 3 4
		 * 마지막 번지는 항상 길이 -1
		 */
		
		//배열의 값을 출력
		System.out.println(arr1);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		for(int i=0; i<arr3.length; i++) { 
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println();
		System.out.println("--------------------");
				
		//arr4를 출력		
		for(int i=0; i<arr4.length; i++) {
			System.out.print(arr4[i]+" ");	
		}
		System.out.println(arr3[0]);
		arr3[0]=10;
		System.out.print(arr3[0]+" ");
		arr3[1]=20;
		for(int i=0; i<arr3.length; i++) { 
			System.out.print(arr3[i]+" ");
		}
		
		arr1[0]=5;
		arr1[1]=6;
		arr1[2]=7;
		arr1[3]=8;
		arr1[4]=9;
		System.out.println();				
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");	
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = i+10;
			System.out.print(arr2[i]+" ");
		}
		
		/* arr5 배열 생성 후 1~5까지의 값을 저장하고 출력
		 * 
		 */
		System.out.println();
		int arr5[]= new int[5];
		
		for(int i=0; i<arr5.length; i++) {
			arr5[i]=i+1;
			System.out.print(arr5[i]+" ");
		}
		
		

		
		
		
		
		
		
	}

}
