package Com_Rays_pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestRead {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement("select * from student");

		ResultSet rs = st.executeQuery();
		while (rs.next()) {

			System.out.print("\t" + rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.println("\t" + rs.getInt(5));

		}
	}
}
