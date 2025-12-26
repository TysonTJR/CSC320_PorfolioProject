package PortfolioProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* Use try(Connection connect = ContactProgram.DBConnection()){
System.out.println("Connection success");
}catch(SQLException e) {
System.out.println("Error connecting to DB");
} to create a database connection to query data*/

public class ContactProgram  {
	private static String jdbcURl = "jdbc:postgresql://localhost:5432/VehicleInventory" ;
	private static String username =  System.getenv("DB_USER");
	private static String password = System.getenv("DB_PASSWORD");
	
	public ContactProgram() {
		
		
	}
	

	public static Connection DBConnection() throws SQLException  {
		
			
			return DriverManager.getConnection(jdbcURl, username, password);
		
		
		
		}
	}
	