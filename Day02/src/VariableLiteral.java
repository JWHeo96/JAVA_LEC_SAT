/**
 * 리터럴 ( escape sequence )
 * @author TJ
 *
 */
public class VariableLiteral {

	public static void main(String[] args) {
		
		// 1. 문자열 나는 "이종석" 입니다.
		System.out.println("나는 \"이종석\" 입니다.");
		System.out.println("나는 '이종석' 입니다.");
		
		// 2. *를 그리는데 7칸씩 띄워서 출력하고 싶다.
		// *	*	*
		// \t (tab)
		System.out.println("*	*	*");
		//or
		System.out.println("*\t*\t*");
		
		// 3. * 3개 찍는데 밑으로 직고 싶다.
		// \n (new line)
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		//or
		System.out.println("*\n*\n*");
		
		// \r\n
		
	
	}
}
