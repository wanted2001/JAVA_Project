package day12;

public class Class05 {
	
	/* 객체를 생성시 값을 초기화하는 방법
	 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * - 기본값: 기본적으로 지정되는 값. 숫자면 0, 문자면 null
	 * - 명시적 초기값: 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 		private String name = "윤지명"
	 * - 초기화 블럭: { } 멤버변수를 초기화 하는 방법
	 * - 생성자: 객체를 생성할떄 초기화해서 생성하는 값
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		EzenStudent E0 = new EzenStudent();//값을 입력주고 생성한 버전
		E0.setName("윤지명");
		E0.setPhoneNum("456");
		//System.out.println(E0);// toString이 있으면 객체만 있어도 찍어준다.
		
		EzenStudent E1 = new EzenStudent("강남","홍길동", "010", true,"sql");//생성자에 값이 있으면 쓰고 없으면 초기에 설정한 값이나 기본값을 설정한다. **
		//System.out.println(E1);
		
		EzenStudent E2 = new EzenStudent();
		E2.setName("제주도");
		//System.out.println(E2);
		
		EzenStudent E3 = new EzenStudent("천안","무명","111",true,"sql");//생성자에 값을 주고 뽑는 버전
		//System.out.println(E3);
		
		EzenStudent E4 = new EzenStudent();//초기값 버전
		//System.out.println(E4);
		
		//학생정보를 담을 배열을 생성
		//studentArr
		EzenStudent[] studentArr = new EzenStudent [5];
			studentArr[0]=E0;
			studentArr[1]=E1;
			studentArr[2]=E2;
			studentArr[3]=E3;
			studentArr[4]=E4;
			//영이 학생이 듣고 있는 과목을 출력
			for(int i=0; i<studentArr.length; i++) {
			String searchName ="윤지명";
			if(studentArr[i].getName().equals(searchName)) {
				System.out.println("---"+searchName+" 학생이 이용하는 지점---");
				System.out.println(studentArr[i].getGigum());
			}
			//무명 학생 전화번호 변경
			String mu = "무명";
			if(studentArr[i].getName().equals(mu)) {
				studentArr[i].setPhoneNum("1234");
				System.out.println(studentArr[i]);
			}
			//카드있는 사람의 명단
			String sub = "파이썬";
			int cnt = 0;
			 if(studentArr[i].getSub().equals(sub)) {
				 System.out.println(studentArr[i]);
				 cnt++;
			 }
			 if(cnt==0) {
				 System.out.println("명단이 없습니다.");
			 }
		}//for 문 괄호	
			
		
	}//메인 괄호

}//클래스 괄호
class EzenStudent {
	//학생의 정보를 생성하는 클래스
	private String gigum = "incheon";//명시적 초기값
	private String name;
	private String phoneNum;
	private boolean Iscard;
	private String sub;
	
	//생성자
	
	public EzenStudent() {}

	
		
	public EzenStudent(String gigum,String name, String phoneNum, boolean iscard,String sub) {
		//super();//내 부모 클래스 생성자를 호출 해온것
		this.gigum = gigum;
		this.name = name;
		this.phoneNum = phoneNum;
		this.Iscard = iscard;
		this.sub = sub;
	}
	
	//toString
	@Override
	public String toString() {
		return gigum+">"+name+"("+ phoneNum + "/" + Iscard + ")"+sub;
	}
	{
		//초기화 블럭 영역
		gigum = "인천";
		name = "이름없음";
		phoneNum = "123";
		sub="java";
		
	}
	
	public void print() {
		System.out.printf("학생이름: "+name+"%n전화번호: "+phoneNum+"%n카드유무: "+Iscard+"%n");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public boolean isIscard() {
		return Iscard;
	}
	public void setIscard(boolean iscard) {
		Iscard = iscard;
	}
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	
	
	
}
