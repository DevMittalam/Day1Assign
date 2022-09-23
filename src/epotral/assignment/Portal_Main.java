package epotral.assignment;

import java.util.Scanner;

public class Portal_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Operations op=new Operations();
			while(true)
			{
			System.out.println("Welcome to eportal");
			System.out.println("1.Add Course");
			System.out.println("2.Add Student");
			System.out.println("3.View Courses");
			System.out.println("4.Enroll a course");
			System.out.println("5.View Courses enrolled Student");
			System.out.println("6.Exit");
		    int n=sc.nextInt();
		    if(n==1)
		    {
		    	try {
		    	System.out.println("Enter Course id");
		    	int id=sc.nextInt();
		    	System.out.println("Enter Course name");
		    	String s=sc.next();
		    	System.out.println("Enter desciption");
		    	sc.nextLine();
		    	String dep=sc.nextLine();
		    	op.addCourse(id,s,dep);
		    	System.out.println("Course add Successfully");
		    	}
		    	catch(Exception exp)
		    	{
		    		System.out.println("Please Enter valid input");
		    	}
		    }
		    else if(n==2)
		    {
		    	try {
		    		System.out.println("Enter Student Name");
		    		String name=sc.next();
		    		System.out.println("Enter id");
		    		int id=sc.nextInt();
		    		System.out.println("Enter Student city ");
		    		String ad=sc.next();
		    		System.out.println("Enter department");
		    		String dep=sc.next();
		    		op.addStudent(name,id,ad,dep);
		    	}
		    	catch(Exception exp2)
		    	{
		    		System.out.println("Please Enter valid input");
		    	}
		    }
		    else if(n==3)
		    {
		    	op.displayCourse();
		    }
		    else if(n==4)
		    {
		    	try {
		    		System.out.println("Enter student id");
		    		int id=sc.nextInt();
		    		System.out.println("Enter Course id");
		    		int cid=sc.nextInt();
		    		op.enrolls(id,cid);
		    	}
		    	catch(Exception e) {
		    	  e.printStackTrace();
		         }
		    }
		    else if(n==5)
		    {
		    	try {
		    		System.out.println("Enter course id");
		    		int id=sc.nextInt();
		    		op.displayCourse(id);
		    	}
		    	catch(Exception e)
		    	{
		    		e.printStackTrace();
		    	}
		    }
		    else {
		    	break;
		    }
		  }
			System.out.println("Thank You");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
