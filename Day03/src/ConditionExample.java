/*
 * 조건문(Condition)
 * -> 1. if 구문 2. Switch 구문
 * if(조건식) {
 * 	... 실행문
 * }
 * --> 조건식이 참일 경우에만 ... 실행문이 실행 됩니다.
 * b. if(조건식) {
 * 	... 실행문
 * } else {
 * 	... 실행문
 * }
 * c. if(조건식) {
 * 	... 실행문
 * } else if(조건식) {
 * 	... 실행문
 * } .... else {
 * 	... 실행문
 * }
 * 
 */
public class ConditionExample {

	public static void main(String[] args) {
		
		int gainedPoint = Integer.parseInt(args[0]);
		
		System.out.println("당신이 얻은 점수는 " + gainedPoint + "점 입니다.");
		
		
		if( gainedPoint >= 90 ) {	// gainedPoint >= 90이 참일 때만 실행
			System.out.println("입사하세요.");
		} else if(gainedPoint >= 80) {
			System.out.println("인턴 3개월");
		} else if(gainedPoint >= 70) {
			System.out.println("추가 합격");
		} else {
			System.out.println("집에 가세요");
		}
	
		//---
		// 1. 나이가 6세 이상
		// 2. 키가 120이상
		// 3. 심장병이 없을 때
		int age = 6;
		int height = 120;
		boolean heartDease = false;
		
		if( age >= 6 && height >=120 && !heartDease ) {
			System.out.println("타라");
		} else {
			System.out.println("못타");
		}
		
		if(age >= 6) {
			if(height >= 120) {
				if(!heartDease) {
					System.out.println("탑승 가능합니다.");
				} else {
					System.out.println("심장병 때문에 탈 수 없어요.");
				}
			} else {
				System.out.println("키가 낮아서 탈 수 없어요.");
			}
		} else { 
			System.out.println("나이가 어려서 탈 수 없어요.");
		}
	}
}
