package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 과제1 {

	public static void main(String[] args) {
		//배열을 List로 구성할떄
		//같은 타입일떄 
		//List<Integer> list = new ArrayList<Integer>(Arrays.asList(해당arr);
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>");
		//String num = sc.next();
		String num = "45,78,89,97,68,57,48";
		String[] numbers = num.split(",");
		List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		
		//향상된 for문을 이해하기****
		for(String n : numbers) {
			list.add(Integer.parseInt(n));
		}
		System.out.println(list);
		int sum = 0;
		int count =0;
		for(int tmp : list) {
			sum+=tmp;
			if(tmp>=70) {
				count++;
			}
		}
		
		System.out.println(sum);
		System.out.println(count);
		
		
		sc.close();
		

	}

}
