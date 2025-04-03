package Com_Rays_pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestNextPk {

	public static void main(String[] args) throws Exception {

		int pk = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement("select max(id) from student");

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			pk = rs.getInt(1);

		}
		System.out.println(pk + 1);
	}

}
