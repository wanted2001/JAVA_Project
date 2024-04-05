package day12;
/* 학생정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름 생년월일 전화번호 나이
 * - 학원 기본정보 : 학원명 = "EZEN" (final static),지점
 * - 수강 기본정보 : 수강과목, 기간 
 *  	=> 여러과목을 들을 수있음(여러과목을 수강하기 위해서는 배열로 처리 5과목까지 가능)
 * ex) 홍길동 000101 010-1111-1111 25
 * 		EZEN(인천)
 * 		자바 6개월, 파이썬 1개월, 빅데이터 3개월 //뜨는 문구 완성
 * 
 * 
 * - 기능(메서드)
 * - 기본정보를 출력하는 기능 이거 완성
 * - 학원정보를 출력하는 기능 이거 완성
 * - 수강정보를 출력하는 기능
 * - 학생의 수강정보를 추가하는 기능
 */
public class 과제1 {

	public static void main(String[] args) {
		Student1 st = new Student1();
		st.setName("홍길동");
		st.setPhone("1111");
		st.setBranch("incheon");
		//st.printInfo();
		//st.printCompany();
		//st.printCourse();
		
		Student1 st1 = new Student1("hong","2222","incheon");
		//st1.printInfo();
		//st1.printCompany();
		st1.insertCourse("자바", "1개월");
		st1.insertCourse("파이썬", "1개월");
		//st1.printCourse();
		
		Student1 st2 = new Student1("pack","1111","010-1111-1111",25,"seoul");
		//st2.printInfo();
		//st2.printCompany();
		st2.insertCourse("html", "3개월");
		//st2.printCourse();
		

		Student1[] std = new Student1[8];
		std[0]=st;
		std[1]=st1;
		std[2]=st2;
		std[3]=new Student1("짱아","010-1111-1111","incheon");
		std[3].insertCourse("자바","1개월");
		std[4]=new Student1("짱구","010-1111-1111","incheon");
		std[4].insertCourse("html","1개월");
		std[5]=new Student1("철수","010-1111-1111","busan");
		std[5].insertCourse("html","1개월");
		std[6]=new Student1("유리","010-1111-1111","ulsan");
		std[6].insertCourse("html","1개월");
		std[7]=new Student1("훈이","010-1111-1111","daegu");
		std[7].insertCourse("파이썬","1개월");
		
		System.out.println("------------------------------");
		String searchName ="훈이";
		String searchBranch ="incheon";
		String sub = "자바";
		//훈이 학생의 학생 ,학원, 수강정보 출력
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompany();
			}
		//인천지점의 학생들을 모두 출력
			if(std[i].getBranch()!=null&&std[i].getBranch().equals(searchBranch)) {
				std[i].printInfo();
			}
		}
		
		System.out.println("------------------------------");
		//java 과목을 수강하는 학생들만 검색하여 학생정보/학원정보 출력
		for(int i=0; i<std.length; i++) { //배열 순회용
			for(int j=0; j<std[i].getCourse().length; j++) {
				if(std[i].getCourse()[j]!=null&&std[i].getCourse()[j].equals(sub)) {
					std[i].printInfo();
					std[i].printCompany();
				}
			}
		}
		//위아래 같은 답 다른 느낌의 포문
		int cnt = 0;
		while(cnt < std.length) {
			for(int i =0; i<std[cnt].getCourse().length;i++){
				if(std[cnt].getCourse()!=null) {
					if(sub.equals(std[cnt].getCourse()[i])) {
						std[cnt].printInfo();
					}
				}
			}
			cnt++;
		}
		
		
	}
	
		

}
class Student1{
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN";
	private String branch;
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //수강기간
	private int cnt; //배열의 index 처리용 번지
	
	//생성자
	public Student1() {
		
	}
	public Student1(String name , String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch =branch;
	}
	
	public Student1(String name,String birth,String phone,int age,String branch) {
		this(name,phone,branch); //생성자 호출 
		this.birth = birth;
		this.age = age;
	}
	//메소드
	public void printInfo() { //학생의 기본정보
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+"("+age+"세 "+birth+")/"+phone);
	}
	public void printCompany() {
		System.out.println("==학원정보==");
		System.out.println("학원명:"+COMPANY+"/"+branch);
	}
	
	//수강정보 출력
	public void printCourse() {
		//cnt 까지만 출력 => 추가되지않은 값은 출력이 안되게끔
		if(course.length ==0 || cnt==0) { //등록한 과목이 없다.
			System.out.println("수강과목이 없습니다.");
			return; //여기서 메서드 종료
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("과정:"+course[i]+"("+period[i]+")");
		}
	}
	
	//수강정보 등록
	//insertCourse()
	//매개변수 course,period 주고 => 배열에 추가(배열에 완성, 리턴되는 값은 없음)
	public void insertCourse(String course,String period) {
		//cnt =0
		if(cnt>=5) {
			//배열을 늘려서 더많은 수강을 받을수 있음.(배열 복사)
			System.out.println("더 이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt]=course;
		this.period[cnt]=period;
		cnt++;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public static String getCompany() {
		return COMPANY;
	}
	
	
	
	
	
		
	
}
