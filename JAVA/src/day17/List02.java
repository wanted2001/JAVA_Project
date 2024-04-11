package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 정렬하여 출력
		 */
		String arr1[] = new String[] {"a","c","f","b"};
		String arr2[] = new String[] {"d","g","h","k"};
		
		ArrayList<String>arr3 = new ArrayList<String>();
		
		for(int i=0; i<arr1.length; i++) {
			arr3.add(arr1[i]);
		}
		for(int j=0; j<arr2.length; j++) {
			arr3.add(arr2[j]);
		}
		
		arr3.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1); //내림차순
			}
		});
		
		System.out.println(arr3);
//		
//		int cnt = arr1.length + arr2.length;
//		int z=0 ,k=0;
//		
//		while(cnt<arr3.size()) {
//			if(z<arr1.length) {
//				arr3.add(arr1[z]);
//				z++;
//				
//			}
//			if(k<arr2.length) {
//				arr3.add(arr2[k]);
//				k++;
//			}
//		}
		
		Collections.sort(arr3); //오름차순
		System.out.println(arr3);
		
		
		
		

	}

}
