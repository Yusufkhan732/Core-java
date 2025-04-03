package Com_Rays_Stmnt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		Statement st = con.createStatement();

		int i = st.executeUpdate("insert into marksheet values(3,'hamza',45,49,12)");

		int i1 = st.executeUpdate("insert into marksheet values(4,'haris',89,69,72)");

		int i2 = st.executeUpdate("insert into marksheet values(5,'hamad',55,59,92)");

		System.out.println("data inserted-" + i + i1 + i2);

	}
}
