package day20;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		// 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		
		int[] arr = {1,8,4,5,7,8,9,6,5,4,1,2,36,8,2,4};
		
		Arrays.stream(arr)
		.filter(n->(n%2==0))
		.distinct()
		.sorted()
		.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		//배열로 리턴
		int tmp[]=Arrays.stream(arr)
		.filter(a->(a%2==0))
		.distinct()
		.sorted()
		.toArray();
		
		for(int i:tmp) {
			System.out.print(i+" ");
		}

	}

}
