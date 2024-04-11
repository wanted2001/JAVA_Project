package stuManage;

public class Student {

	private String stdNum;
	private String stdName;
	private String stdPhone;
	private Subject[] subjectlist = new Subject[5];
	private int cnt = 0; // subject 배열의 index 역할

	public Student() {
	}

	public Student(String stdNum, String stdName, String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	// 메서드

	// 학생정보
	public void stdPrint() {
		System.out.println("학생명: " + stdName + "(" + stdNum + ") /" + stdPhone);
	}

	// 수강과목 => 배열로 여러개 존재한다.
	public void subPrint() {
		// subject 클래스의 toString를 호출해서 출력 (for문 사용
		if (cnt == 0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		// toString은 객체의 내용이 문자로 리턴 sysou(객체) => toString 호출
		for (int i = 0; i < cnt; i++) {
			System.out.println(subjectlist[i]); // toString 호출
		}

	}

	// 수강과목 추가 메서드
	// 수강과목에 대한 객체 Subject subject 배열에 해당 객체 담기
	public void insertSubject(Subject sub) {
		// 배열이 다 찼다면.. 배열을 늘리기
		// 배열은 길이를 정하면 변경 불가능.
		// 더 긴 길이의 배열을 생성해서 배열을 복사후 바꾸기.
		if (cnt == subjectlist.length) {
			Subject[] tmp = new Subject[subjectlist.length + 5];
			// 배열복사
			System.arraycopy(subjectlist, 0, tmp, 0, cnt);
			subjectlist = tmp;
		}
		subjectlist[cnt] = sub;
		cnt++;
	}

	// 수강과목 삭제 메서드
	public void deleteSubject(String subName) {
		// 수강과목 배열에서 subName을 검색하여 삭제
		int index = -1;
		if (subName == null) {
			return;
		}
		for (int i = 0; i < cnt; i++) {
			if (subjectlist[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}

		// 삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업
		for (int i = index; i < cnt - 1; i++) {
			subjectlist[i] = subjectlist[i + 1];
		}
		// 끝번지 null 처리
		subjectlist[cnt - 1] = null;
		// 한과목 삭제 과목 개수가 줄어듬
		cnt--;
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public Subject[] getSubjectlist() {
		return subjectlist;
	}

	public void setSubjectlist(Subject[] subjectlist) {
		this.subjectlist = subjectlist;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "[학번=" + stdNum + ", 학생명=" + stdName + ", 전화번호=" + stdPhone + "]";
	}

}
