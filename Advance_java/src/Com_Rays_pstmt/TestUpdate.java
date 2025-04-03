package Com_Rays_pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUpdate {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement("update student set rollno = 45333 where id = 4");
		int i = st.executeUpdate();
		System.out.println("data update=>" + i);
	}

}
