package Com_Rays_Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestDeleteDynamic {

	public static void main(String[] args) throws Exception {
		testDelete1() ;
		testDelete2();
		testDelete3(6);

	}

	public static void testDelete1() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement("delete from student where id = 1");

		int i = st.executeUpdate();

		System.out.println("data deleted" + i);
	}

	public static void testDelete2() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement pr = cn.prepareStatement("delete from student where id=?");

		pr.setInt(1, 1);
		int i = pr.executeUpdate();
		System.out.println("data deleted=>" + i);

	}

	public static void testDelete3(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement ps = cn.prepareStatement("delete from student where id =?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();
		System.out.println(" data deleted=>" + i);
	}

}
