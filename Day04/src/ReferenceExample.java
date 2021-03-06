/**
 * 참조자료형 특징
 * @author TJ
 * 지금까지 쓴 예제에서 사용한 "참조자료형"은 2가지
 * 1. String(문자열)
 * 2. [] (배열)
 */
public class ReferenceExample {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = "홍길동";
		System.out.println(name == name2);	
		// String pool 홍길동 객체 하나 생성
		// name, name2 공유 (주소값은 하나) -> 따라서 name == name2는 true
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4);	// 주소값 비교
		System.out.println(name3.equals(name4));	// 오직 순수값(pure_value)만 비교
		
		// new 키워드를 통해서 각자 다른 객체를 생성
		// name3, name4 각자 주소 복사
		// 따라서 name3 == name4는 주소가 다르기 때문에 false
		// 값을 비교하기 위해서는 equals() 라는 메서드를 사용
	
	}
}
