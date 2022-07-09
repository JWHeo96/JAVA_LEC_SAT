/*
 * while, do while
 * 
 * 실행부 전에 조건식이 참인지부터 검증
 * while(조건식) {
 * 	조건식이 참일 경우, 반복실행
 * }
 * 
 * do 이하 실행식을 먼저 실행하고, while문의 조건식을 검증
 * (최소 한번은 실행)
 * do {
 * 	조건식이 참일 경우, 반복실행
 * } while(조건식)
 * 
 */
public class WhileLoopExample {

	public static void main(String[] args) {
		
		boolean goLoop = false;
		
		while(goLoop) {
			System.out.println("ㄱㄱㄱ!!");
		}
		
		do {
			System.out.println("하악!");
		} while(goLoop);
		
		int x = 10;
		while(x < 20) {
			//System.out.println(x);	// 무한루프
			System.out.println(x++);
		}
		
		x = 10;
		while(true) {
			System.out.println("x=" + x++);
			if( x == 20 ) break;
		}
		
	}
}
