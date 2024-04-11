package day06;

public class Array04 {

	public static void main(String[] args) {
		/*10개의 값을 가지는 배열을 생성한후
		 * 1~50 랜덤수를 배열에 저장 한후 출력
		 * 
		 * 
		 */
		
		int arr1[] = new int[10]; //배열의 초기값은 0이다.
		int max = 0;
		int min = 50;
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i]=(int)(Math.random()*50)+1;
			System.out.print(arr1[i]+" ");
			sum+=arr1[i];
			
			if(max<arr1[i]) { 
				max=arr1[i];
			}
			if (min>arr1[i]) {
				min=arr1[i];
			}
				//max = Math.max(max,arr1[i]);
				//min = Math.min(min,arr1[i]);
		}
		
		avg = sum/(double)arr1.length;
		System.out.printf("%n합계:"+sum +" 평균:"+avg+" 최대값:"+ max+" 최소값:"+min);

	}

}
