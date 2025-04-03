package Com_Rays_Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestReadDynamic {

	public static void main(String[] args) throws Exception {
		// testRead1();
		// testRead2();
		// testRead3(1, null, 0, 0, 0);

		StudentBean bean = new StudentBean();

		bean.setId(0);
		bean.setName(null);
		bean.setRollNo(0);
		bean.setPhysics(0);
		bean.setChemistry(0);
		bean.setMaths(99);

		// testRead4(bean);
		testRead5(bean);

	}

	public static void testRead1() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pr = cn.prepareStatement("select * from student");

		ResultSet rs = pr.executeQuery();
		while (rs.next()) {

			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

	}

	public static void testRead2() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		String sql = "select * from student";

		// String sql = "selcet * from student where id = 1";
		// String sql = "select * from student where name like = 'A'";
		// String sql = "select * from student where rollno = 109";
		// String sql = "select * from student where physics = 66";
		// String sql = "select * from student where chemistry";
		// String sql = "select * from student where maths";
		System.out.println("sql=>" + sql);

		PreparedStatement pr = cn.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

	}

	public static void testRead3(int id, String name, int physics, int chemistry, int maths) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		String sql = "select * from student";

		if (id > 0) {
			sql += " where id = " + id;

		}
		if (name != null) {

			sql += " where name = " + name;

		}
		if (physics > 0) {
			sql += " where physics = " + physics;

		}
		if (chemistry > 0) {
			sql += " where chemistry = " + chemistry;

		}
		if (maths > 0) {
			sql += " where maths = " + maths;

		}
		PreparedStatement pr = cn.prepareStatement(sql);
		ResultSet rs = pr.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getInt(3));
			System.out.print("\t" + rs.getInt(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.println("\t" + rs.getInt(6));

		}

	}

	public static void testRead4(StudentBean bean) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		String sql = "select * from student";

		if (bean != null) {
			if (bean.getId() > 0) {
				sql += " where id = " + bean.getId();

			}
			if (bean.getName() != null) {
				sql += " where name = " + bean.getName();

			}
			if (bean.getPhysics() > 0) {
				sql += " where physics = " + bean.getPhysics();

			}
			if (bean.getChemistry() > 0) {
				sql += " where chemistry=" + bean.getChemistry();

			}
			if (bean.getMaths() > 0) {
				sql += " where maths = " + bean.getMaths();

			}
			System.out.println("sql=>" + sql);

			PreparedStatement pr = cn.prepareStatement(sql);

			ResultSet rs = pr.executeQuery();

			while (rs.next()) {

				System.out.print(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getInt(3));
				System.out.print("\t" + rs.getInt(4));
				System.out.print("\t" + rs.getInt(5));
				System.out.println("\t" + rs.getInt(6));

			}
		}

	}

	public static void testRead5(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		StringBuffer sql = new StringBuffer("select * from student where 1=1");

		if (bean != null) {
			if (bean.getId() > 0) {
				sql.append(" and id = " + bean.getId());

			}
			if (bean.getName() != null && bean.getName().length() > 0) {
				sql.append(" and name = '" + bean.getName() + "'");

			}
			if (bean.getPhysics() > 0) {
				sql.append(" and physics = " + bean.getPhysics());

			}
			if (bean.getChemistry() > 0) {
				sql.append(" and chemistry = " + bean.getChemistry());

			}
			if (bean.getMaths() > 0) {
				sql.append(" and maths = " + bean.getMaths());

			}
			System.out.println("sql=> " + sql);

			PreparedStatement pr = cn.prepareStatement(sql.toString());

			ResultSet rs = pr.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.print("\t" + rs.getInt(3));
				System.out.print("\t" + rs.getInt(4));
				System.out.print("\t" + rs.getInt(5));
				System.out.println("\t" + rs.getInt(6));

			}
		}
	}
}
