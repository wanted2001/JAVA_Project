package std;

import java.util.ArrayList;
import java.util.Scanner;

//3번
public class StdManager implements StdProgram {

	ArrayList<Student> Stulist = new ArrayList<>();
	private int stdcnt; // 학생리스트 에 사용
	
	public StdManager() {
	}

	@Override
	public void printStd() {
		for (int i = 0; i < stdcnt; i++) {
			Stulist.get(i).printStd();
		}

	}

	@Override
	public void addStd(Scanner sc) {
		System.out.println("학생입력>");
		String name = sc.next();
		System.out.println("나이입력>");
		int age = sc.nextInt();
		System.out.println("전화번호입력>");
		String phone = sc.next();

		Student s = new Student(name, age, phone);
		Stulist.add(s);
		stdcnt++;
	}

	@Override
	public void modStd(Scanner sc) {
		System.out.println("찾으시는 학생입력>");
		String name = sc.next();
		for (int i = 0; i < stdcnt; i++) {
			if (Stulist.get(i).getName().equals(name)) {
				System.out.println("나이입력>");
				int age = sc.nextInt();
				Stulist.get(i).setAge(age);
				System.out.println("전화번호도 수정하시겠습니까? (Y/N)");
				String an = sc.next();
				if (an.equals("Y") || an.equals("y")) {
					System.out.println("전화번호 입력>");
					String phone = sc.next();
					Stulist.get(i).setStdphone(phone);
				}
				System.out.println("수정완료");
				return;
			}
		}
			System.out.println("찾으시는 학생이 없습니다.");
			return;

	}

	@Override
	public void delStd(Scanner sc) {
		System.out.println("삭제하려는 학생 입력>");
		String name = sc.next();
		for (int i = 0; i < stdcnt; i++) {
			if (Stulist.get(i).getName().equals(name)) {
				Stulist.remove(i);
				stdcnt--;
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("찾으시는 학생이 없습니다.");
		
//		boolean res = Stulist.remove(name);
//		if(!res) {
//			System.out.println("학생이 없습니다.");
//			return;
//		}
//		System.out.println("학생 삭제 완료"); object로 삭제하는 방법 true /false 로 리턴해준다.

	}

	@Override
	public void searchStd(Scanner sc) {
		System.out.println("찾으시는 학생 입력>");
		String name = sc.next();
		for (int i = 0; i < stdcnt; i++) {
			if (Stulist.get(i).getName().equals(name)) {
				Stulist.get(i).printStd();
				return;
			}
		}
		System.out.println("찾으시는 학생이 없습니다.");

	}

	@Override
	public void addSub(Scanner sc) {
		System.out.println("입력하려는 학생을 입력>");
		String name = sc.next();
		for (int i = 0; i < stdcnt; i++) {
			if (Stulist.get(i).getName().equals(name)) {
				System.out.println("과목입력>");
				String sub = sc.next();
				System.out.println("점수입력>");
				int score = sc.nextInt();
				if (score > 100) {
					System.out.println("점수는 100을 넘을수 없습니다.");
					return;
				}
				Stulist.get(i).addMap(sub, score);
				System.out.println("입력완료");
				return;
			}
		}
		System.out.println("찾는 학생이 없습니다.");

	}

	@Override
	public void modSub(Scanner sc) {
		System.out.println("입력하려는 학생을 입력>");
		String name = sc.next();
		for (int i = 0; i < stdcnt; i++) {
			if (Stulist.get(i).getName().equals(name)) {
				System.out.println("수정하려는 과목 입력>");
				String sub = sc.next();
				if (Stulist.get(i).getMap().containsKey(sub)) {
					System.out.println("점수입력>");
					int score = sc.nextInt();
					if (score > 100) {
						System.out.println("점수는 100을 넘을수 없습니다.");
						return;
					}
					Stulist.get(i).addMap(sub, score);
					System.out.println("수정완료");
					return;
				}System.out.println("찾으시는 과목이 없습니다.");
				return;
			}System.out.println("찾으시는 학생이 없습니다.");
		}
	}

	@Override
	public void delSub(Scanner sc) {
		System.out.println("삭제하려는 학생을 입력>");
		String name = sc.next();
		for (int i = 0; i <stdcnt; i++) {
			if (Stulist.get(i).getName().equals(name)) {
				System.out.println("삭제하려는 과목 입력>");
				String sub = sc.next();
				if (Stulist.get(i).getMap().containsKey(sub)) {
					Stulist.get(i).removesub(sub);
					System.out.println("삭제완료");
					return;
				}System.out.println("찾으시는 과목이 없습니다.");
				return;
			}System.out.println("찾으시는 학생이 없습니다.");
		}
	}
	
	
	
}
