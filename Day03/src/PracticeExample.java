
public class PracticeExample {

	public static void main(String[] args) {
		
		boolean result;
		int age = 27;
		int height = 175;
		boolean hearchDease = false;
		
		result = age >= 6 && height >= 120 && (hearchDease == false);
		
		String result1;
		result1 = result == true ? "탑승 가능합니다" : "탑승 불가능합니다.";
		System.out.println(result1);
	}
}
