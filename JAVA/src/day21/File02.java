package day21;

public class File02 {

	public static void main(String[] args) {
		// System.in을 이용하여 알파벳을 하나를 쓰고
		//Enter를 누르면 알파벳을 콘솔에 찍기
		
		System.out.println("알파벳 입력>");
		try {
			int i;
			while((i=System.in.read())!='\n') {
				System.out.println((char)i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
