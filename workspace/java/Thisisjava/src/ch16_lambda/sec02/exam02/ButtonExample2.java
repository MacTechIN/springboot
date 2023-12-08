package ch16_lambda.sec02.exam02;

/*
 * [문제]
 *  1. ClickListenerException 클래스를 만들어서 예외를 처리하라.
 */
public class ButtonExample2 {
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
		btnOk.click();
		System.out.println("[프로그램을 정상적으로 수행 했습니다.]");
	}
}