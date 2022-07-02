/**
 * Type Casting (형변환)
 * @author TJ
 *
 */
public class VariableCasting {

	//-- Java Application Starting Point (Entry Point)
	public static void main(String[] args) {
		//--  묵시적(자동) 형변환
		byte a = 127;
		short b = a;	// short(2) > byte(1) 
		
		long c = 1000;
		float d = c;	// 실수형은 정수형보다 무조건 크다.
		
		System.out.println("long to float(묵시적) : " + d);
		
		//-- 명시적(강제) 형변환 > 큰 곳에서 작은 곳으로 갈 때
		short aa = 127;
		byte bb = (byte)aa;
		
		System.out.println("short to byte(명시적) : " + bb);
		
		aa = 128;
		bb = (byte)aa;
		System.out.println("short to byte(명시적) byte 범위 넘김 : " + bb);
		
		String tel = "010-2222-3333";
		String tel2 = "01022223333";

		
		//-- 실수=> 정수로 형변환을 하는 경우에는
		//-- 소숫점 이하 버림.
		double aaa = 3.141562;
		int bbb = (int)aaa;
		System.out.println("double to float : " + bbb);
		
		
	}

}