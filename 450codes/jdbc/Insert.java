package myjdbc;

import java.sql.*;

public class Insert {

	public void createTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			// String url = "jdbc:mysql://localhost:3306/students";
			// String UserName = "root";
			// String Password = "root";
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
			Statement statement = con.createStatement();

			String MyQueryString = "Create table if not exists student1(name varchar(30),age int, address varchar(30) )";

			statement.executeUpdate(MyQueryString);
			System.out.println("table created successfuly");
			con.close();

		} catch (Exception e) {
			System.out.println("Exe " + e);
		}

	}

	public void insertData() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver myDriver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(myDriver);
			String url = "jdbc:mysql://localhost:3306/students";
			String UserName = "root";
			String Password = "root";
			Connection con = DriverManager.getConnection(url, UserName, Password);
			Statement stmt = con.createStatement();
			String query = "Insert into student1 values('Piyush',23,'Hirawadi Panchavati')";
			stmt.executeUpdate(query);
			System.out.println("Data inserted successfuly");
			con.close();

		} catch (Exception e) {
			System.out.println("Exe " + e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insert id = new Insert();
		id.createTable();
		id.insertData();

	}

}
