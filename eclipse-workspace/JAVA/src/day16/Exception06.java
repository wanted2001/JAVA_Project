package day16;

public class Exception06 {

	public static void main(String[] args) {
		int start = 1, count = 10, size = 5;
		try {
			int arr[] = new int [5];
			ArrayFull(arr, start, count);
			
		}catch(NegativeArraySizeException e) { 
			System.out.println("배열의 길이는 음수가 될수 없습니다.");
		}
		System.out.println();
		System.out.println("-------------");
		
		int arr1[] = RandomArray(size, start, count); 
		for(int s : arr1) {
			System.out.print(s+" ");
		}
		 
		
	}
	
	//메서드 생성
	/* 기능 : size 를 매개변수로 입력받아 size 만큼의 길이를 가지는 배열을 생성하여 
	 * 랜덤 값을 채워 배열을 리턴
	 * 랜덤 값의 범위는 매개변수로 입력 start 값과  count 값을 받음
	 * size가 0보다 작다면 예외발생 throw new
	 * count가 0보다 작다면 예외발생
	 */
	public static int[] RandomArray(int size,int start,int count) throws RuntimeException{ // throws 굳이 안적어도 된다.
		if(size<=0||count<=0) {
			//예외 미리 발생 시키기
			throw new RuntimeException("Size 또는 Count는 0이나 음수가 될 수 없습니다.");
		}
			int arr[] = new int[size];
			for(int i =0; i<size; i++) {
				int ran = (int)(Math.random()*count)+start;
				arr[i]=ran;
			}
			return arr;	
	}
	
	/* 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤 값의 범위는 매개변수로 입력 start 값과  count 값을 받음
	 * 배열이 null 이면 예외발생
	 * 배열의 길이가 0보다 작다면 에외발생
	 */
	public static void ArrayFull(int arr[], int start, int count) {
		try {
			for(int i=0; i<arr.length; i++) {
				arr[i]=(int)(Math.random()*count)+start;
				System.out.print(arr[i]+" ");
			}
		}catch (NullPointerException e) {
			System.out.println("null이 될수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 길이가 넘어섰습니다.");
		}
	}

}
