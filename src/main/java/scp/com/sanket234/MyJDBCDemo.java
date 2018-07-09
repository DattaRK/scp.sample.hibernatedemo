package scp.com.sanket234;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBCDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","Rahul_123");
	Statement st=con.createStatement();
	st.execute("select * from Stud");
	
	ResultSet rs=st.executeQuery("select * from Stud");
	
	while(rs.next()) {
		 int id  = rs.getInt(1);
       
         String name = rs.getString(2);
       
         System.out.print("\nID: " + id);
        
         System.out.print(", Name: " + name);
    
		
	}
	
	}
}


class L{
	
}