package Com_Rays_Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestInsertDynamic {

	public static void main(String[] args) throws Exception {
		testInsert1();
//		testInsert2();
//	testInsert3(1, "nikita", 4334, 45, 34, 48);

		StudentBean bean = new StudentBean();
		bean.setId(7);
		bean.setName("adi");
		bean.setRollNo(36633);
		bean.setPhysics(77);
		bean.setChemistry(67);
		bean.setMaths(89);

		//testInsert4(bean);

	}

	public static void testInsert1() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement("insert into student values(2, 'Haseem',23333,76,90,80)");

		int i = st.executeUpdate();

		System.out.println("data inserted" + i);
	}

	public static void testInsert2() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement pr = cn.prepareStatement("insert into student values (?,?,?,?,?,?)");

		pr.setInt(1, 3);
		pr.setString(2, "subham");
		pr.setInt(3, 5667);
		pr.setInt(4, 47);
		pr.setInt(5, 67);
		pr.setInt(6, 50);
		int i = pr.executeUpdate();
		System.out.println("data inserted=>" + i);

	}

	public static void testInsert3(int id, String name, int rollno, int hindi, int english, int chemistry)
			throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement ps = cn.prepareStatement("insert into student values(?,?,?,?,?,?)");

		ps.setInt(1, id);
		ps.setNString(2, name);
		ps.setInt(3, 7799);
		ps.setInt(4, hindi);
		ps.setInt(5, english);
		ps.setInt(6, chemistry);

		int i = ps.executeUpdate();
		System.out.println(" data inserted=>" + i);

	}

	public static void testInsert4(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pr = cn.prepareStatement("insert into student values(?,?,?,?,?,?)");
		pr.setInt(1, bean.getId());
		pr.setString(2, bean.getName());
		pr.setInt(3, bean.getRollNo());
		pr.setInt(4, bean.getPhysics());
		pr.setInt(6, bean.getChemistry());
		pr.setInt(5, bean.getMaths());

		int i = pr.executeUpdate();
		System.out.println("data inserted");

	}
}
