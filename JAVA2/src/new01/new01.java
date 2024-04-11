package new01;

public class new01 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// 홍길동 주민등록 번호 881122 - 1234567이다
		// 출력형태 => 생년월일 : 881122, 성병 : 남
		
		String num = "881122-2234567";
		String birth = num.substring(num.indexOf('-')+1,num.lastIndexOf('-')+2);
		String gender = (birth.equals("1")? "남" : (birth.equals("3")? "남" : "여"));
		System.out.printf("생년월일 : "+ num + "%n" +"성별 : "+ gender );
		
		
		

		
	}

}
