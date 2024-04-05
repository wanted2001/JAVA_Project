package std;
//1번

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Student {
	// 멤버변수 : 이름, 나이, 전화번호, map(과목,점수), 합계, 평균
	// 생성자, 메서드, getter/setter, 출력메서드
	// 메서드- 출력메서드(학생정보와 과목점수(성적표), 합계, 평균);
	// 메서드- ㅡmap(과목,점수) 데이터를 추가 메서드 put
	// 메서드- ㅡmap(과목,점수) 데이터를 삭제 메서드 remove

	private String name;
	private int age;
	private String Stdphone;
	private HashMap<String, Integer> map = new HashMap<>();
	private String sub;
	private int score;
	private int sum = 0;
	private double avg = 0;

	// 멤버변수는 private / 메서드 public
	// 클래스명은 대문자로 시작 / 변수명,메서드명은 소문자로 시작
	// 변수명,메서드명에 단어가 많아지면 다음 시작단어 대문자(카멜케이스 기법)
	// indent : 들여쓰기 잘 맞추기

	public Student() {

	}

	public Student(String name, int age, String Stdphone) {
		this.name = name;
		this.age = age;
		this.Stdphone = Stdphone;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStdphone() {
		return Stdphone;
	}

	public void setStdphone(String stdphone) {
		this.Stdphone = stdphone;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Stdphone, age, avg, map, name, score, sub, sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소가 내 객체의 주소와 같다면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 클래스 정보가 다르다면 false
			return false;
		Student other = (Student) obj; // 부모객체로 들어온 오브를 Student 객체로 변환해서 other에 넣어서 사용
		return Objects.equals(name, other.name); // 그리고 이것은 이름만 같으면 true 를 반환해준다.ㄹㄹ
	}

	// 메서드- 출력메서드(학생정보와 과목점수(성적표), 합계, 평균);
	public void printStd() {
		System.out.println("======학생 정보======");

		System.out.println("이름:" + name + "(" + age + ") /" + Stdphone);
		Iterator<String> it = map.keySet().iterator();
		int sum = 0;
		int cnt = 0; // 과목 카운트
		System.out.println("-------과목정보------");
		while (it.hasNext()) {
			cnt++;
			String tmp = it.next();
			System.out.println("과목:" + tmp + " /" + map.get(tmp));
			sum += map.get(tmp);
			avg = sum / cnt;
		}
		if (cnt <= 0) {
			System.out.println("아직 과목이 없습니다.");
			return;
		}
		System.out.println("합계:" + sum + " 평균:" + avg);
	}

	// 메서드- ㅡmap(과목,점수) 데이터를 추가 메서드 put
	public void addMap(String sub, int score) {
		map.put(sub, score);
	}

	// 메서드- ㅡmap(과목,점수) 데이터를 삭제 메서드 remove
	public void removesub(String sub) {
		map.remove(sub);
	}
}
