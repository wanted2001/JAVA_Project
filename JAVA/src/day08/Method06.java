package day08;

public class Method06 {

	// 주어진 정수 배열을 콘솔에 출력하는 메서드
	// 매개변수 :배열
	// 리턴타입 : 출력=> void
	// 메서드명 : printArray
	// 5개씩 한줄에 나열
	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 5 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * 배열이 주어지면 배열을 오름차순 정렬하는 기능 매개변수 : 배열 리턴타입 : 없음 매서드명 : sortArray
	 */
	public static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) { //0번지부터 마지막 전번지까지만
			for(int j=i+1; j<arr.length; j++) { //i+1번지부터 마지막 번지까지
				if(arr[i]>arr[j]) { // > : 오름차순 , < : 내림차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	/*
	 * 정렬후 배열을 리턴
	 * 
	 */
	public static int[] sortArray1(int arr[]) { //이거는 arr[]를 리턴하는 케이스다.
		for (int i = 0; i < arr.length - 1; i++) { // 0번지부터 마지막 전번지까지만
			for (int j = i + 1; j < arr.length; j++) { // i+1번지부터 마지막 번지까지
				if (arr[i] > arr[j]) { // > : 오름차순 , < : 내림차순
					// 교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr; //배열을 한후 배열 리턴
	}
	
	/* randomArray 
	 * 배열을 생성하며 [10개] 랜덤값(1~50)까지을 채우고 배열을 리턴 
	 * 매개변수 : x
	 * 리턴타입 : 배열
	 */
	
	public static int[] randomArray() {
		int arr3[] = new int[10];
		for(int i=0; i<arr3.length; i++) {
		arr3[i]=(int)(Math.random()*50)+1;;
		}
		return arr3;
	}

	public static void main(String[] args) {
		//
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 11, 12, 13, 14 };
		int arr2[] = new int[] { 63,21,26,151, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 11, 12, 13, 14 };
		
		printArray(arr);
		System.out.println();
		sortArray(arr);
		System.out.println("---정렬후---");
		printArray(arr);
		System.out.println();
		System.out.println("---배열리턴---");
		sortArray1(arr);
		
		//밑에는 같은 의미이다.
		int arr1[]=sortArray1(arr);//버블 정렬
		printArray(arr1);//리턴받은 버블정렬을 arr1에 담아서 printArray메서드로 출력
		System.out.println();
		System.out.println("---다른 배열---");
		printArray(sortArray1(arr2)); //위 내용을 합쳐서 메서드로만 출력 
		//위아래가 같은 내용이다.
		System.out.println();
		System.out.println("---랜덤값 생성---");
		printArray(sortArray1(randomArray())); //리턴해서 메인으로 가져와 해야하니 sort1를 써야한다.
	}

}
