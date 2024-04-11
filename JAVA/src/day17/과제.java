package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고 출력
		 * 합계를 출력
		 * 입력 : 45,78,89,97,68,57,48 => String
		 * list에 넣고, 출력 => 합계(인원수 출력)
		 * 70 이상 점수 개수 출력
		 */
		Scanner sc = new Scanner(System.in);
		String num = "45,78,89,97,68,57,48";
		String[] numarr = num.split(","); //","을 기준으로 나눠서 배열에 넣기
		int[] numarr1 =new int [numarr.length]; // 배열에 나눈걸 넣기위한 정수배열 생성
		ArrayList<String> score = new ArrayList<String>();
		int cnt = 0; // 점수 개수용
		int sum = 0; // 점수 합계용
		
		//문자열 num를 정수형으로 변환해서 정수형 배열에 넣기
		for (int i = 0; i < numarr.length; i++) { 
            numarr1[i] = Integer.parseInt(numarr[i]); 
            score.add(numarr[i]);
            if(numarr1[i]>=70) {
            	cnt++;
            }
            sum+=numarr1[i];
        }
		System.out.println(score);
		System.out.println("총점: "+sum+" / 70점이상: "+cnt);
		
		//Scanner 버전
		ArrayList<String> score1 = new ArrayList<String>();
		String a = "null";
		int sum1 = 0;
		int cn =0; //70점이상 개수 세기용
		
		while(!a.equals("종료")) {
			System.out.println("숫자를 입력하세요.");
			System.out.println("종료하려면 종료를 입력하세요");
			a=sc.next();
			String[] numstr = a.split(",");
			int[] numint = new int[numstr.length];
			if(a.equals("종료")) {
				break;
			}
		
		for(int i=0; i<numstr.length; i++) {
			numint[i]=Integer.parseInt(numstr[i]);
			if(numint[i]>=70) {
				cn++;
			}
			score1.add(numstr[i]);
			sum1+=numint[i];
		}
		
		}
		
		System.out.println(score1);
		System.out.println(sum1+"/"+cn);
		
		
		
		sc.close();
	}

}
