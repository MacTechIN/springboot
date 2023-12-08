package ch16_lambda.sec02.exam03_exception;

/*
 * [문제] 사용자 정의 예외처리
 *  1. ClickListener가 지정되지 않아 발생하는 예외를 처리하라.
 *  2. 예외 클래스는 ClickListenerException로 정의하라.
 *  3. Button.setClickListener()이 지정되지 않아도 비정상 종료를 하지 않도록 하라.
 *  4. 예외가 발생하면 "리스너가 등록되지 않았습니다"라는 메시지를 출력하라.
 */
public class ButtonExceptionExample {
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		// Ok 버튼 객체 생성
		Button btnOk = new Button();

		// Ok 버튼 객체에 람다식(ClickListener 익명 구현 객체) 주입
		/*
		btnOk.setClickListener(() -> {
			System.out.println("Ok 버튼을 클릭했습니다.");
		});
		*/

		// Ok 버튼 클릭하기
		try {
			btnOk.click();
		}
		catch(ClickListenerException e) {
			System.out.println("[예외발생] " + e.getMessage());
		}

		System.out.println("[프로그램을 정상적으로 수행 했습니다.]");
	}
}