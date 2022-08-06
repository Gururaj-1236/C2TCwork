import java.sql.*;

import java.util.*;
public class Connectiontosql {
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/jdbccon";
		String user="root";
		String pwd="root";
		int usrid=sc.nextInt();
		String name=sc.next();
		
		String query="INSERT INTO user VALUES (?,?)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection(url,user,pwd);
		PreparedStatement statement=connection.prepareStatement(query);
		statement.setInt(1, usrid);
		statement.setString(2, name);
		int count=statement.executeUpdate();
		System.out.println("no of rows afffected "+count);
		
		statement.close();
		connection.close();
		sc.close();
	}

}
