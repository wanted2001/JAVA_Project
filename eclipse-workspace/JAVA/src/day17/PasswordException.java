package day17;

public class PasswordException extends IllegalArgumentException{
	//사용자 정의 Exception 생성할떄 조건
	//IllegalArgumentException 사용자 정의 Exception 정의시 상속
	
	private static final long serialVersionID = 1L;
	
	public PasswordException(String message) {
		super(message);
	}

	
}
