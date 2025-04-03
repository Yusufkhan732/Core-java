package Com_Rays_Dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestUpdateDynamic {

	public static void main(String[] args) throws Exception {
		// testUpdate1();
		// testUpdate2();
		// testUpdate3(6, "farhan", 66666, 77, 98, 88);

		StudentBean bean = new StudentBean();
		bean.setId(5);
		bean.setName("kohli");
		bean.setRollNo(119);
		bean.setPhysics(66);
		bean.setChemistry(88);
		bean.setMaths(88);

		testUpdate4(bean);

	}

	public static void testUpdate1() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement st = cn.prepareStatement(
				"update student set name ='Yusuf',rollno =32222, physics =66,chemistry =44,maths =99 where id = 7 ");

		int i = st.executeUpdate();

		System.out.println("data inserted" + i);
	}

	public static void testUpdate2() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement pr = cn.prepareStatement(
				"update student set  name = ?, rollno = ?,physics =?,chemistry = ?,maths = ? where id = ?");

		pr.setString(1, "Ayan");
		pr.setInt(2, 55554);
		pr.setInt(3, 77);
		pr.setInt(4, 66);
		pr.setInt(5, 99);
		pr.setInt(6, 1);
		int i = pr.executeUpdate();
		System.out.println("data inserted=>" + i);

	}

	public static void testUpdate3(int id, String name, int rollno, int physics, int chemistry, int maths)
			throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement ps = cn.prepareStatement(
				"update student set name = ?, rollno = ?,physics =?,chemistry = ?,maths = ? where id =?");

		ps.setString(1, name);
		ps.setInt(2, rollno);
		ps.setInt(3, physics);
		ps.setInt(4, chemistry);
		ps.setInt(5, maths);
		ps.setInt(6, id);
		int i = ps.executeUpdate();
		System.out.println(" data inserted=>" + i);
	}

	public static void testUpdate4(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"update student set name = ? ,rollno = ?,physics = ?,chemistry = ?,maths = ? where id = ?");
		
		ps.setString(1, bean.getName());
		ps.setInt(2, bean.getRollNo());
		ps.setInt(3, bean.getPhysics());
		ps.setInt(4, bean.getChemistry());
		ps.setInt(5, bean.getMaths());
		ps.setInt(6, bean.getId());

		int i = ps.executeUpdate();

		System.out.println("data updated => " + i);

	}
}