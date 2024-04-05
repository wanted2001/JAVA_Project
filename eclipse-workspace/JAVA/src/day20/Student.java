package day20;

public class Student {
	
	//name,score만 가지는 클래스 생성
	private String name;
	private int score;
	//생성자,겟/셋,toString
	
	public Student() {}
	public Student(String a ,int b) {
		this.name =a;
		this.score =b;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "이름:" + name + "/ 점수:" + score;
	}
	
	

}
