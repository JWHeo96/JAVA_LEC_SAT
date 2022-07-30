
public class Application01 {

	public static void main(String[] args) {
		
		ParentExample ex = new ParentExample("허장욱", 2);
		ex.printMyInfo();
		System.out.println("");
		
		ParentExample ex2 = new ParentExample();
		ex2.printMyInfo();
		System.out.println("");
		
		ChildExample cx = new ChildExample("haakhaak");
		cx.printMyInfo();

		
		
	}
}
