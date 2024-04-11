package day05;

public class 과제5 {
	//과제 
	public static void main(String[] args) {
		/* arr1 배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 */
		
		int arr1 [] = new int[] {100,60,10,56,8,89,48,61,50,78};
		
		int sum = 0;
		//성적 데이터 (0~100)
		int min = 100;//가장작은값을 넣기 위한 변수
		int max = 0;//가장 큰 값을 넣기 위한 변수
		
		
		for(int i = 0; i<arr1.length; i++) {
			//(max<arr1[i]) {
				//max=arr1[i];
			//}
			//if(min>arr1[i]) {
				//min=arr1[i];
			//}
			sum+=arr1[i];
			
			max = Math.max(max,arr1[i]);
			min = Math.min(min,arr1[i]);
			
		}
		double avg = (double)sum/arr1.length;
		System.out.printf("합계 : %d 평균 : %.2f %n최대값 : %d  최소값 : %d%n",
				sum,avg,max,min);
		
		//System.out.printf("Math.max 사용: "+(int)Math.max(max,min)+"%n");
		//System.out.println("Math.min 사용: "+(int)Math.min(max,min));
		

	}

}
