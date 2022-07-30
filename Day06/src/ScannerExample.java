import java.util.Scanner;

public class ScannerExample
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		System.out.println("입력 값 : " + input + "입니다.");
		
		//-------------
		
		int width, height;

		while(true) {
		
			System.out.println("가로길이를 입력하세요 : ");
		width = Integer.parseInt(sc.nextLine());
		System.out.println("세로길이를 입력하세요 : ");
		height = Integer.parseInt(sc.nextLine());
		
		Rectangle rc = new Rectangle(width, height);
		
		System.out.println("shpae is " + rc.type);
		System.out.println("사각형의 가로는 " + width + ", 세로는 " + height +"입니다.");
		System.out.println("사각형의 면적은 " + rc.area());
		System.out.println("사각형의 길이는 " + rc.length() + "입니다.");
		System.out.println("-------------------------------------");
		System.out.println("프로그램을 종료하시겠습니까? ( Y / N ) ");
		System.out.println("-------------------------------------");
		String command = sc.nextLine();
		if(command.equals("Y")) {break;}
		System.out.println("-------------------------------------");
		}
	}
}
