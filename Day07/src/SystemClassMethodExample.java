import java.lang.*;
import java.util.Enumeration;
import java.util.Properties;

public class SystemClassMethodExample {

	public static void main(String[] args) {
		
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("os.arch"));
		
		System.out.println("-----------------------------------------------");
		
		//-- 사용자 컴퓨터의 환경변수를 출력
		for(String var : System.getenv().keySet()) {
			System.out.println(var + "=" + System.getenv(var));
		}
		
		System.out.println("-----------------------------------------------");
		
		//-- java에서 지원하는 Properties를 사용하는 방식
		Properties prop = System.getProperties();
		Enumeration en  = prop.propertyNames();
		while(en.hasMoreElements()) {
			
		}
		
		
		
		
	//prop.forEach
		
	}
}