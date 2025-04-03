package com.rays.advance.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransactionHandling {
	
	public static void main(String[] args) throws SQLException {

		Connection cn = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

			cn.setAutoCommit(false);

			Statement st = cn.createStatement();

			int i = st.executeUpdate("insert into student values(77,'rohit',321,33,44,55)");
			i = st.executeUpdate("insert into student values(79,'rohit',321,33,44,55)");
			i = st.executeUpdate("insert into student values(67,'rohit',321,33,44,55)");

			System.out.println(" data inserted=> " + i);
			cn.commit();

		} catch (Exception e) {

			cn.rollback();

			System.out.println(" Exception " + e.getMessage());

		} finally {

			cn.close();
		}
	}

}