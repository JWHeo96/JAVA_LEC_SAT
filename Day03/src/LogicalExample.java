/**
 * 논리 연산자
 * @author TJ
 *
 * 
 */
public class LogicalExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 11;
		int c = 15;
		int d = 3;
		
		boolean result = a > b;
		result = result && c > d;
		// result = false && true; -> false
		System.out.println(result);
		
		// And 연산은 두 항이 모두 참일때만 참
		result = true && true;	//이 때만 참
		//--------------------------------------------------
		// OR 연산은 두 항 중 하나만 참이여도 참
		result = false || true ;
		System.out.println("false || true = " + result);
		result = true || false;
		System.out.println("true || false = " + result);
		result = true || true;
		System.out.println("true || true = " + result);
		//--------------------------------------------------
		// XOR 연산은 두 항 중에 하나만 true 일때만 true
		result = true ^ false;
		System.out.println("true ^ false = " + result);
		result = false ^ true;
		System.out.println("false ^ true = " + result);
		//--------------------------------------------------
		// NOT 연산은 ! 반대 // !true -> false, !false -> true
		result = false;
		System.out.println("!result = " + !result);
		
		System.out.println(!(10 > 1));
		
		// And, Or 연산 
		int x = 10;
		int y = 20;
	
		result = (x * 100 > y * 100) && (++x > ++y);	// result = 거짓 && -> 뒤를 안봐도 무조건 거짓 따라서, 
														// 뒤의 연산 (++x > ++y)를 실행하지 않는다.
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		result = (x * 100 > y * 100) & (++x > ++y);	// result = 거짓 & -> 뒤를 안봐도 무조건 거짓이지만,
													// 뒤의 연산도 수행을 해버린다.
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		result = (x * 100 < y * 100) || (++x > ++y);
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		result = (x * 100 < y * 100) | (++x > ++y);
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// AND 연산2
		// x = 12, y = 22 
		result = (x < y) && (x++ < y--);
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// x = 13, y = 21
		result = (x > y) || (x++ < y--);
		System.out.println("result = " + result);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
	}
	
}
