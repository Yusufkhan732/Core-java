package com.rays.advance.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTransactionHandling2 {

	public static void main(String[] args) throws Exception {
		Connection cn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");

			Statement st = cn.createStatement();
			int i = st.executeUpdate("insert into student values (55,'sonu',212,22,33,44)");
			i = st.executeUpdate("insert into student values(76,'rrr',231,33,55,66)");

			System.out.println("data inserted=>" + i);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {
			cn.close();

		}
	}

}
