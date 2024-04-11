package day16;

public class Exception03 {

	public static void main(String[] args) {
		
		/* 자주 발생하는 예외 코드들
		 * ArithmethticException : 0으로 나누었을때 수학적으로 에러가 있을때
		 * ArrayIndexOutOfBoundsException : 배열의 index가 범위를 벗어낫을떄
		 * NullPointerException : 객체의 값이 null일 경우 혹은 객체 자체가 없을 경우
		 * ClassCastException : 다운 캐스팅이 잘못됐을떄 형변환 에러
		 * NegativeArraySizeException : 배열의 길이가 음수일때 발생하는 에러
		 */
		
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int arr2[] = null;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
