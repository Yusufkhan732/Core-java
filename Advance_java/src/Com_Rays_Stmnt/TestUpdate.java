package Com_Rays_Stmnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Statement st = cn.createStatement();

		int i = st.executeUpdate("update marksheet set name = 'haseem' where id = 3");

		System.out.println("data updated" + i);

	}
}
