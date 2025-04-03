package Com_Rays_Marksheet_;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Com_Rays_Dynamic.StudentBean;

public class MarksheetModel {

	public Integer nextpk() throws Exception {

		int pk = 0;

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement pr = cn.prepareStatement("select max(id)  from student");

		ResultSet rs = pr.executeQuery();
		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(StudentBean bean) throws Exception {

		int pk = nextpk();

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pr = cn.prepareStatement("insert into student values(?,?,?,?,?,?)");

		pr.setInt(1, pk);
		pr.setString(2, bean.getName());
		pr.setInt(3, bean.getRollNo());
		pr.setInt(4, bean.getPhysics());
		pr.setInt(5, bean.getChemistry());
		pr.setInt(6, bean.getMaths());

		int i = pr.executeUpdate();

		System.out.println("data inserted=>" + i);
	}

	public void update(StudentBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		PreparedStatement pr = cn.prepareStatement(
				"update student set name = ?,rollno = ?,physics = ?,chemistry = ?,maths = ? where id = ?");
		pr.setString(1, bean.getName());
		pr.setInt(2, bean.getRollNo());
		pr.setInt(3, bean.getPhysics());
		pr.setInt(4, bean.getChemistry());
		pr.setInt(5, bean.getMaths());
		pr.setInt(6, bean.getId());
		int i = pr.executeUpdate();
		System.out.println("data updated");
	}

	public void delete(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement pr = cn.prepareStatement("delete  from student where id = ?");

		pr.setInt(1, id);
		int i = pr.executeUpdate();
		System.out.println("data delete=>" + i);
	}

	public StudentBean findByPk(int id) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
		PreparedStatement pr = cn.prepareStatement("select * from student where id = ?");

		pr.setInt(1, id);

		ResultSet rs = pr.executeQuery();

		StudentBean bean = null;

		while (rs.next()) {
			bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollNo(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
		}
		return bean;

	}

	public List search(StudentBean bean, int pageno, int pagesize) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

		StringBuffer sql = new StringBuffer("select * from student where 1=1 ");

		if (bean != null) {

			if (bean.getId() > 0) {

				sql.append(" and id = " + bean.getId());

			}
			if (bean.getName() != null && bean.getName().length() > 0) {

				sql.append(" and name = '" + bean.getName() + "'");
			}
		}
		if (pagesize > 0) {

			pageno = (pageno - 1) * pagesize;
			sql.append(" limit " + pageno + "," + pagesize);

		}

		PreparedStatement pr = cn.prepareStatement(sql.toString());

		ResultSet rs = pr.executeQuery();

		List list = new ArrayList();

		while (rs.next()) {
			bean = new StudentBean();
			bean.setId(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setRollNo(rs.getInt(3));
			bean.setPhysics(rs.getInt(4));
			bean.setChemistry(rs.getInt(5));
			bean.setMaths(rs.getInt(6));
			list.add(bean);
		}
		return list;
	}
}