package day05;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력 할 수 있는 배열을 생성
		 * 5명의 점수를 입력받아서 배열에 저장
		 * 해당 점수를 출력 => 점수의 합계를 출력 // 평균
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int arr1[] = new int[10];
		int sum = 0;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("(%d)번째 들어갈 수를 입력하세요>%n",i+1);
			arr1[i] = scan.nextInt();
			sum+=arr1[i];
		}
		double avg = sum/(double)arr1.length; // double 두번 넣으면 왜 안되는가...	 %f로 값을 줘야한다.
		System.out.printf("총점은 %d점 입니다.%n",sum);
		System.out.printf("평균은 %f점 입니다.",avg);
		
		
		/*for(int i=0; i<arr1.length; i++)
		System.out.printf("(%d)번째 값 : " + arr1[i] +" 입니다.%n",i+1);*/
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
