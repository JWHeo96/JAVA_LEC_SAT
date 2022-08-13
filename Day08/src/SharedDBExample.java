import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SharedDBExample {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		// ClassNotFoundException 발생가능
		
		Connection conn = null;
		
		conn = DriverManager.getConnection(
				"jdbc:mysql://javalec-sat.crwq4oaekhum.ap-northeast-2.rds.amazonaws.com:3306/eidhk7_db",
				"eidhk7",
				"eidhk71234"
				);
		
		if(conn == null) {
			System.out.println("연결이 안됐습니다.");
		} else {
			System.out.println("연결이 됐습니다.");
		}

	}
}
