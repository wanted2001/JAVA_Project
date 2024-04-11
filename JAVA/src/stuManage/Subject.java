package stuManage;

public class Subject {

	private String subName; // 과목명
	private int subTime; // 시수
	private String professor; // 교수명
	private String subScheduler; // 시간표

	public Subject() {

	}

	public Subject(String subName) {
		this.subName = subName;
	}

	public Subject(String subName, int subTime, String professor, String subScheduler) {
		this.subName = subName;
		this.subTime = subTime;
		this.professor = professor;
		this.subScheduler = subScheduler;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}

	@Override
	public String toString() {
		return "[과목명=" + subName + ", 시수=" + subTime + ", 담당교수=" + professor + ", 시간표=" + subScheduler + "]";
	}

}
