package stuManage;

import java.util.Scanner;

public class StudentManager implements Program {

	private Student[] studentlist = new Student[5];
	// index 처리 변수
	private int stdCnt;

	@Override
	public void printStudent() {
		System.out.println("------------전체 학생 정보----");
		for (int i = 0; i < stdCnt; i++) {
			studentlist[i].stdPrint();
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		// 1명의 학생정보를 입력받아서 객체를 생성한후 studentlist에 추가
		System.out.println("학번>");
		String stdnum = sc.next();
		System.out.println("학생명>");
		String stdName = sc.next();
		System.out.println("전화번호>");
		String stdPhone = sc.next();

		// 입력받은 값을 객체로 생성
		Student s = new Student(stdnum, stdName, stdPhone);

		if (stdCnt == studentlist.length) { // 배열복사 사용 방법 *****
			Student[] tmp = new Student[studentlist.length + 5];
			System.arraycopy(studentlist, 0, tmp, 0, stdCnt);
			studentlist = tmp;
		}
		studentlist[stdCnt] = s;
		stdCnt++;

	}

	@Override
	public void searchStudent(Scanner sc) {
		// 검색할 학생이름을 입력받아 배열에서 탐색후 있다면
		// 학생정보 + 수강정보 출력
		System.out.println("검색할 학생명>");
		String searchName = sc.next();
		for (int i = 0; i < stdCnt; i++) {
			if (searchName.equals(studentlist[i].getStdName())) {
				studentlist[i].stdPrint();
				studentlist[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
	}

	@Override
	public void registerSubject(Scanner sc) {
		// 누가 무슨 과목을 추가할지를 설정
		// 수강 신청 할 학생이름을 입력받아 학생의 위치를 탐색 후
		// 그 학생의 배열에 수강과목[]을 추가
		// 수강과목의 객체를 생성
		// Student 클래스에(해당 배열에 추가)
		System.out.println("수강신청할 학생명>");
		String name = sc.next();
		int index = -1;
		// 학생의 위치 확인
		for (int i = 0; i < stdCnt; i++) {
			if (name.equals(studentlist[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학생이 없다면
		if (index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		System.out.println("수강신청 과목>");
		String sName = sc.next();
		Subject s = new Subject(sName);
		studentlist[index].insertSubject(s);

	}

	@Override
	public void deleteSubject(Scanner sc) {
		System.out.println("수강삭제할 학생명>");
		String name = sc.next();
		int index = -1;
		// 학생의 위치 확인
		for (int i = 0; i < stdCnt; i++) {
			if (name.equals(studentlist[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학생이 없다면
		if (index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		System.out.println("수강삭제 과목>");
		String sName = sc.next();
		// 해당 학생의 수강삭제 메서드 호출
		studentlist[index].deleteSubject(sName);

	}

}
