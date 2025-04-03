package Com_Rays_pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TerstInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement("insert into student values(5,'Naseeb',67333,36,27,38)");
		
		int i = st.executeUpdate();


		System.out.println("data inserted=>" + i);
	}
}
