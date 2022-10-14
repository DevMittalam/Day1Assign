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
          PreparedStatement ps=con.prepareStatement("insert into details values(?,?,?,?,?,?)");
          ps.setString(1,s.getName()); 
          ps.setString(2,s.getEmail()); 
          ps.setString(3,s.getNumber());
          ps.setInt(5,s.getAge());
          ps.setString(4,s.getPass());
          ps.setString(6,s.getType());
          ps.executeUpdate();
          ps.close();
	  }
	  public String check(String name,String pass) throws SQLException {
		  String t="invalid";
		  String s="select * from details";
			 PreparedStatement ps=con.prepareStatement(s);
			 ResultSet set=ps.executeQuery();
			 while(set.next())
			 {
				 if(set.getString(1).equals(name)&&set.getString(4).equals(pass))
				 {
					 if(set.getString(6).equalsIgnoreCase("user"))
						 return "user";
					 else
						 return "admin";
				 }
			 }
			 return t;
	  }
	 public Student getCourse(String name,String pass) throws SQLException {
//		 ArrayList<Course_data> list=new ArrayList<Course_data>();
	//	 String s="select * from details ";
		 Student s = null;
		 PreparedStatement ps=con.prepareStatement("select * from details where name=? and password=?");
		 ps.setString(1,name);
		 ps.setString(2,pass);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
	       s=new Student(set.getString(1),set.getString(2),set.getString(3),set.getInt(5),set.getString(4),set.getString(6));
		 }
		 ps.close();
		 return s;
	 }
	 public ArrayList<Student> getAll() throws SQLException {
		 ArrayList<Student> list=new ArrayList<Student>();
		 String s="select * from details ";
		 PreparedStatement ps=con.prepareStatement(s);
		 ResultSet set=ps.executeQuery();
		 while(set.next())
		 {
	       list.add(new Student(set.getString(1),set.getString(2),set.getString(3),set.getInt(5),set.getString(4),set.getString(6)));
		 }
		 return list;
	 }

}
