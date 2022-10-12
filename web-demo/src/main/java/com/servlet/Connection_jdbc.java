package com.servlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
public class Connection_jdbc{
	Connection con;
	static int val=100;
	 public Connection_jdbc() throws SQLException
	 {
		 this.con=getConnection();
	 }
      public  Connection getConnection() throws SQLException {
    			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    			String url="jdbc:oracle:thin:@localhost:1521/orcl.iiht.tech";
    			String userName="system";
    			String password="system";
    			 con=DriverManager.getConnection(url,userName,password);
    		   	  return con;
      }
	  public void insert(Student s) throws SQLException {
		  ++val;
          PreparedStatement ps=con.prepareStatement("insert into student_login values(?,?,?)");
          ps.setInt(1,val); 
          ps.setString(2,s.getName()); 
          ps.setString(3,s.getPass());
          ps.executeUpdate();
          ps.close();
	  }
	 public boolean check(String name, String pass) throws SQLException
	 {
		 String s="select * from student_login";
		 PreparedStatement ps=con.prepareStatement(s);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
			 if(set.getString(2).equals(name)&&set.getString(3).equals(pass))
				 return true;
		 }
		 return false;
	 }
	 public ArrayList<Course_data> getCourse() throws SQLException {
		 ArrayList<Course_data> list=new ArrayList<Course_data>();
		 String s="select * from course";
		 PreparedStatement ps=con.prepareStatement(s);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
			 list.add(new Course_data(set.getString(1),set.getString(2),set.getString(3),set.getInt(4)));
		 }
		 return list;
	 }

}
