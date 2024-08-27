package jdbc;
import java.sql.*;

public class MyConnection {
	public void insertQuery() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		       Driver myDriver = new com.mysql.jdbc.Driver();
		       DriverManager.registerDriver(myDriver);
		       String url = "jdbc:mysql://localhost:3306/sakila";
		       String UserName = "root";
		       String Password = "root";
		       Connection con = DriverManager.getConnection(url, UserName, Password) ;        
		       Statement statement = con.createStatement();
		       
		       String MyQueryString = "insert into city values(609, 'Malegaon', 95, '2024-08-14 10:00:00');";
		       
		       statement.executeUpdate(MyQueryString);
		       System.out.println("Query executed successfuly");
		       con.close();

		}catch(Exception e){
			System.out.println("Exe " + e);
		}
		
	}
	
	
	public void updateQuery() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		       Driver myDriver = new com.mysql.jdbc.Driver();
		       DriverManager.registerDriver(myDriver);
		       String url = "jdbc:mysql://localhost:3306/sakila";
		       String UserName = "root";
		       String Password = "root";
		       Connection con = DriverManager.getConnection(url, UserName, Password) ;        
		       Statement statement = con.createStatement();
		       
		       String MyQueryString = "update city set city = 'nagardevala-1' where city_id=603 ";
		       
		       statement.executeUpdate(MyQueryString);
		       System.out.println("Query executed successfuly");
		       con.close();

		}catch(Exception e){
			System.out.println("Exe " + e);
		}
		
	}

	public static void main(String[] args) {
	
		MyConnection cd = new MyConnection();
//		 cd.insertQuery();
		 cd.updateQuery();
	}

}
