package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 10개의 배열을 담을 수있는 arr 생성
		 * 1~10까지 값을 입력한 후 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			//i = scan.nextInt();
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int s :arr) {
			System.out.print(s+" ");
		}
		
		//배열을 섞는 코드
		//랜덤한 번지를 선택해서 순차적으로 하나씩 교환
		//(int)(Math.random()*10)+0 // 0부터 10개의 랜덤수 출력
		//max = 최종번지 개수 , min = 첫번지
		//교환코트 
		//[i][i+1]
		/*int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1]= temp;*/
		int min = 0;
		int max = arr.length;
		for(int i=0; i<arr.length; i++) {
			int ran = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr[i]=arr[ran];
			arr[ran]=temp;
		}
		System.out.println();
		
		System.out.println("---섞은후 값 보기---");
		for(int temp :arr) {
			System.out.print(temp+" ");
		}
		
		//섞은 값을 원래대로 정리(정렬)
		//작은 수부터 정리 = 오름차순정렬
		//큰 수부터 정리 = 내림차순정렬
		//버블 정렬 : 해당 번지보다 작은 값이 있으면 위치를 변경
		//3 2 5 6 7 1 9 4 10 8
		//1 3 5 6 7 2 9 4 10 8 -pass 1
		//1 2 5 6 7 3 9 4 10 8 -pass 2
		//1 2 3 6 7 5 9 4 10 8 -pass 3
		//1 2 3 4 7 6 9 5 10 8 -pass 4
		//1 2 3 4 5 7 9 6 10 8 -pass 5
		//1 2 3 4 5 6 9 7 10 8 -pass 6 
		//1 2 3 4 5 6 7 9 10 8 -pass 7
		//1 2 3 4 5 6 7 8 10 9 -pass 8 
		//1 2 3 4 5 6 7 8 9 10 -pass 9 
		
		System.out.println();
		System.out.println("---정렬후 값 보기---");
		
		for(int i=0; i<arr.length-1; i++) { //0번지부터 마지막 전번지까지만
			for(int j=i+1; j<arr.length; j++) { //i+1번지부터 마지막 번지까지
				if(arr[i]<arr[j]) { // > : 오름차순 , < : 내림차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					System.out.print(arr[i]+" ");
					System.out.print(arr[j]+" ");
					System.out.print(tmp+" ");
				}
				
				
			}
			
	
		}
		
		for(int tmp :arr) {
			System.out.print(tmp+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
